package com.kahoot.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Questionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idQuestionario;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "questionario_id")
	private List<Questao> questoes = new ArrayList<>();

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "professor_id")
	private Professor professor;

	public Questionario() {
		super();
	}

	public Questionario(Integer idQuestionario, List<Questao> questoes, Professor professor) {
		super();
		this.idQuestionario = idQuestionario;
		this.questoes = questoes;
		this.professor = professor;
	}

	public Integer getIdQuestionario() {
		return idQuestionario;
	}

	public void setIdQuestionario(Integer idQuestionario) {
		this.idQuestionario = idQuestionario;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idQuestionario == null) ? 0 : idQuestionario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questionario other = (Questionario) obj;
		if (idQuestionario == null) {
			if (other.idQuestionario != null)
				return false;
		} else if (!idQuestionario.equals(other.idQuestionario))
			return false;
		return true;
	}

}
