package server;

import handler.RegisterHandler;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ErrorCode;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import protocol.Command;

public class MyHandler extends AbstractHandler
{
	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);
		
		String commandString = request.getParameter("do");
		Command command = Command.fromString(commandString);
		String httpBody = getHttpBody(request);
		
		String answer = ErrorCode.edec.toString();
		
		if(command != null)
		{
			switch(command)
			{
				case register:
					RegisterHandler rh = new RegisterHandler();
					answer = rh.handle(httpBody);
					break;
					
				case login:
					break;
					
				case changeVisitedSubjects:
					break;
					
				case challengeAnotherPlayer:
					break;
					
				case challengeAccepted:
					break;
					
				case getSelectableSubjects:
					break;
					
				case transmitChosenSubject:
					break;
					
				case getNextQuestions:
					break;
					
				case transmitAnswers:
					break;
					
				case checkForNews:
					break;
			}
		}
		response.getWriter().println(answer);
	}
	
	private String getHttpBody(HttpServletRequest request)
	{
		StringBuffer sb = new StringBuffer();
		BufferedReader bufferedReader = null;
		
		try
		{
			bufferedReader = request.getReader();
			
			char[] charBuffer = new char[128];
			int bytesRead;
			while ((bytesRead = bufferedReader.read(charBuffer)) != -1) 
			{
				sb.append(charBuffer, 0, bytesRead);
			}
		}
		catch(IOException e)
		{
			return ""; //TODO Error-Handling
		}
		finally
		{
			if(bufferedReader != null)
			{
				try
				{
					bufferedReader.close();
				}
				catch(IOException e)
				{
					return ""; //TODO Error-Handling
				}
			}
		}
		return sb.toString();		
	}
}
