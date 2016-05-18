import java.util.ArrayList;
import java.util.Random;

public class Game {

	//CONSTANTS
	public  int maxpts;
	public static final int MINPTS = 0;
	
	
	private Player[] players;
	private int nrOfPlayers;
	private int nrOfGamesPlayed;
	
	//Constructors
	public Game(){
		this.players = new Player[0];  //Default
		this.nrOfPlayers = 0;
		this.nrOfGamesPlayed = 0;
		this.maxpts = 10;
	}
	
	public Game(int nrOfPlayers){
		this.players = new Player[nrOfPlayers];	//User defined number of players, use this one
		
		for(int i = 0; i < nrOfPlayers; i++)
			players[i] = new Player();
		
		
		this.nrOfPlayers = nrOfPlayers;
		this.nrOfGamesPlayed = 0;
		this.maxpts = 10;
	}
	
	//Modifiers and Accessors
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	public int getNrOfPlayers() {
		return nrOfPlayers;
	}
	public void setNrOfPlayers(int nrOfPlayers) {
		this.nrOfPlayers = nrOfPlayers;
	}

	public int getNrOfGamesPlayed() {
		return nrOfGamesPlayed;
	}

	public void setNrOfGamesPlayed(int nrOfGamesPlayed) {
		this.nrOfGamesPlayed = nrOfGamesPlayed;
	}
	
	
	
	public int getMaxpts() {
		return maxpts;
	}

	public void setMaxpts(int maxpts) {
		this.maxpts = maxpts;
	}

	public Player returnAtIndex(int i){
		return this.players[i];
	}
	
	public void addFrame(int first, int second, int playerIndex){
		this.players[playerIndex].addFrame(first, second);
		
	}
	
	public void addLastFrame(int x, int f, int s, int i){
		this.players[i].addLastFrame(x, f, s);
	}
	
	
	
	
	public int turn(){
		Random rand = new Random();
		int points = rand.nextInt((maxpts - MINPTS) + 1) + MINPTS;
		setMaxpts(maxpts - points);
		return points;
	}
	
	public ArrayList<String> returnPlayerScores(int playerIndex){
		return players[playerIndex].getFrames();
		
	}
	
	
}
