package pkgShape;

public abstract class Ellipsoid extends Ellipse{

	private double radius3;
	
	public Ellipsoid(double radius, double radius2, double radius3) {
		super();
		this.setRadius(radius);
		this.setRadius2(radius2);
		this.setRadius3(radius3);
	}
	
	public Ellipsoid() {
		super();
	}
	
	@Override
	public double area() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}

	@Override
	public double circumference() {
		throw new UnsupportedOperationException();
	}
	
	public double getRadius3() {
		return radius3;
	}

	public void setRadius3(double radius3) {
		if(radius3 < 0)
		{
			throw new IllegalArgumentException();
		}
		this.radius3 = radius3;
	}

	public double volume() {
		return ((4/3) * Math.PI * getRadius() * getRadius2() * getRadius3());
	}
	
	public boolean isSphere() {	
		return (getRadius() == getRadius2()) && (getRadius2() == getRadius3()) 
				&& (getRadius() == getRadius3());
	}
}