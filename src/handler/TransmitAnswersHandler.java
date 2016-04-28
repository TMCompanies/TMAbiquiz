package handler;

import model.ErrorCode;
import model.Model;
import protocol.request.TransmitAnswersRequest;
import protocol.response.TransmitAnswersResponse;

public class TransmitAnswersHandler extends AbstractHandler
{
	public String handle(String httpBody)
	{
		TransmitAnswersRequest request = (TransmitAnswersRequest)parseXML(httpBody, TransmitAnswersRequest.class);
		
		if(request != null)
		{
			int gameID = request.getGameID();
			String[] answers = request.getAnswers();
			
			Model.getInstance().questionsAnswered(gameID, answers);
			
			TransmitAnswersResponse tar = new TransmitAnswersResponse(ErrorCode.ok);
			return buildXML(tar);
		}
		else
		{
			TransmitAnswersResponse tar = new TransmitAnswersResponse(ErrorCode.edec);
			return buildXML(tar);
		}
	}
}
