package server;

import org.eclipse.jetty.server.Server;

public class MyServer
{
	public MyServer()
	{
		Server server = new Server(8080);
		server.setHandler(new MyHandler());
		
		try
		{
			server.start();
			server.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
