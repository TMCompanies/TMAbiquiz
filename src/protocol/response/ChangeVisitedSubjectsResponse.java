package protocol.response;

import model.ErrorCode;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class ChangeVisitedSubjectsResponse
{
	@Element 
	private ErrorCode ec;
	
	public ChangeVisitedSubjectsResponse()
	{
		
	}
	
	public ChangeVisitedSubjectsResponse(ErrorCode ec)
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
