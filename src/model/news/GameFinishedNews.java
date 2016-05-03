package model.news;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * DO I ACTUALLY NEED THIS CLASS?
 * @author Tim
 *
 */
@Root
public class GameFinishedNews extends News
{
	@Element
	private int gameID;
	
	 @Element
	 private int finalScorePlayer1;
	 
	 @Element
	 private int finalScorePlayer2;

	 public GameFinishedNews()
	 {
		 
	 }
	 
	public GameFinishedNews(int gameID, int finalScorePlayer1, int finalScorePlayer2)
	{
		this.gameID = gameID;
		this.finalScorePlayer1 = finalScorePlayer1;
		this.finalScorePlayer2 = finalScorePlayer2;
	}

	public int getGameID()
	{
		return gameID;
	}

	public void setGameID(int gameID)
	{
		this.gameID = gameID;
	}

	public int getFinalScorePlayer1()
	{
		return finalScorePlayer1;
	}

	public void setFinalScorePlayer1(int finalScorePlayer1)
	{
		this.finalScorePlayer1 = finalScorePlayer1;
	}

	public int getFinalScorePlayer2()
	{
		return finalScorePlayer2;
	}

	public void setFinalScorePlayer2(int finalScorePlayer2)
	{
		this.finalScorePlayer2 = finalScorePlayer2;
	}
}
