import java.util.Scanner;

public class GUI {

	
	private static Logic game;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize the game
		init();
		
	    
	    
	    System.out.println(game.getNrOfPlayers());

	}
	
	public static void init(){
		//ask how many players
	    int players;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("How many players?: ");
	    players = in.nextInt();
	    
	    //create the objekt with the right amount of players
	    game = new Logic(players);
	}

}
