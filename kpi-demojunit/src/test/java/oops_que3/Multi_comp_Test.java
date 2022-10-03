//compile time
package oops_que3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Multi_comp_Test {
	@Test
	public void Test() {
		Multiplication m= new Multiplication();
		int res= m.Multiply(6, 8);
		assertEquals(48,res);
	}
	
	
}
