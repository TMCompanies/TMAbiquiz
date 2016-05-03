package protocol.response;

import model.ErrorCode;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class LoginResponse
{
	@Element
	private ErrorCode ec;
	
	@Element
	private boolean passwordCorrect;
	
	public LoginResponse()
	{
		
	}
	
	public LoginResponse(ErrorCode ec)
	{
		this.ec = ec;
	}
	
	public LoginResponse(ErrorCode ec, boolean passwordCorrect)
	{
		this.ec = ec;
		this.passwordCorrect = passwordCorrect;
	}

	public boolean isPasswordCorrect()
	{
		return passwordCorrect;
	}

	public void setLoginSuccessful(boolean passwordCorrect)
	{
		this.passwordCorrect = passwordCorrect;
	}
	
}
