import java.util.Scanner;



public class GUI {

	
	private static Game game;
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
	    game = new Game(players);
	}
	
	
	public static void update(){
		
		//this while loop representents a round
		while(game.getNrOfGamesPlayed() < 10){ //10 games i smaximum
			
			//this for loop represents a players turn
			for(int i = 0; i < game.getNrOfPlayers(); i++){
				//System.out.println(game.returnAtIndex(i).getName());
				
				if(game.getNrOfGamesPlayed() < 9)
					turn(i);
				else
					lastTurn(i);
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
			
			//if the first one is strike
			if(i > 1 && points[i] == 10) {
				points[i+1] = -1; //-1 represents the nonexistent
				break;
			}
			
			System.out.println("Knocked down: " + points[i]);
		}
		
		//add the turns to the
			game.addFrame(points[0], points[1], playerIndex);
		
		//reset the pins to ten
		game.setMaxpts(10);
		
	}
	
	
	public static void lastTurn(int pIndex){
		
		int pts[] = new int[3];
		pts[0] = 0;
		pts[1] = 0;
		pts[2] = 0;
		
		Boolean cont = true;
		int count = 0;
		
		do{
			System.out.println("Press any key to throw! #" + (count + 1));
			in.next();
			pts[count] = game.turn();
			System.out.println("Knocked down: " + pts[count]);

			if(pts[count] == 10) game.setMaxpts(10);
			
			count++;
			
			if(count == 2 && pts[0] + pts[1] < 10)
				cont = false;
			
			if(count == 2 && pts[0] + pts[1] == 10) 
				game.setMaxpts(10);
			
			if(count == 3) 
				cont = false;
			
		}while(cont);
		
		game.returnAtIndex(pIndex).addLastFrame(pts[0], pts[1], pts[2]);
		
	}

}

	
