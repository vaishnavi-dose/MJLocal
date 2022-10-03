//Encapsulation
package oops_que3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectTest {
	@Test
	public void area() {
		Rect r= new Rect(3, 7);
		int res= r.RectArea();
		assertEquals(21,res);
	}
	
}
