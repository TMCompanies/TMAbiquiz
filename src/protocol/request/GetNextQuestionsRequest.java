package protocol.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class GetNextQuestionsRequest
{
	@Element
	private int gameID;
	
	public GetNextQuestionsRequest()
	{
		
	}
	
	public GetNextQuestionsRequest(int gameID)
	{
		this.gameID = gameID;
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
