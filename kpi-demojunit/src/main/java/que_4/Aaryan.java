package que_4;

public class Aaryan extends Hotel{

	@Override
	public String rooms_no() {
		// TODO Auto-generated method stub
		return "In this hotel there are 150 rooms";
	}

	@Override
	public int staff_Members() {
		// TODO Auto-generated method stub
		return 75;
	}
	public static void main(String args[]) {
		Aaryan a = new Aaryan();
		String rooms_no= a.rooms_no();
		int staff_Members = a.staff_Members();
		System.out.println(rooms_no);
		System.out.println(staff_Members);
	}

}
