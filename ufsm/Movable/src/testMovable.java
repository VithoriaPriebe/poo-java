
public class testMovable {

	public static void main(String[] args) {
		
        Movable m1 = new MovablePoint(7, 8, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
           
        Movable m2 = new MovableCircle(3, 4, 2, 2, 15);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
