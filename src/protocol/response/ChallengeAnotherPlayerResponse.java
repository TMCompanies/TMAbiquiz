package protocol.response;

import model.ErrorCode;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class ChallengeAnotherPlayerResponse
{
	@Element
	private ErrorCode ec;
	
	public ChallengeAnotherPlayerResponse()
	{
		
	}
	
	public ChallengeAnotherPlayerResponse(ErrorCode ec)
	{
		this.ec = ec;
	}

	public ErrorCode getEc()
	{
		return ec;
	}

	public void setEc(ErrorCode ec)
	{
		this.ec = ec;
	}
}
