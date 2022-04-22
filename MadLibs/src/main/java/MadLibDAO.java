//by Patrick Buford

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MadLibDAO implements MadLibDAOInterface {

	public String noun;
	public String adjective;
	public String verb;
	public String adverb;
	public String username;
	public String name;
	
	private Connection kinect = ConnectionManager.getConnection();
	
	public void getUser(int userID) {
		
		
	}

	public void tellMadLib(String name) {
		try {
			Statement statement = kinect.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM MadLib WHERE name = '"+name+"';");
			
			while (rs.next()){
				noun = rs.getString("noun");
				adjective = rs.getString("adjective");
				verb = rs.getString("verb");
				adverb = rs.getString("adverb");
				
				System.out.println("One day, a " + noun + " went to the market to " 
				+ verb + ". Noticing the day was " + adjective + ", though, the market closed " + adverb + ".");

			};
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void saveMadLib(String newNoun, String newAdjective, String newVerb, String newAdverb, String newName) {
		try {
			String query = "INSERT into MadLib (noun, adjective, verb, adverb, name) values (?, ?, ?, ?, ?)";
			//creates a prepared statement to run the query through the connection
			PreparedStatement pstmt = kinect.prepareStatement(query);
			pstmt.setString(1, newNoun);
			pstmt.setString(2, newAdjective);
			pstmt.setString(3, newVerb);
			pstmt.setString(4, newAdverb);
			pstmt.setString(5, newName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
