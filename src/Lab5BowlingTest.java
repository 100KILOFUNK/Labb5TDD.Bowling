import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lab5BowlingTest {
	
	GUI testGui;

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		//frametest
		frametest();
		
		
	}
	
	public void frametest(){
		Frame fr;
		Logic lg;
		
		lg = new Logic();
		int first = lg.turn();
		int second = lg.turn();
		
		fr = new Frame(first, second);
		
		assertTrue(fr.getFirst() <= 10 && fr.getFirst() >= 0);
		assertTrue(fr.getSecond() <= 10 - fr.getFirst() && fr.getSecond() >= 0);
	}

}
