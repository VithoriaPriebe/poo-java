import java.lang.Math;

public class Circle extends Shape {

	protected double radius;
	
	public Circle() {
		super();
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return String.format("Círculo com raio " + radius + ", que é uma subclasse de " + super.toString() +
				"\nSua área é " + this.getArea() + " e seu perímetro é " + this.getPerimeter() + ".");
	}
}
