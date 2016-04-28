package protocol.response;

import model.ErrorCode;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class GetSelectableSubjectsResponse
{
	@Element
	private ErrorCode ec;
	
	@Element
	private int subject1;
	
	@Element
	private int subject2;
	
	public GetSelectableSubjectsResponse()
	{
		
	}
	
	public GetSelectableSubjectsResponse(ErrorCode ec)
	{
		this.ec = ec;
	}

	public GetSelectableSubjectsResponse(ErrorCode ec, int subject1, int subject2)
	{
		this.ec = ec;
		this.subject1 = subject1;
		this.subject2 = subject2;
	}

	public ErrorCode getEc()
	{
		return ec;
	}

	public void setEc(ErrorCode ec)
	{
		this.ec = ec;
	}

	public int getSubject1()
	{
		return subject1;
	}

	public void setSubject(int subject1)
	{
		this.subject1 = subject1;
	}
	
	public int getSubject2()
	{
		return subject2;
	}
	
	public void setSubject2(int subject2)
	{
		this.subject2 = subject2;
	}
}
