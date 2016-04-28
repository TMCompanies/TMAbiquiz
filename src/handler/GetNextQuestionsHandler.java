package handler;

import model.ErrorCode;
import model.Model;
import protocol.request.GetNextQuestionsRequest;
import protocol.request.GetSelectableSubjectsRequest;
import protocol.response.GetNextQuestionsResponse;

public class GetNextQuestionsHandler extends AbstractHandler
{
	public String handle(String httpBody)
	{
		GetNextQuestionsRequest request = (GetNextQuestionsRequest)parseXML(httpBody, GetSelectableSubjectsRequest.class);
		
		if(request != null)
		{
			int gameID = request.getGameID();
						
			GetNextQuestionsResponse gnqr = new GetNextQuestionsResponse(ErrorCode.ok, Model.getInstance().getNextQuestions(gameID));
			return buildXML(gnqr);
		}
		else
		{
			GetNextQuestionsResponse gnqr = new GetNextQuestionsResponse(ErrorCode.edec);
			return buildXML(gnqr);
		}
	}
}
