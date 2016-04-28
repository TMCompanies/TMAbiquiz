package handler;

import model.ErrorCode;
import model.Model;
import protocol.request.ChallengeAnotherPlayerRequest;
import protocol.response.ChallengeAnotherPlayerResponse;

/**
 * This class handles the 'ChallengeAnotherPlayerHandler'-command;
 * If another player is challenged, he will receive a request he can
 * either accept or decline //TODO Pop-UP in App?
 * 
 * @author Tim Möschl
 *
 */
public class ChallengeAnotherPlayerHandler extends AbstractHandler
{
	public String handle(String httpBody)
	{
		ChallengeAnotherPlayerRequest request = (ChallengeAnotherPlayerRequest)parseXML(httpBody, ChallengeAnotherPlayerRequest.class);
		
		if(request != null)
		{
			int userID = request.getUserID();
			String playerToChallenge = request.getPlayerToChallenge();
			
			if(Model.getInstance().nicknameAvailable(playerToChallenge))
			{
				ChallengeAnotherPlayerResponse capr = new ChallengeAnotherPlayerResponse(ErrorCode.nde);
				return buildXML(capr);
			}
			
			if(Model.getInstance().lookForRunningGames(userID, Model.getInstance().nicknameToUserID(playerToChallenge)))
			{
				ChallengeAnotherPlayerResponse capr = new ChallengeAnotherPlayerResponse(ErrorCode.gae);
				return buildXML(capr);
			}
			
			try
			{
				Model.getInstance().challengeAnotherPlayer(userID, Model.getInstance().nicknameToUserID(playerToChallenge));
				ChallengeAnotherPlayerResponse capr = new ChallengeAnotherPlayerResponse(ErrorCode.ok);
				return buildXML(capr);
			}
			catch(Exception e)
			{
				ChallengeAnotherPlayerResponse capr = new ChallengeAnotherPlayerResponse(ErrorCode.edcp);
				return buildXML(capr);
			}
		}
		else
		{
			ChallengeAnotherPlayerResponse capr = new ChallengeAnotherPlayerResponse(ErrorCode.edcp);
			return buildXML(capr);
		}
	}
}
