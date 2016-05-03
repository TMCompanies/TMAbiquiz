package protocol.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class ChallengeAnotherPlayerRequest
{
	@Element
	private int userID;
	
	@Element
	private String playerToChallenge;
	
	public ChallengeAnotherPlayerRequest()
	{
		
	}
	
	public ChallengeAnotherPlayerRequest(int userID, String playerToChallenge)
	{
		this.userID = userID;
		this.playerToChallenge = playerToChallenge;
	}

	public int getUserID()
	{
		return userID;
	}

	public void setUserID(int userID)
	{
		this.userID = userID;
	}

	public String getPlayerToChallenge()
	{
		return playerToChallenge;
	}

	public void setPlayerToChallenge(String playerToChallenge)
	{
		this.playerToChallenge = playerToChallenge;
	}
}
