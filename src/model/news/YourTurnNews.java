package model.news;

import javax.security.auth.Subject;

import model.Period;
import model.Question;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.Root;

@Root
public class YourTurnNews extends News
{
	@Element
	private int gameID;
	
	@Element
	private Period period;
	
	@ElementArray
	private String[] opponentsAnswersOnQuestionsOfPreviousRound;	//Answers A-D
	
	@ElementArray
	private String[] opponentsAnswersOnQuestionsOfCurrentRound;
	
	@Element
	private Subject subjectOfCurrentRound;
	
	@ElementArray
	private Question[] questionsOfCurrentRound;
	
	public YourTurnNews()
	{
		
	}
		
	public YourTurnNews(int gameID, Period period, String[] opponentsAnswersOnQuestionsOfPreviousRound, String[] opponentsAnswersOnQuestionsOfCurrentRound, Subject subjectOfCurrentRound, Question[] questionsOfCurrentRound)
	{
		this.gameID = gameID;
		this.period = period;
		this.opponentsAnswersOnQuestionsOfPreviousRound = opponentsAnswersOnQuestionsOfPreviousRound;
		this.opponentsAnswersOnQuestionsOfCurrentRound = opponentsAnswersOnQuestionsOfCurrentRound;
		this.subjectOfCurrentRound = subjectOfCurrentRound;
		this.questionsOfCurrentRound = questionsOfCurrentRound;
	}

	public int getGameID()
	{
		return gameID;
	}

	public void setGameID(int gameID)
	{
		this.gameID = gameID;
	}

	public Period getPeriod()
	{
		return period;
	}

	public void setPeriod(Period period)
	{
		this.period = period;
	}
}
