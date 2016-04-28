package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.Root;

@Root
public class Game
{
	@Element
	private int gameID;
	
	@Element
	private Period period;
	
	@Element
	private int player1ID; //Challenged person
	
	@Element
	private int player2ID; //Challenging person
	
	@ElementArray
	private int[] subjectPool;
	
	@ElementArray
	private Question[] questions1_3;
	
	@ElementArray
	private Question[] questions4_6;
	
	@ElementArray
	private Question[] questions7_9;
	
	@ElementArray
	private Question[] questions10_12;
	
	@ElementArray
	private Question[] questions13_15;
	
	@Element
	private int pointsPlayer1;
	
	@Element
	private int pointsPlayer2;
	
	public Game()
	{
		
	}
	
	public Game(int player1ID, int player2ID)
	{
		
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

	public int getPlayer1ID()
	{
		return player1ID;
	}

	public void setPlayer1ID(int player1id)
	{
		player1ID = player1id;
	}

	public int getPlayer2ID()
	{
		return player2ID;
	}

	public void setPlayer2ID(int player2id)
	{
		player2ID = player2id;
	}

	public int[] getSubjectPool()
	{
		return subjectPool;
	}

	public void setSubjectPool(int[] subjectPool)
	{
		this.subjectPool = subjectPool;
	}

	public Question[] getQuestions1_3()
	{
		return questions1_3;
	}

	public void setQuestions1_3(Question[] questions1_3)
	{
		this.questions1_3 = questions1_3;
	}

	public Question[] getQuestions4_6()
	{
		return questions4_6;
	}

	public void setQuestions4_6(Question[] questions4_6)
	{
		this.questions4_6 = questions4_6;
	}

	public Question[] getQuestions7_9()
	{
		return questions7_9;
	}

	public void setQuestions7_9(Question[] questions7_9)
	{
		this.questions7_9 = questions7_9;
	}

	public Question[] getQuestions10_12()
	{
		return questions10_12;
	}

	public void setQuestions10_12(Question[] questions10_12)
	{
		this.questions10_12 = questions10_12;
	}

	public Question[] getQuestions13_15()
	{
		return questions13_15;
	}

	public void setQuestions13_15(Question[] questions13_15)
	{
		this.questions13_15 = questions13_15;
	}

	public int getPointsPlayer1()
	{
		return pointsPlayer1;
	}

	public void setPointsPlayer1(int pointsPlayer1)
	{
		this.pointsPlayer1 = pointsPlayer1;
	}

	public int getPointsPlayer2()
	{
		return pointsPlayer2;
	}

	public void setPointsPlayer2(int pointsPlayer2)
	{
		this.pointsPlayer2 = pointsPlayer2;
	}
}
