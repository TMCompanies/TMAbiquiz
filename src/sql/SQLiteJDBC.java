package sql;

import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
<<<<<<< HEAD
import java.sql.ResultSet;
import java.sql.Statement;

=======
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Question;
import model.news.News;
import model.news.NewsList;

>>>>>>> 3cd9fb25b6b7750533ed447e0f56f1528a217fb8
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.HyphenStyle;
import org.simpleframework.xml.stream.Style;

<<<<<<< HEAD
import model.Question;
import model.news.News;
import model.news.NewsList;

=======
>>>>>>> 3cd9fb25b6b7750533ed447e0f56f1528a217fb8
public class SQLiteJDBC
{
	private Connection c;
	
	public SQLiteJDBC()
	{
		try
		{
			c = null;
			Statement stmt = null;
			
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:abiquizserver.db");
			
			c.setAutoCommit(false);
			
			DatabaseMetaData dbm = c.getMetaData();
			ResultSet tables = dbm.getTables(null, null, "users", null);
			
			if(!tables.next())
			{
				try
				{				
					Class.forName("org.sqlite.JDBC");
					stmt = c.createStatement();
					String sql =	 "CREATE TABLE USERS" +
<<<<<<< HEAD
										"(ID INT 				PRIMARY KEY 		NOT NULL," +
=======
										"(ID INT				PRIMARY KEY 		AUTOINCREMENT," +
>>>>>>> 3cd9fb25b6b7750533ed447e0f56f1528a217fb8
										"NICKNAME			TEXT					NOT NULL," +
										"PASSWORD		TEXT					NOT NULL," +
										"EMAIL				TEXT					NOT NULL," +
										"SUBJVISITED	INT						NOT NULL," +
										"NEWS					TEXT									 )";
					stmt.executeUpdate(sql);
					stmt.close();
					c.commit();
				}
				catch(Exception e)
				{
					System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			         System.exit(0);
				}
			}
			
			dbm = c.getMetaData();
			tables = dbm.getTables(null, null, "games", null);
			
			if(!tables.next())
			{
				try
				{
					Class.forName("org.sqlite.JDBC");
					stmt = c.createStatement();
					String sql = 	"CREATE TABLE GAMES"	+
<<<<<<< HEAD
										"(ID INT 					PRIMARY KEY 			AUTOINCREMENT			NOT NULL," +
										"PLAYER1					INT							NOT NULL," +
										"PLAYER2					INT							NOT NULL," +
=======
										"(ID INT					PRIMARY KEY 			AUTOINCREMENT," +
										"PLAYER1					INT							NOT NULL," +
										"PLAYER2					INT							NOT NULL," +
										"PERIOD					INT							NOT NULL," +
>>>>>>> 3cd9fb25b6b7750533ed447e0f56f1528a217fb8
										"SUBJECTPOOL		INT							NOT NULL," +
										"QUESTION1			INT											," +
										"QUESTION2			INT											," +
										"QUESTION3			INT											," +
										"QUESTION4			INT											," +
										"QUESTION5			INT											," +
										"QUESTION6			INT											," +
										"QUESTION7			INT											," +
										"QUESTION8			INT											," +
										"QUESTION9			INT											," +
										"QUESTION10			INT											," +
										"QUESTION11			INT											," +
										"QUESTION12			INT											," +
										"QUESTION13			INT											," +
										"QUESTION14			INT											," +
										"QUESTION15			INT											," +
										"POINTSPLAYER1	INT							NOT NULL,"	+
										"POINTSPLAYER2  	INT							NOT NULL)";
					stmt.executeUpdate(sql);
					stmt.close();
					c.commit();								
				}
				catch(Exception e)
				{
					System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			         System.exit(0);
				}
			}
			
			dbm = c.getMetaData();
			tables = dbm.getTables(null, null, "questions", null);
			
			if(!tables.next())
			{
				try
				{
					Class.forName("org.sqlite.JDBC");
					stmt = c.createStatement();
					String sql = 	"CREATE TABLE QUESTIONS"	+
<<<<<<< HEAD
										"(ID INT 					PRIMARY KEY			NOT NULL," +
=======
										"(ID INT					PRIMARY KEY			AUTOINCREMENT," +
>>>>>>> 3cd9fb25b6b7750533ed447e0f56f1528a217fb8
										"SUBJECT				INT							NOT NULL," +
										"QUESTION			TEXT						NOT NULL," +
										"ANSWER_A			TEXT						NOT NULL," + //Answer_A is always the correct answer
										"ANSWER_B				TEXT						NOT NULL," +
										"ANSWER_C				TEXT						NOT NULL," +
										"ANSWER_D			TEXT						NOT NULL)";
					stmt.executeUpdate(sql);
					stmt.close();
					c.commit();								
				}
				catch(Exception e)
				{
					System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			         System.exit(0);
				}
			}
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
		}
		
	}
	
