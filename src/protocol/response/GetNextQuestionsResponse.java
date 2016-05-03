package protocol.response;

import model.ErrorCode;
import model.Question;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.Root;

@Root
public class GetNextQuestionsResponse
{
	@Element
	private ErrorCode ec;
	
	@ElementArray
	private Question[] questions;
	
	public GetNextQuestionsResponse()
	{
		
	}
	
	public GetNextQuestionsResponse(ErrorCode ec)
	{
		this.ec = ec;
	}
	
	public GetNextQuestionsResponse(ErrorCode ec, Question[] questions)
	{
		this.ec = ec;	
		this.questions = questions;
	}
	
	public ErrorCode getEc()
	{
		return ec;
	}

	public void setEc(ErrorCode ec)
	{
		this.ec = ec;
	}

	public Question[] getQuestions()
	{
		return questions;
	}

	public void setQuestions(Question[] questions)
	{
		this.questions = questions;
	}
	
}
