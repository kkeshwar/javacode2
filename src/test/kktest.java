import static org.junit.Assert.*;

import org.junit.Test;

public class kktest {

	@Test
	public void addtestSuccess() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3);
		
	}
	@Test
	public void addtestFailure() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 4);
		
	}

}
