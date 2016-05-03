package handler;

import model.ErrorCode;
import model.Model;
import protocol.request.LoginRequest;
import protocol.response.LoginResponse;

public class LoginHandler extends AbstractHandler
{
	@Override
	public String handle(String httpBody)
	{
		LoginRequest request = (LoginRequest)parseXML(httpBody, LoginRequest.class);
		
		if(request != null)
		{
			String nickname = request.getNickname();
			String password = request.getPassword();
						
			try
			{
				boolean passwordCorrect = Model.getInstance().passwordCorrect(nickname, password);
				LoginResponse lr = new LoginResponse(ErrorCode.ok, passwordCorrect);
				return buildXML(lr);
			}
			catch(Exception e)
			{
				LoginResponse lr = new LoginResponse(ErrorCode.edl);
				return buildXML(lr);				
			}
		}
		else
		{
			LoginResponse lr = new LoginResponse(ErrorCode.edl);
			return buildXML(lr);		
		}
	}
}
