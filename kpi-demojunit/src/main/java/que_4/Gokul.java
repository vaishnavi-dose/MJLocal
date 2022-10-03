package que_4;

public class Gokul extends Hotel {

	@Override
	public String rooms_no() {
		// TODO Auto-generated method stub
		return "In this hotel there are 120 rooms";
	}

	@Override
	public int staff_Members() {
		// TODO Auto-generated method stub
		return 30;
	}
	public static void main(String args[]) {
		Gokul g = new Gokul();
		String rooms_no= g.rooms_no();
		int staff_Members = g.staff_Members();
		System.out.println(rooms_no);
		System.out.println(staff_Members);
	}
}
