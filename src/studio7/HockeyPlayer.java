package studio7;

public class HockeyPlayer {

	private String name;
	private int jerseyNum;
	private String shootDir;
	// left, right, either?
	// could probably do boolean, true for left false for right? idk doesnt account for either
	private String handedness;
	// left or right
	private boolean shootRight;
	private int goals, assists, points, games;

	public HockeyPlayer(String name, int jerseyNum, String shootDir, String handedness) {
		this.name = name;
		this.jerseyNum = jerseyNum;
		this.shootDir = shootDir;
		this.handedness = handedness;
		this.goals = 0;
		this.assists = 0;
		this.points = 0;
		this.games = 0;
	}

	public void completeGame(int goals, int assists) {
		this.goals += goals;        
		this.assists += assists;   
		this.points = goals + assists;  
		this.games++;
	}
	
	public void stats() {
		System.out.println("Player " + name + " is jersey number " + jerseyNum + " and has completed " + games + " games");
		System.out.println("They have a total of " + assists + " assists, " + goals + " goals, and " + points + " points.");
	}
	
	public static void main(String[] args) {
		HockeyPlayer player1 = new HockeyPlayer("Jessica", 3, "right", "right");
		player1.completeGame(4, 20);
		player1.completeGame(5, 12);
		player1.stats();
	}
}



