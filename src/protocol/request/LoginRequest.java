package protocol.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class LoginRequest
{
	@Element
	private String nickname;
		
	@Element
	private String password;
	
	public LoginRequest()
	{
		
	}
	
	public LoginRequest(String nickname, String password)
	{
		this.nickname = nickname;
		this.password = password;
	}

	public String getNickname()
	{
		return nickname;
	}

	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	
}
