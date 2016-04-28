package handler;

import model.ErrorCode;
import model.Model;
import protocol.request.RegisterRequest;
import protocol.response.RegisterResponse;

/**
 * 
 * @author Tim Möschl
 * @version 18.04.2016
 */
public class RegisterHandler extends AbstractHandler
{
	/**
	 * @param subjectsVisited It determines which subjects the user visits in school
	 */
	public String handle(String httpBody)
	{
		RegisterRequest request = (RegisterRequest)parseXML(httpBody, RegisterRequest.class);
		
		if(request != null)
		{
			String nickname = request.getNickname();
			String password = request.getPassword();
			String e_mail_address = request.getE_mail_address();
			int subjectsVisited = request.getSubjectsVisited();
			
			if(!Model.getInstance().nicknameAvailable(nickname))
			{
				RegisterResponse rr = new RegisterResponse(ErrorCode.nna);
				return buildXML(rr);
			}
			
			if(Model.getInstance().e_mail_addressInUse(e_mail_address))
			{
				RegisterResponse rr = new RegisterResponse(ErrorCode.eau);
				return buildXML(rr);
			}
		
			try
			{
				int userID = Model.getInstance().addUser(nickname, password, e_mail_address, subjectsVisited);
				RegisterResponse rr = new RegisterResponse(ErrorCode.ok, userID);
				return buildXML(rr);
			}
			catch(Exception e)
			{
				RegisterResponse rr = new RegisterResponse(ErrorCode.eanu	);
				return buildXML(rr);
			}
			
		}
		else
		{
			RegisterResponse rr = new RegisterResponse(ErrorCode.eanu);
			return buildXML(rr);
		}
	}
}
