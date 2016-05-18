import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lab5BowlingTest {
	
	

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		//frametest - req 1
		//reqone();
		
		//Sumtest - req 2
		//reqtwo();

		
		//gametest - req 3
		//reqThree();
		
		//gamesum - req 4 //this wont work now as this does not take strikes or spares in consideration
		//reqFour();
		
		//stikesum - req 5
		//reqFive();
		
		//Sparesum - req 6
		//reqSix();
		
		
		//spareafterstrike - req 7
		//reqSeven();
		
		//strikestrike - req 8
		//reqEight();
		
		//muliple spares - rep 9 
		//reqNine();
		
		//spare as last fram - req 10
		//reqTen();
		
		//Strike as last frame - req 11
		//reqEleven();
		
		
		//strike as lst, spare before  - req 12
		//reqTwelve();
		
		//perfect game - req 13
		reqThirteen();
	}
	
	public void reqone(){ //frametest
		Frame fr; //create the frame which holds the values
		Game lg; //create the class which handles the logic, i e the throws
		
		lg = new Game();
		int first = lg.turn(); //throw the ball
		int second = lg.turn();//throw the second ball
		
		fr = new Frame(first, second); //create new frame
		
		assertTrue(fr.getFirst() <= 10 && fr.getFirst() >= 0); //the range of the first throw 0-10. is it out of bounds?
		assertTrue(fr.getSecond() <= 10 - fr.getFirst() && fr.getSecond() >= 0); //range of the second throw 0-(10-first). is it out of bounds?
	}
	
	public void reqtwo(){
		
		Frame fr; //create the frame which holds the values
		Game lg; //create the class which handles the logic, i e the throws
		
		lg = new Game();
		int first = lg.turn(); //throw the ball
		int second = lg.turn();//throw the second ball
		
		fr = new Frame(first, second); //create new frame
		
		int sum = first + second; //get the sum
		assertEquals(sum, fr.returnSum()); //test if the two sums match
		assertTrue(10 >= fr.returnSum()); //check that the sum does not exceed ten
		
	}
	
	public void reqThree() {
		
		Game g = new Game(1);
		int f, s;
		int sum = 0;
		
		for(int i = 0; i < 10; i++){
			f = g.turn();
			s = g.turn();
			sum += f+s;
			g.addFrame(f, s, 0);
			g.setMaxpts(10);
		}
		
		
		for(int i = 0; i < 10; i++)
			System.out.print(g.returnAtIndex(0).getFrames().get(i) + " ");
		
		assertEquals(10, g.returnAtIndex(0).getNrOfFrames());
	
		
	}
	
	public void reqFour() {
		Game g = new Game(1);
		int f, s;
		int sum = 0;
		
		for(int i = 0; i < 10; i++){
			f = g.turn();	//first throw
			s = g.turn();	//second throes 
			sum += f+s;		//add the throws
			g.addFrame(f, s, 0); //create the frame	
			g.setMaxpts(10);	//reset the maxpoints
		}
		
		//assertEquals(sum, g.returnAtIndex(0).getSum()); //check if the sum is equal to the independent sum
		assertEquals(sum, g.returnAtIndex(0).getSum()); // i prefer this, since it is more clear what is happening
		
	}
	
	public void reqFive(){
		
		Game g = new Game(1);
		int sum = 0; 
		
		
		
		g.addFrame(10, 0, 0); //create the frame
		g.addFrame(7, 2, 0);
		sum = 10 + 7 + 2 + 7 + 2;
		
		
		//System.out.println("Strike: " + g.returnAtIndex(0).getSum());
		System.out.println("Sum: " + sum);
		assertEquals(sum, g.returnAtIndex(0).getSum()); //check if the sum is equal to the independent sum
		//assertTrue(sum == g.returnAtIndex(0).getSum()); // i prefer this, since it is more clear what is happening
		
	}
	
	public void reqSix() {
		
		Game g = new Game(1);
		int sum = 0; 
		
		
		
		g.addFrame(9, 1, 0); //create the frame
		g.addFrame(3, 6, 0);
		sum = 10 + ( 3 + 3 + 6 );
		
		System.out.println("Spare: " + g.returnAtIndex(0).getSum());
		
		//assertEquals(sum, g.returnAtIndex(0).getSum()); //check if the sum is equal to the independent sum
		assertTrue(sum == g.returnAtIndex(0).getSum()); // i prefer this, since it is more clear what is happening
		
	}
	
	public void reqSeven(){
		
		Game g = new Game(1);
		int sum = 0; 
		
		
		
		g.addFrame(10, 0, 0); //create the frame
		g.addFrame(4, 6, 0); //Spare after strike
		g.addFrame(7, 2, 0);
		sum = (10 + 4 + 6) + ( 4 + 6 + 7 ) + (7 + 2);
		
		
		
		//assertEquals(sum, g.returnAtIndex(0).getSum()); //check if the sum is equal to the independent sum
		assertTrue(sum == g.returnAtIndex(0).getSum());
		
	}
	
	public void reqEight(){
		Game g = new Game(1);
		int sum = 0; 
		
		
		
		g.addFrame(10, 0, 0); //create the frame
		g.addFrame(10, 0, 0);
		g.addFrame(7, 2, 0);

		sum = 55;
		
		
		
		//assertEquals(sum, g.returnAtIndex(0).getSum()); //check if the sum is equal to the independent sum
		assertEquals(sum, g.returnAtIndex(0).getSum());
	}
	
	public void reqNine(){
		Game g = new Game(1);
		int sum = 0; 
		
		
		
		g.addFrame(8, 2, 0); //create the frame
		g.addFrame(5, 5, 0);
		g.addFrame(7, 2, 0);
		sum = (8 + 2 + 5) + ( 5 + 5 + 7 ) + ( 7 + 2 );
		
		
		System.out.println(sum);
		//assertEquals(sum, g.returnAtIndex(0).getSum()); //check if the sum is equal to the independent sum
		assertTrue(sum == g.returnAtIndex(0).getSum());
	}
	
	public void reqTen(){
		Game g = new Game(1);
		int sum = 0; 
		
		LastFrame lf = new LastFrame(5, 5, 5);
		
		sum = 15;
		
		assertEquals(sum, lf.getLastSum());
		

	}
	
	public void reqEleven(){
		Game g = new Game(1);
		int sum = 0; 
		
		LastFrame lf = new LastFrame(10, 5, 2);
		sum = 10 + 5 + 2;
		
		assertEquals(17, lf.getLastSum());

	}
	
	public void reqTwelve(){
		Game g = new Game(1);
		int sum = 0;
		
		LastFrame lf = new LastFrame(5, 5, 10);
		
		sum = 20;
		
		assertEquals(sum, lf.getLastSum());
	}
	
	public void reqThirteen(){
		
		Game g = new Game(1);
		int sum = 300;
		
		
		for(int i = 0; i < 9; i++)
			g.addFrame(10, 0, 0);
		
		g.addLastFrame(10, 10, 10, 0);
		

		assertEquals(sum, g.returnAtIndex(0).getSum());
		
	}

}
