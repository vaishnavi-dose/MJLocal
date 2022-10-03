package que_4;

public class Mahendra extends Hotel {

	@Override
	public String rooms_no() {
		// TODO Auto-generated method stub
		return "In this hotel there are 250 rooms";
	}

	@Override
	public int staff_Members() {
		// TODO Auto-generated method stub
		return 190;
	}
	public static void main(String args[]) {
		Mahendra m = new Mahendra();
		String rooms_no= m.rooms_no();
		int staff_Members = m.staff_Members();
		System.out.println(rooms_no);
		System.out.println(staff_Members);
	}
}
