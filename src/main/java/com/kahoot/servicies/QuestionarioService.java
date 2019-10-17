package com.kahoot.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kahoot.models.Professor;
import com.kahoot.models.Questionario;
import com.kahoot.models.dto.NewQuestionarioDTO;
import com.kahoot.repositories.ProfessorRepository;
import com.kahoot.repositories.QuestaoRepository;
import com.kahoot.repositories.QuestionarioRepository;

@Service
public class QuestionarioService {
	
	@Autowired
	private QuestionarioRepository questionarioRepo;
	
	@Autowired
	private QuestaoRepository questaoRepo;
	
	@Autowired
	private ProfessorRepository professorRepo;

	public List<Questionario> getAll(){
		return questionarioRepo.findAll();
	}

	public List<Questionario> getAllByProfessor(Integer id) {
		return questionarioRepo.findAllByProfessorIdProfessor(id);
	}
	
	public Optional<Questionario> findById(Integer id){
		return questionarioRepo.findById(id);
	}
	
	public Questionario insert(NewQuestionarioDTO dto) {
		return fromDTO(dto);
	}
	
	private Questionario fromDTO(NewQuestionarioDTO dto) {
		Professor professor = professorRepo.findById(dto.getIdProfessor()).get();
		Questionario questionario = new Questionario(null, dto.getQuestoes(), professor);
		questionario = questionarioRepo.save(questionario);
		return questionario;
	}
	
	
}