	public boolean nicknameAvailable(String nickname)
	{
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql = "SELECT COUNT(*) AS COUNT FROM USERS WHERE NICKNAME='" + nickname + "';";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				int count = rs.getInt("count");
				
				if(count == 0)
				{
					rs.close();
					stmt.close();
					return true;
				}
				else
				{
					rs.close();
					stmt.close();
					return false;
				}
			}
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
		return false;
	}
	
	public boolean e_mail_addressInUse(String e_mail_address)
	{
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql = "SELECT COUNT(*) AS COUNT FROM USERS WHERE EMAIL='" + e_mail_address + "';";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				int count = rs.getInt("count");
				
				if(count == 0)
				{
					rs.close();
					stmt.close();
					return false;
				}
				else
				{
					rs.close();
					stmt.close();
					return true;
				}
			}
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
		return true;
	}
	
	public int addUser(String nickname, String password, String e_mail_address, int subjectsVisited)
	{
		Statement stmt = null;
		try
		{
			NewsList newsList = new NewsList();
			String newsListSerialized = buildXML(newsList);
			
			stmt = c.createStatement();
			String sql =	 "INSERT INTO USERS(NICKNAME, PASSWORD, EMAIL, SUBJVISITED, NEWS) " +
								"VALUES('" + nickname + "', '" + password + "', '" + e_mail_address + "', '" + subjectsVisited + "', '" + newsListSerialized + "');";
			stmt.executeUpdate(sql);
			
			stmt.close();
			c.commit();			
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
		
		return getUserIDByNickname(nickname);
	}
	
	public boolean passwordCorrect(String nickname, String password)
	{
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql = "SELECT PASSWORD FROM USERS WHERE NICKNAME='" + nickname + "';";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				String passwordFromDataset = rs.getString("password");
				
				if(password.equals(passwordFromDataset))
				{
					rs.close();
					stmt.close();
					return true;
				}
				else
				{
					rs.close();
					stmt.close();
					return false;
				}
			}
			else
			{
				rs.close();
				stmt.close();
				return false;
			}
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
		return false;
	}
	
	public void changeSubjectsVisited(int userID, int subjectsVisited)
	{
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql =	"UPDATE USERS SET SUBJVISITED ='" + subjectsVisited + "' WHERE ID = '" + userID + "';";
			stmt.executeUpdate(sql);
			
			stmt.close();
			c.commit();			
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
	}
	
	/**
	 * 
	 * @param userID_1 UserID of one player
	 * @param userID_2 UserID of another player
	 * @return Returns whether a game between the two players exists
	 */
	public boolean runningGameExists(int userID_1, int userID_2)
	{
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql = "SELECT COUNT(*) AS COUNT FROM GAMES WHERE (PLAYER1 = '" + userID_1 + "' OR PLAYER1 = '" + userID_2 + "') AND (PLAYER2 = '" + userID_2 + "' OR PLAYER2 = '" + userID_1 +"');";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				int count = rs.getInt("count");
				
				if(count == 0)
				{
					rs.close();
					stmt.close();
					return false;
				}
				else
				{
					rs.close();
					stmt.close();
					return true;
				}
			}
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
		return true;
	}
	
	public int getUserIDByNickname(String nickname)
	{
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql = "SELECT ID FROM USERS WHERE NICKNAME='" + nickname + "';";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				int id = rs.getInt("id");
				rs.close();
				stmt.close();
				return id;
			}
			else
			{
				rs.close();
				stmt.close();
				return -1;
			}
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
		return -1;
	}
	
	public String userIDToNickname(int userID)
	{
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql = "SELECT NICKNAME FROM USERS WHERE ID='" + userID + "';";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				String nickname = rs.getString("nickname");
				rs.close();
				stmt.close();
				return nickname;
			}
			else
			{
				rs.close();
				stmt.close();
				return "";
			}
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
		return "";
	}
	
	public void addNewsToUsersDataset(int userID, News news)
	{
		NewsList newsList = getNewsListFromDataset(userID);
		newsList.add(news);
		String newsListSerialized = buildXML(newsList);
		
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql =	"UPDATE USERS NEWS='" + newsListSerialized + "' WHERE ID = '" + userID + "';";
			stmt.executeUpdate(sql);
			
			stmt.close();
			c.commit();			
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
	}
	
	private NewsList getNewsListFromDataset(int userID)
	{
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql = "SELECT NEWS FROM USERS WHERE ID='" + userID + "';";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				String newsListSerialized = rs.getString("news");
				rs.close();
				stmt.close();
				
				NewsList newsList = (NewsList)parseXML(newsListSerialized, NewsList.class);
				
				return newsList;
			}
			else
			{
				rs.close();
				stmt.close();
				return null;
			}
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
		return null;
	}
		
	public int createGame(int challengedPersonID, int challengingPersonID)
	{
<<<<<<< HEAD
		Statement stmt = null;
		try
		{
			//XXX SUBJECTPOOL ERSTELLEN
			stmt = c.createStatement();
			String sql =	 "INSERT INTO GAMES(PLAYER1, PLAYER2, SUBJECTPOOL, POINTSPLAYER1, POINTSPLAYER2) " +
								"VALUES('" + challengedPersonID + "', '" + challengingPersonID + "', '" + subjectpool + "', '" + "0" + "', '" + "0" + "');";
			stmt.executeUpdate(sql);
			
			stmt.close();
=======
		PreparedStatement pstmt = null;
		int key = -1;
		try
		{
			int subjectpool = subjArrayBooleanToInt(createSubjectPool(challengedPersonID, challengingPersonID));
			String sql =	 "INSERT INTO GAMES(PLAYER1, PLAYER2, PERIOD, SUBJECTPOOL, POINTSPLAYER1, POINTSPLAYER2) " +
								"VALUES('" + challengedPersonID + "', '" + challengingPersonID + "', '" + 0 + "', '"+ subjectpool + "', '" + "0" + "', '" + "0" + "');";
			pstmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.executeUpdate(sql);
			
			ResultSet keys = pstmt.getGeneratedKeys();
			keys.next();
			key = keys.getInt(1);
			keys.close();
			
			pstmt.close();
>>>>>>> 3cd9fb25b6b7750533ed447e0f56f1528a217fb8
			c.commit();			
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
		
<<<<<<< HEAD
		//XXX RETURN ID OF GAME														!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	public int[] getSubjectPool(int gameID)
	{
		
=======
		return key;
	}
	
	public boolean[] createSubjectPool(int player1, int player2)
	{
		boolean[] player1SubjVisited = getSubjVisited(player1);
		boolean[] player2SubjVisited = getSubjVisited(player2);
		boolean[] subjectPool = new boolean[16];
		
		for(int i = 0; i < 15; i++)
		{
			if(player1SubjVisited[i] && player2SubjVisited[i])
			{
				subjectPool[i] = true;
			}
			else
			{
				subjectPool[i] = false;
			}
		}
		
		return subjectPool;
	}
	
	public boolean[] getSubjectPool(int gameID)
	{
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql = "SELECT SUBJECTPOOL FROM GAMES WHERE ID = '" + gameID + "';";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				int subjectpool = rs.getInt("subjectpool");
				rs.close();
				stmt.close();
				
				String subjectpoolString = subjectpool + "";
				int[] subjectpoolArrayInt = new int[16];
				boolean[] subjectpoolArrayBoolean = new boolean[16];
				
				for(int i = 0; i < 15; i++)
				{
					subjectpoolArrayInt[i] = Integer.parseInt(subjectpoolString.charAt(i) + "");
				}
				
				for(int j = 0; j < 15; j++)
				{
					if(subjectpoolArrayInt[j] == 1)
						subjectpoolArrayBoolean[j] = true;
					else
						subjectpoolArrayBoolean[j] = false;
				}
				
				rs.close();
				stmt.close();
				return subjectpoolArrayBoolean;
			}
			else
			{
				rs.close();
				stmt.close();
				return null;
			}
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
		}
		return null;
	}
	
	public boolean[] getSubjVisited(int playerID)
	{
		Statement stmt = null;
		try
		{
			stmt = c.createStatement();
			String sql = "SELECT SUBJVISITED FROM USERS WHERE ID='" + playerID + "';";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				int subjVisited = rs.getInt("subjVisited");
				rs.close();
				stmt.close();
				
				String subjVisitedString = subjVisited + "";
				int[] subjVisitedArrayInt = new int[16];
				boolean[] subjVisitedArrayBoolean = new boolean[16];
				
				for(int i = 0; i < 15; i++)
				{
					subjVisitedArrayInt[i] = Integer.parseInt(subjVisitedString.charAt(i) + "");
				}
				
				for(int j = 0; j < 15; j++)
				{
					if(subjVisitedArrayInt[j] == 1)
						subjVisitedArrayBoolean[j] = true;
					else
						subjVisitedArrayBoolean[j] = false;
				}
				
				return subjVisitedArrayBoolean;
			}
			else
			{
				rs.close();
				stmt.close();
				return null;
			}
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
	        System.exit(0);
		}
		return null;
	}
	
	private int subjArrayBooleanToInt(boolean[] subjArrayBoolean)
	{
		String subjString = "";
		
		for(int i = 0; i < 15; i++)
		{
			if(subjArrayBoolean[i])
			{
				subjString += "1";
			}
			else
			{
				subjString += "0";
			}
		}
		
		int subjInt = Integer.parseInt(subjString);
		return subjInt;
>>>>>>> 3cd9fb25b6b7750533ed447e0f56f1528a217fb8
	}
	
	public void subjectChosen(int gameID, int subject)
	{
<<<<<<< HEAD
=======
		
		
>>>>>>> 3cd9fb25b6b7750533ed447e0f56f1528a217fb8
		//Fach wird nicht direkt an Datenbank übergeben; es werden die nächsten 3 Fragen an die Datenbank übergeben
		//SELECT * FROM questions WHERE subject = subject ORDER BY RANDOM() LIMIT 1;
	}
	
	public int[] getNextQuestions(int gameID)
	{
		
	}
	
	public Question getQuestionByID(int questionID)
	{
		
	}
	
	public void questionsAnswered(int gameID, String[] answers)
	{
		
	}
	
	public NewsList getNews(int playerID)
	{
		
	}
	
	private String buildXML(Object object)
	{
		Style style = new HyphenStyle();
		Format format = new Format(style);
		
		Serializer serializer = new Persister(format);
		
		StringWriter writer = new StringWriter();
		
		try
		{
			serializer.write(object, writer);
			return writer.getBuffer().toString();
		}
		catch(Exception e)
		{
			return null; //TODO Error-Handling
		}
	}
	
	private Object parseXML(String xml, Class myClass)
	{
		Serializer serializer = new Persister();
		
		try
		{
			Object object = serializer.read(myClass, xml);
			return object;
		}
		catch(Exception e)
		{
			return null; //TODO: Error-Handling
		}
	}
}
