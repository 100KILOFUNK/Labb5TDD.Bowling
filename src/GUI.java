import java.util.Scanner;



public class GUI {

	
	private static Logic game;
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize the game
		init();
		
		//the actual game
	    update();
	    
	    //close the in stream
	    in.close();

	}
	
	public static void init(){
		//ask how many players
	    int players;
	    
	    
	    System.out.println("How many players?: ");
	    players = in.nextInt();
	    
	    //create the object with the right amount of players
	    game = new Logic(players);
	}
	
	
	public static void update(){
		
		//this while loop representents a round
		while(game.getNrOfGamesPlayed() < 10){ //10 games i smaximum
			
			//this for loop represents a players turn
			for(int i = 0; i < game.getNrOfPlayers(); i++){
				//System.out.println(game.returnAtIndex(i).getName());
				
				turn(i);
				draw();
			}
			
			game.setNrOfGamesPlayed(game.getNrOfGamesPlayed() + 1); //increase the number by one
			
		}
		
		
	}
	
	public static void draw(){
		for(int i = 0; i < game.getNrOfPlayers(); i++){
			
			System.out.println(game.returnAtIndex(i).getName());
			for(int j = 0; j < game.returnAtIndex(i).getFrames().size(); j++)
				System.out.print(game.returnAtIndex(i).getFrames().get(j) + " ");
			
		
			System.out.println(""); //formatting
			System.out.println("SUM: " + game.returnAtIndex(i).getSum());
			
		}
		
	}
	
	public static void turn(int playerIndex){
		//players throws and we randomize two numbers.
		int[] points = new int[2]; //container for the two
		
		//each loop represents a throw
		for(int i = 0; i < 2; i++){
			System.out.println("Press any key to throw!");
			in.next();
			points[i] = game.turn();
			System.out.println("Knocked down: " + points[i]);
		}
		
		//add the turns to the 
		game.addFrame(points[0], points[1], playerIndex);
		//reset the pins to ten
		game.setMaxpts(10);
		
	}

}
