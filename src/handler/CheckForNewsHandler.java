package handler;

import model.ErrorCode;
import model.Model;
import model.news.NewsList;
import protocol.request.CheckForNewsRequest;
import protocol.response.CheckForNewsResponse;

public class CheckForNewsHandler extends AbstractHandler
{
	public String handle(String httpBody)
	{
		CheckForNewsRequest request = (CheckForNewsRequest)parseXML(httpBody, CheckForNewsRequest.class);
		
		if(request != null)
		{
			int playerID = request.getPlayerID();
			
			NewsList newsList = Model.getInstance().getNews(playerID);
			
			CheckForNewsResponse cfnr = new CheckForNewsResponse(ErrorCode.ok, newsList);
			
			return buildXML(cfnr);
		}
		else
		{
			CheckForNewsResponse cfnr = new CheckForNewsResponse(ErrorCode.edec	);
			return buildXML(cfnr);
		}
	}
}
