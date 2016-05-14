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
		reqtwo();
		
	}
	
	public void reqone(){ //frametest
		Frame fr; //create the frame which holds the values
		Logic lg; //create the class which handles the logic, i e the throws
		
		lg = new Logic();
		int first = lg.turn(); //throw the ball
		int second = lg.turn();//throw the second ball
		
		fr = new Frame(first, second); //create new frame
		
		assertTrue(fr.getFirst() <= 10 && fr.getFirst() >= 0); //the range of the first throw 0-10. is it out of bounds?
		assertTrue(fr.getSecond() <= 10 - fr.getFirst() && fr.getSecond() >= 0); //range of the second throw 0-(10-first). is it out of bounds?
	}
	
	public void reqtwo(){
		
		Frame fr; //create the frame which holds the values
		Logic lg; //create the class which handles the logic, i e the throws
		
		lg = new Logic();
		int first = lg.turn(); //throw the ball
		int second = lg.turn();//throw the second ball
		
		fr = new Frame(first, second); //create new frame
		
		int sum = first + second; //get the sum
		assertEquals(sum, fr.returnSum()); //test if the two sums match
		
	}
	
	

}
