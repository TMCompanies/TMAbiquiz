package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Question
{
	@Element
	int questionID;
	
	@Element
	private Subject subject;
	
	@Element
	private Question question;
	
	@Element
	private String answerA; //Answer A is always the correct answer
	
	@Element
	private String answerB;
	
	@Element
	private String answerC;
	
	@Element
	private String answerD;
	
	public Question()
	{
		
	}

	public Question(int questionID, Subject subject, Question question,	String answerA, String answerB, String answerC, String answerD)
	{
		this.questionID = questionID;
		this.subject = subject;
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
	}

	public int getQuestionID()
	{
		return questionID;
	}

	public void setQuestionID(int questionID)
	{
		this.questionID = questionID;
	}

	public Subject getSubject()
	{
		return subject;
	}

	public void setSubject(Subject subject)
	{
		this.subject = subject;
	}

	public Question getQuestion()
	{
		return question;
	}

	public void setQuestion(Question question)
	{
		this.question = question;
	}

	public String getAnswerA()
	{
		return answerA;
	}

	public void setAnswerA(String answerA)
	{
		this.answerA = answerA;
	}

	public String getAnswerB()
	{
		return answerB;
	}

	public void setAnswerB(String answerB)
	{
		this.answerB = answerB;
	}

	public String getAnswerC()
	{
		return answerC;
	}

	public void setAnswerC(String answerC)
	{
		this.answerC = answerC;
	}

	public String getAnswerD()
	{
		return answerD;
	}

	public void setAnswerD(String answerD)
	{
		this.answerD = answerD;
	}	
}
