package com.kahoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kahoot.models.Questao;

@Repository
public interface QuestaoRepository extends JpaRepository<Questao, Integer>{

}
