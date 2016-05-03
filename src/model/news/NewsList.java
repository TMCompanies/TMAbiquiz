package model.news;

import java.util.ArrayList;

import org.simpleframework.xml.Root;

/**
 * This class is needed for polling;
 * The clients check regularly for news; 
 * Those news have to be saved for each user individually;
 * This is ensured by saving a XML-serialized NewsList in the database for each User-Dataset
 * 
 * @author Tim
 *
 */
@Root
public class NewsList extends ArrayList<News>
{
	
}
