package que_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HotelTest 
{
	@Test
    public void evaluatesExpression() {
		Aaryan a= new Aaryan();
		String a1=a.rooms_no();
		int a2=a.staff_Members();
        assertEquals("In this hotel there are 150 rooms", a1);
        assertEquals(75, a2);
        
        Gokul g= new Gokul();
		String g1=g.rooms_no();
		int g2=g.staff_Members();
        assertEquals("In this hotel there are 120 rooms", g1);
        assertEquals(30, g2);
        
        Mahendra m= new Mahendra();
		String m1=m.rooms_no();
		int m2=m.staff_Members();
        assertEquals("In this hotel there are 250 rooms", m1);
        assertEquals(190, m2);
        
        Paresh p= new Paresh();
		String p1=p.rooms_no();
		int p2=p.staff_Members();
        assertEquals("In this hotel there are 200 rooms", p1);
        assertEquals(85, p2);

	}

}
