public interface MadLibDAOInterface {
	//by Patrick Buford
	
	//user looks up previously written MadLibs that they created
	public void getUser(int userID);
	
	//user reads completed story
	public void tellMadLib(String name);
	
	//user fills out new MadLib
	public void saveMadLib(String newNoun, String newAdjective, String newVerb, String newAdverb, String newName);
	// or
	//public static void playMadLib(String newName);

}
