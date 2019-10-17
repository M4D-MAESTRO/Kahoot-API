package com.kahoot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kahoot.models.Questionario;
import com.kahoot.models.dto.NewQuestionarioDTO;
import com.kahoot.servicies.QuestionarioService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/questionario")
public class QuestionarioController {

	@Autowired
	private QuestionarioService service;

	@GetMapping
	public ResponseEntity<?> getAll() {
		List<Questionario> questionarios = service.getAll();
		return ResponseEntity.ok(questionarios);
	}

	@GetMapping("/professor/{id}")
	public ResponseEntity<?> getAllByProfessor(@PathVariable Integer id) {
		List<Questionario> questionarios = service.getAllByProfessor(id);
		return ResponseEntity.ok(questionarios);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Integer id) {
		Optional<Questionario> questionario= service.findById(id);
		
		if(questionario.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(questionario.get());
	}

	@PostMapping
	public ResponseEntity<?> insert(@RequestBody NewQuestionarioDTO dto) {
		Questionario questionario = service.insert(dto);
		return ResponseEntity.ok(questionario);
	}

}
