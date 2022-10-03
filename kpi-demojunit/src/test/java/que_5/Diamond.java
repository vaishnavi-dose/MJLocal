package que_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Diamond {
	@Test
	public void diamond() {
		Cub c= new Cub();
		String sol= c.display();
		assertEquals("Every King needs his Queen", sol);
	}

}
