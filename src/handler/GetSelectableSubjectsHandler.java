package handler;

import model.ErrorCode;
import model.Model;
import protocol.request.GetSelectableSubjectsRequest;
import protocol.response.GetSelectableSubjectsResponse;

public class GetSelectableSubjectsHandler extends AbstractHandler
{
	public String handle(String httpBody)
	{
		GetSelectableSubjectsRequest  request = (GetSelectableSubjectsRequest)parseXML(httpBody, GetSelectableSubjectsRequest.class);
		
		if(request != null)
		{
			int gameID = request.getGameID();
			
			int[] subjects = Model.getInstance().getSubjectRange(gameID);
			
			GetSelectableSubjectsResponse gssr = new GetSelectableSubjectsResponse(ErrorCode.ok, subjects[0], subjects[1]);
			
			return buildXML(gssr);			
		}
		
		return buildXML(new GetSelectableSubjectsResponse(ErrorCode.edec));
	}
}
