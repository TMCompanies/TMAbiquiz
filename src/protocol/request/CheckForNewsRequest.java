package protocol.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class CheckForNewsRequest
{
	@Element
	private int playerID;
	
	public CheckForNewsRequest()
	{
		
	}
	
	public CheckForNewsRequest(int playerID)
	{
		this.playerID = playerID;
	}

	public int getPlayerID()
	{
		return playerID;
	}

	public void setPlayerID(int playerID)
	{
		this.playerID = playerID;
	}
}
