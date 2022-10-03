// Absraction
package oops_que3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DanceTest {
	@Test
	public void Dance1() {
		Zumba z= new Zumba();
		String res= z.exercise();
		assertEquals("Dance is an Art", res);
	}

}
