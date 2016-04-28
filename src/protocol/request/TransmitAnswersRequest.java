package protocol.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.Root;

@Root
public class TransmitAnswersRequest
{
	 @Element
	 private int gameID;
	 
	 @ElementArray
	 private String[] answers;
	 
	 public TransmitAnswersRequest()
	 {
		 
	 }
	 
	 public TransmitAnswersRequest(int gameID, String[] answers)
	 {
		 this.gameID = gameID;
		 this.answers = answers;
	 }

	public int getGameID()
	{
		return gameID;
	}

	public void setGameID(int gameID)
	{
		this.gameID = gameID;
	}

	public String[] getAnswers()
	{
		return answers;
	}

	public void setAnswers(String[] answers)
	{
		this.answers = answers;
	}	 
}
