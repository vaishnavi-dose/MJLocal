// Inheritance
package oops_que3;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import oops_que3.Lenovo;

public class ComputerTest 
{
	@Test
    public void evaluatesExpression() {
		Lenovo p= new Lenovo();
		Lenovo r= new Lenovo();
		
		String pro = p.Processor("Processor");
		String ram = r.RAM("RAM");

        assertEquals("i5", pro);
        assertEquals("8 Gb", ram);

		
	}
}
