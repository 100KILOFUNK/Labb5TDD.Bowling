
public class Player {

	private String name;
	private Frame[] scoreboard;
	
	public Player(){
		this.name = "Unset";
		this.scoreboard = new Frame[10];
	}
	
	public Player(String name){
		this.name = name;
		this.scoreboard = new Frame[10];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Frame[] getScoreboard() {
		return scoreboard;
	}

	public void setScoreboard(Frame[] scoreboard) {
		this.scoreboard = scoreboard;
	}
	
	
	
}
