package protocol;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public enum Command
{
	register("register"),
	login("login"),
	changeVisitedSubjects("changeVisitedSubjects"),
	challengeAnotherPlayer("challengeAnotherPlayer"),
	challengeAccepted("challengeAccepted"),
	getSelectableSubjects("getSelectableSubjects"),
	transmitChosenSubject("transmitChosenSubject"),
	getNextQuestions("getNextQuestions"),
	transmitAnswers("transmitAnswers"),
	checkForNews("checkForNews");
	
	@Element
	private String text;
	
	private Command(String text)
	{
		this.text = text;
	}
	
	public String toString(Command c)
	{
		return text;
	}
	
	public static Command fromString(String text)
	{
		if (text == null)
			return null;

		for (Command c : Command.values())
		{
			if (c.text.equals(text))
				return c;
		}

		return null;
	}
}
