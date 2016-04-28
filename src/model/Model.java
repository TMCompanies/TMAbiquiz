package model;

import java.util.Random;

import model.news.NewChallengeNews;
import model.news.NewsList;
import sql.SQLiteJDBC;

public class Model
{
	private static Model instance;
	private SQLiteJDBC sqlitejdbc;
	
	private Model()
	{
		sqlitejdbc = new SQLiteJDBC();
	}
	
	public static Model getInstance()
	{
		if(instance == null)
			instance = new Model();
		
		return instance;
	}
	
	public boolean nicknameAvailable(String nickname)
	{
		return sqlitejdbc.nicknameAvailable(nickname);
	}
	
	public boolean e_mail_addressInUse(String e_mail_address)
	{
		return sqlitejdbc.e_mail_addressInUse(e_mail_address);
	}
	
	public int addUser(String nickname, String password, String e_mail_address, int subjectsVisited)
	{
		return sqlitejdbc.addUser(nickname, password, e_mail_address, subjectsVisited);
	}
	
	public boolean passwordCorrect(String nickname, String password)
	{
		return sqlitejdbc.passwordCorrect(nickname, password);
	}
	
	public void changeSubjectsVisited(int userID, int subjectsVisited)
	{
		sqlitejdbc.changeSubjectsVisited(userID, subjectsVisited);
	}
	
	/**
	 * This method returns a boolean, whether there is a running game
	 * with those two players is already existing
	 * 
	 * @param playerID_1 UserID of any player
	 * @param playerID_2 UserID of an other player
	 * @return Returns boolean
	 */
	public boolean lookForRunningGames(int userID_1, int userID_2)
	{
		return sqlitejdbc.runningGameExists(userID_1, userID_2);
	}
	
	public int nicknameToUserID(String nickname)
	{
		return sqlitejdbc.getUserIDByNickname(nickname);
	}
	
	public String userIDToNickname(int userID)
	{
		return sqlitejdbc.userIDToNickname(userID);
	}
	
	public void challengeAnotherPlayer(int challengingPlayersID, int challengedPlayersID)
	{
		//Test whether a request already exists
		NewChallengeNews ncn = new NewChallengeNews(userIDToNickname(challengingPlayersID));
		sqlitejdbc.addNewsToUsersDataset(challengedPlayersID, ncn);
	}
	
	/**
	 * This method is called when a player accepted the Challenge by another player;
	 * a new game is created and added to the database, its ID is returned;
	 * 
	 * 
	 * @param challengerID ID of the challenging person
	 * @param challengedPersonID ID of the challenged Person
	 * @return Returns the number of the created game
	 */
	public int challengeAccepted(int challengedPersonID, int challengingPersonID)
	{
		if(!sqlitejdbc.runningGameExists(challengedPersonID, challengingPersonID))
		{
			return sqlitejdbc.createGame(challengedPersonID, challengingPersonID);
		}
		
		return -1; //An error occurred
	}
	
	public int[] getSubjectRange(int gameID)
	{
		int[] subjectPool = sqlitejdbc.getSubjectPool(gameID);
		int choice1 = -1;
		int choice2 = -1;
		
		Random rand = new Random();
		int i = rand.nextInt(16);
		
		while(choice1 == -1)
		{
			if(subjectPool[i] != 1)
			{
				i = rand.nextInt(16);
			}
			else
			{
				choice1 = i;
			}
		}
		
		while(choice2 == -1)
		{
			if(subjectPool[i] != 1 || i  == choice1)
			{
				i = rand.nextInt(16);
			}
			else
			{
				choice2 = i;
			}
		}
		
		return new int[] {choice1, choice2};		
	}
	
	public void subjectChosen(int gameID, int subject)
	{
		sqlitejdbc.subjectChosen(gameID, subject);
	}
	
	private Question getQuestionByID(int questionID)
	{
		return sqlitejdbc.getQuestionByID(questionID);
	}
	
	public Question[] getNextQuestions(int gameID)
	{
		int[] questionsInt = sqlitejdbc.getNextQuestions(gameID);
		Question[] questions = new Question[3];
		
		for(int i = 0; i<2; i++)
		{
			questions[i] = getQuestionByID(questionsInt[i]);
		}
		
		return questions;
	}
	
	public void questionsAnswered(int gameID, String[] answers)
	{
		sqlitejdbc.questionsAnswered(gameID, answers);
	}
	
	public NewsList getNews(int playerID)
	{
		return sqlitejdbc.getNews(playerID);
	}
}
