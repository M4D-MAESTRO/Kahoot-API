package com.kahoot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kahoot.models.Questionario;

@Repository
public interface QuestionarioRepository extends JpaRepository<Questionario, Integer>{
	
	List<Questionario> findAllByProfessorIdProfessor(Integer id);

}
