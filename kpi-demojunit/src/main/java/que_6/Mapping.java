package que_6;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public static String display() {
		
		Map<Integer, String> emp
			= new HashMap<Integer, String>();
		
		emp.put(9172,"Emp1");
		emp.put(9173,"Emp2");
		emp.put(9174,"Emp3");
		emp.put(9175,"Emp4");
		emp.put(9176,"Emp5");
		
		/*
		 * emp.get("Emp1"); emp.get("Emp2"); emp.get("Emp3"); emp.get("Emp4");
		 * emp.get("Emp5");
		 */

		System.out.println(emp.get(9175));
		return emp.get(9175);
	}

}
