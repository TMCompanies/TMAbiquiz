package protocol.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class ChallengeAcceptedRequest
{
	@Element
	private String challengerNickname;
	
	@Element
	private int challengedPersonID;
	
	public ChallengeAcceptedRequest()
	{
		
	}
	
	public ChallengeAcceptedRequest(String challengerName, int challengedPersonID)
	{
		this.challengerNickname = challengerName;
		this.challengedPersonID = challengedPersonID;
	}

	public String getChallengerNickname()
	{
		return challengerNickname;
	}

	public void setChallengerNickname(String challengerNickname)
	{
		this.challengerNickname = challengerNickname;
	}

	public int getChallengedPersonID()
	{
		return challengedPersonID;
	}

	public void setChallengedPersonID(int challengedPersonID)
	{
		this.challengedPersonID = challengedPersonID;
	}	
}
