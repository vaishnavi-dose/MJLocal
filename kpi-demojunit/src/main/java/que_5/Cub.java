package que_5;

public class Cub implements Lion, Lioness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cub c= new Cub();
		c.display();
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		Lion.super.display();
		return Lioness.super.display();
	}

}
