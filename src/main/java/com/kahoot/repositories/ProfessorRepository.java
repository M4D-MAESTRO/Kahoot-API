package com.kahoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kahoot.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{

}
