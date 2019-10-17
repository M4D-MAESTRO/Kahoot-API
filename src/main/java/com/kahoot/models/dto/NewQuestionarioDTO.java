package com.kahoot.models.dto;

import java.util.ArrayList;
import java.util.List;

import com.kahoot.models.Questao;

public class NewQuestionarioDTO {

	private Integer idProfessor;
	private List<Questao> questoes = new ArrayList<>();

	public NewQuestionarioDTO() {
		super();
	}

	public NewQuestionarioDTO(Integer idProfessor, List<Questao> questoes) {
		super();
		this.idProfessor = idProfessor;
		this.questoes = questoes;
	}

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

}
