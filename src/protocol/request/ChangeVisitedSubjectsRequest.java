package protocol.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class ChangeVisitedSubjectsRequest
{
	@Element
	private int userID;
	
	@Element
	private int subjectsVisited;
	
	public ChangeVisitedSubjectsRequest()
	{
		
	}
	
	public ChangeVisitedSubjectsRequest(int userID, int subjectsVisited)
	{
		this.userID = userID;
		this.subjectsVisited = subjectsVisited;
	}

	public int getUserID()
	{
		return userID;
	}

	public void setUserID(int userID)
	{
		this.userID = userID;
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
