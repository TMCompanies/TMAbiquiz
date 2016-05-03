package protocol.response;

import model.ErrorCode;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class RegisterResponse
{
	@Element
	private ErrorCode ec;
	
	@Element
	private int userID;

	public RegisterResponse()
	{
		
	}
	
	public RegisterResponse(ErrorCode ec)
	{
		this.ec = ec;
	}
	
	public RegisterResponse(ErrorCode ec, int userID)
	{
		this.ec = ec;
		this.userID = userID;
	}
	public ErrorCode getEc()
	{
		return ec;
	}
	public void setEc(ErrorCode ec)
	{
		this.ec = ec;
	}
	public int getUserID()
	{
		return userID;
	}
	public void setUserID(int userID)
	{
		this.userID = userID;
	}
	
}
