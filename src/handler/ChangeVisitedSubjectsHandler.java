package handler;

import model.ErrorCode;
import model.Model;
import protocol.request.ChangeVisitedSubjectsRequest;
import protocol.response.ChangeVisitedSubjectsResponse;

public class ChangeVisitedSubjectsHandler extends AbstractHandler
{
	public String handle(String httpBody)
	{
		ChangeVisitedSubjectsRequest request = (ChangeVisitedSubjectsRequest)parseXML(httpBody, ChangeVisitedSubjectsRequest.class);
		
		if(request != null)
		{
			int userID = request.getUserID();
			int subjectsVisited = request.getSubjectsVisited();
			
			try
			{
				Model.getInstance().changeSubjectsVisited(userID, subjectsVisited);
				ChangeVisitedSubjectsResponse cvsr = new ChangeVisitedSubjectsResponse(ErrorCode.ok);
				return buildXML(cvsr);
			}
			catch(Exception e)
			{
				ChangeVisitedSubjectsResponse cvsr = new ChangeVisitedSubjectsResponse(ErrorCode.edcvs);
				return buildXML(cvsr);
			}
		}
		ChangeVisitedSubjectsResponse cvsr = new ChangeVisitedSubjectsResponse(ErrorCode.edcvs);
		return buildXML(cvsr);		
	}
}
