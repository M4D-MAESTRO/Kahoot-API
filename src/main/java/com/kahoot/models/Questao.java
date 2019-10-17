package com.kahoot.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Questao implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idQuestao;
	private String pergunta;

	private String alternativaErrada1;
	private String alternativaErrada2;
	private String alternativaErrada3;
	private String alternativaCerta;

	private String feedBackErrada1;
	private String feedBackErrada2;
	private String feedBackErrada3;
	private String feedBackCerta;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "questionario_id")
	private Questionario questionario;

	public Questao() {
		super();
	}

	public Questao(Integer idQuestao, String pergunta, String alternativaErrada1, String alternativaErrada2,
			String alternativaErrada3, String alternativaCerta, String feedBackErrada1, String feedBackErrada2,
			String feedBackErrada3, String feedBackCerta, Questionario questionario) {
		super();
		this.idQuestao = idQuestao;
		this.pergunta = pergunta;
		this.alternativaErrada1 = alternativaErrada1;
		this.alternativaErrada2 = alternativaErrada2;
		this.alternativaErrada3 = alternativaErrada3;
		this.alternativaCerta = alternativaCerta;
		this.feedBackErrada1 = feedBackErrada1;
		this.feedBackErrada2 = feedBackErrada2;
		this.feedBackErrada3 = feedBackErrada3;
		this.feedBackCerta = feedBackCerta;
		this.questionario = questionario;
	}

	public Integer getIdQuestao() {
		return idQuestao;
	}

	public void setIdQuestao(Integer idQuestao) {
		this.idQuestao = idQuestao;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getAlternativaErrada1() {
		return alternativaErrada1;
	}

	public void setAlternativaErrada1(String alternativaErrada1) {
		this.alternativaErrada1 = alternativaErrada1;
	}

	public String getAlternativaErrada2() {
		return alternativaErrada2;
	}

	public void setAlternativaErrada2(String alternativaErrada2) {
		this.alternativaErrada2 = alternativaErrada2;
	}

	public String getAlternativaErrada3() {
		return alternativaErrada3;
	}

	public void setAlternativaErrada3(String alternativaErrada3) {
		this.alternativaErrada3 = alternativaErrada3;
	}

	public String getAlternativaCerta() {
		return alternativaCerta;
	}

	public void setAlternativaCerta(String alternativaCerta) {
		this.alternativaCerta = alternativaCerta;
	}

	public String getFeedBackErrada1() {
		return feedBackErrada1;
	}

	public void setFeedBackErrada1(String feedBackErrada1) {
		this.feedBackErrada1 = feedBackErrada1;
	}

	public String getFeedBackErrada2() {
		return feedBackErrada2;
	}

	public void setFeedBackErrada2(String feedBackErrada2) {
		this.feedBackErrada2 = feedBackErrada2;
	}

	public String getFeedBackErrada3() {
		return feedBackErrada3;
	}

	public void setFeedBackErrada3(String feedBackErrada3) {
		this.feedBackErrada3 = feedBackErrada3;
	}

	public String getFeedBackCerta() {
		return feedBackCerta;
	}

	public void setFeedBackCerta(String feedBackCerta) {
		this.feedBackCerta = feedBackCerta;
	}

	public Questionario getQuestionario() {
		return questionario;
	}

	public void setQuestionario(Questionario questionario) {
		this.questionario = questionario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idQuestao == null) ? 0 : idQuestao.hashCode());
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
		Questao other = (Questao) obj;
		if (idQuestao == null) {
			if (other.idQuestao != null)
				return false;
		} else if (!idQuestao.equals(other.idQuestao))
			return false;
		return true;
	}

}
