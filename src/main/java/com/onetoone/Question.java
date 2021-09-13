package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity

public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;

	private String question;
	
	
	//Mapped by ----Extra col nahi banegi
	//Woh samne wale ko responsibility de dega
	
	@OneToOne
//	@JoinColumn(name="ans_id")
	@PrimaryKeyJoinColumn
	private Answer answer;

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
}
