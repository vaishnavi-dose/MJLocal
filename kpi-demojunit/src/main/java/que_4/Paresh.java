package que_4;

public class Paresh extends Hotel
{

	@Override
	public String rooms_no() {
		// TODO Auto-generated method stub
		return "In this hotel there are 200 rooms";
	}

	@Override
	public int staff_Members() {
		// TODO Auto-generated method stub
		return 85;
	}
	public static void main(String args[]) {
		Paresh p = new Paresh();
		String rooms_no= p.rooms_no();
		int staff_Members = p.staff_Members();
		System.out.println(rooms_no);
		System.out.println(staff_Members);
	}
}
