
public class DemoTeste {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2.0, 3.0);
		System.out.println(r1.toString());
		
		Rectangle r2 = new Rectangle(2.0, 3.0, "verde", true);
		System.out.println(r2.toString());

		Circle c1 = new Circle(3.0);
		System.out.println(c1.toString());
		
		Circle c2 = new Circle(4.0);
		System.out.println(c2.toString());
	}

}
