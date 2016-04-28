package model;

/**
 * This enum provides Custom Error Codes; next to normal Errorhandling through Exceptions,
 * it provides explicit errors - so it's helping developers as well as users
 * @author Tim
 *
 */
public enum ErrorCode
{
	ok("ok"), 			//No Errors, everything worked out well
	edec("edec"), 	//Error during executing command
	nna("nna"),		//Nickname not available
	eau("eau"),		//E-Mail-address already in use
	eanu("eanu"), 	//Error during adding of new user	
	edl("edl"), 		//Error during Login
	edcvs("edcvs"),	//Error during changing visited subjects
	nde("nde"),		//Nickname doesn't exist
	gae("gae"),		//There is already a running game between designated players
	edcp("edcp");	//Error during challenging player
	
	private String text;
	
	private ErrorCode(String text)
	{
		this.text = text;
	}
	
	public String toString()
	{
		return text;
	}
	
	public static ErrorCode fromString(String text)
	{
		if(text==null)
			return null;
		
		for(ErrorCode ec : ErrorCode.values())
		{
			if(ec.text.equals(text))
				return ec;
		}
	
		return null;
	}
}
