//Encapsulation

package oops_que3;

public class Rect {
	int len;
	int bread;
	
	Rect(int len, int bread){
		this.len= len;
		this.bread= bread; }
		
		public int RectArea() {
			int Rect = len*bread;
			System.out.println("Area of Rectangle" +Rect);
			return Rect;
		}
}
