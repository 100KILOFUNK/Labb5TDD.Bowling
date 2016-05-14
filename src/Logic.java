
public class Logic {

	private Player[] players;
	private int nrOfPlayers;
	
	
	//Constructors
	public Logic(){
		this.players = new Player[0];  //Default
		this.nrOfPlayers = 0;
	}
	
	public Logic(int nrOfPlayers){
		this.players = new Player[nrOfPlayers];	//User defined number of players, use this one
		this.nrOfPlayers = nrOfPlayers;
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
	
	
	
}
