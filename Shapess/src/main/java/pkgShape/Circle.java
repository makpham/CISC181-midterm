package pkgShape;

public abstract class Circle extends Shape {
	
	private double radius;
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		
		if (radius < 0) 
		{
			throw new IllegalArgumentException();
		}
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return this.radius * this.radius * Math.PI;
	}
	
	@Override
	public double perimeter() {
		return 2 * this.radius * Math.PI;
	}
	
	public double circumference() {
		return perimeter();
	}
}
