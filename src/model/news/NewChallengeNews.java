package model.news;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class NewChallengeNews extends News
{
	@Element
	private String challengerNickname;
	
	public NewChallengeNews()
	{
		
	}
	
	public NewChallengeNews(String challengerNickname)
	{
		
	}

	public String getChallengerNickname()
	{
		return challengerNickname;
	}

	public void setChallengerNickname(String challengerNickname)
	{
		this.challengerNickname = challengerNickname;
	}
}
