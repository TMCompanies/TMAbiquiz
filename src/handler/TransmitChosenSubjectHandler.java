package handler;

import model.ErrorCode;
import model.Model;
import protocol.request.TransmitChosenSubjectRequest;
import protocol.response.TransmitChosenSubjectResponse;

public class TransmitChosenSubjectHandler extends AbstractHandler
{
	public String handle(String httpBody)
	{
		TransmitChosenSubjectRequest request = (TransmitChosenSubjectRequest)parseXML(httpBody, TransmitChosenSubjectRequest.class);
		
		if(request != null)
		{
			int chosenSubject = request.getChosenSubject(); 
			int gameID = request.getGameID();
			
			Model.getInstance().subjectChosen(gameID, chosenSubject);
			
			TransmitChosenSubjectResponse tcsr = new TransmitChosenSubjectResponse(ErrorCode.ok);
			return buildXML(tcsr);
		}
		else
		{
			TransmitChosenSubjectResponse tcsr = new TransmitChosenSubjectResponse(ErrorCode.edec);
			return buildXML(tcsr);
		}
	}
}
