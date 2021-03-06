package com.wanda.data.questionsheet;

import java.util.Vector;


/**
 * data object representing a question
 * @author Sascha Haseloff
 *
 */
public class Question {

	private int position; // starting with 1!

	private String questionText;
	
	private QuestionType type;
	
	private Vector<UserAnswer> userAnswers = null;
	
	public Vector<UserAnswer> getUserAnswers() {
		return userAnswers;
	}


	public void setUserAnswers(Vector<UserAnswer> userAnswers) {
		this.userAnswers = userAnswers;
	}


	public QuestionType getType() {
		return type;
	}

	
	public Question() {
	}
	
	public Question(QuestionType type){
		this.type=type;
	}
	
	public Question(int position, String questionText) {
		super();
		this.position = position;
		this.questionText = questionText;
	}
	public int getPosition() {
		return position;
	}
	public String getQuestionText() {
		return questionText;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	public void setType(String typeString){
		if (typeString.toLowerCase().equals("rating")){
			type = QuestionType.RATING;
		} else if (typeString.toLowerCase().equals("multiple_choice")){
			type = QuestionType.MULTIPLE_CHOICE;
		}
	}

	
	
	
}
