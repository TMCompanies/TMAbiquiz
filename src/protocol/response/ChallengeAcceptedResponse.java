package protocol.response;

import model.ErrorCode;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class ChallengeAcceptedResponse
{
	@Element
	private ErrorCode ec;
	
	@Element
	private int gameID;
	
	public ChallengeAcceptedResponse()
	{
		
	}

	public ChallengeAcceptedResponse(ErrorCode ec)
	{
		this.ec = ec;
	}
	
	public ChallengeAcceptedResponse(ErrorCode ec, int gameID)
	{
		this.ec = ec;
		this.gameID = gameID;
	}

	public ErrorCode getEc()
	{
		return ec;
	}

	public void setEc(ErrorCode ec)
	{
		this.ec = ec;
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
