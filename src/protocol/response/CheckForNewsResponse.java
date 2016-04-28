package protocol.response;

import model.ErrorCode;
import model.news.NewsList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class CheckForNewsResponse
{
	@Element
	private ErrorCode ec;
	
	@ElementList
	private NewsList newsList;
	
	public CheckForNewsResponse()
	{
		
	}
	
	public CheckForNewsResponse(ErrorCode ec)
	{
		
	}
	
	public CheckForNewsResponse(ErrorCode ec, NewsList newsList)
	{
		this.ec = ec;
		this.newsList = newsList;
	}

	public ErrorCode getEc()
	{
		return ec;
	}

	public void setEc(ErrorCode ec)
	{
		this.ec = ec;
	}

	public NewsList getNewsList()
	{
		return newsList;
	}

	public void setNewsList(NewsList newsList)
	{
		this.newsList = newsList;
	}
	
}
