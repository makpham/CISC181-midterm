package pkgShape;

public class Ellipse extends Circle{
	
	private double radius2;
	
	public Ellipse(double radius, double radius2) {
		super();
		this.setRadius(radius);
		this.setRadius2(radius2);
	}
	
	public Ellipse() {
	}
	
	@Override
	public double area() {
		return Math.PI * this.getRadius() * this.getRadius2();
	}
	
	@Override
	public double circumference() {
		double h = (((this.getRadius() - this.getRadius2())*
				(this.getRadius() - this.getRadius2()))/((this.getRadius() + this.getRadius2()) 
				* (this.getRadius() + this.getRadius2())));
		
		return Math.PI * (this.getRadius() + this.getRadius2()) * (1+((3*h)/((10)+Math.sqrt(4-(3*h)))));
	}

	@Override
	public double perimeter() {
		return circumference(); 
	}
	
	public double getRadius2() {
		return radius2;
	}

	public void setRadius2(double radius2) {
		
		if(radius2 < 0)
		{
			throw new IllegalArgumentException();
		}
		this.radius2 = radius2;
	}
	
	public  boolean isCircle() {
		return getRadius() == getRadius2();
		}
}


