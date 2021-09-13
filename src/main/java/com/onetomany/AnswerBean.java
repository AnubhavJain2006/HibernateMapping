package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class AnswerBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answerId;
	private String answer;
	@ManyToOne
	private QuestionBean question;
	
	
	public QuestionBean getQuestion() {
		return question;
	}
	public void setQuestion(QuestionBean question) {
		this.question = question;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
