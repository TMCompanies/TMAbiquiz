package protocol.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class RegisterRequest
{
	@Element
	private String nickname;
	
	@Element
	private String password;
	
	@Element
	private String e_mail_address;
	
	@Element
	private int subjectsVisited;
	
	public RegisterRequest()
	{
		
	}
	
	public RegisterRequest(String nickname, String password, String e_mail_address, int subjectsVisited)
	{
		this.nickname = nickname;
		this.password = password;
		this.e_mail_address = e_mail_address;
		this.subjectsVisited = subjectsVisited;
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

	public String getE_mail_address()
	{
		return e_mail_address;
	}

	public void setE_mail_address(String e_mail_address)
	{
		this.e_mail_address = e_mail_address;
	}

	public int getSubjectsVisited()
	{
		return subjectsVisited;
	}

	public void setSubjectsVisited(int subjectsVisited)
	{
		this.subjectsVisited = subjectsVisited;
	}
}
