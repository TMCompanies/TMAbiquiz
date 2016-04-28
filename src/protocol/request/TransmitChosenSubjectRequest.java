package protocol.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class TransmitChosenSubjectRequest
{
	@Element
	int gameID;
		
	@Element
	private int chosenSubject;
	
	public TransmitChosenSubjectRequest()
	{
		
	}
	
	public TransmitChosenSubjectRequest(int gameID, int chosenSubject)
	{
		this.gameID = gameID;
		this.chosenSubject = chosenSubject;
	}

	public int getChosenSubject()
	{
		return chosenSubject;
	}

	public void setChosenSubject(int chosenSubject)
	{
		this.chosenSubject = chosenSubject;
	}

	public int getGameID()
	{
		return gameID;
	}

	public void setGameID(int gameID)
	{
		this.gameID = gameID;
	}
		
}
