package handler;

import model.ErrorCode;
import model.Model;
import protocol.request.ChallengeAcceptedRequest;
import protocol.response.ChallengeAcceptedResponse;

public class ChallengeAcceptedHandler extends AbstractHandler
{
	public String handle(String httpBody)
	{
		ChallengeAcceptedRequest request = (ChallengeAcceptedRequest)parseXML(httpBody, ChallengeAcceptedRequest.class);
		
		if(request != null)
		{
			int challengedPersonID = request.getChallengedPersonID();
			String challengerNickname = request.getChallengerNickname();
			
			int gameID = Model.getInstance().challengeAccepted(challengedPersonID, Model.getInstance().nicknameToUserID(challengerNickname));
			
			ChallengeAcceptedResponse car;
			
			if(gameID == -1)
			{
				car = new ChallengeAcceptedResponse(ErrorCode.gae);
			}
			else
			{
				car = new ChallengeAcceptedResponse(ErrorCode.ok, gameID);
			}
			
			return buildXML(car);
		}
		
		return buildXML(new ChallengeAcceptedResponse(ErrorCode.edec));
	}
}
