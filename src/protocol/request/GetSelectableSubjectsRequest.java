package protocol.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class GetSelectableSubjectsRequest
{
	@Element
	private int gameID;
		
	public GetSelectableSubjectsRequest()
	{
		
	}

	public GetSelectableSubjectsRequest(int gameID)
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
