
public abstract class Shape {
	
	//Atributos
	protected String color;
	protected boolean filled;
	
	//Construtores
	public Shape() {
		color = "vermelha";
		filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	//Métodos
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//Método abstrato não tem corpo de execução
	abstract public double getArea();
	abstract public double getPerimeter();
	
	public String toString() {
		return String.format("uma forma com cor " + color + " e " + (filled ? "preenchimento" : "sem preenchimento") + ".");
	}
}
