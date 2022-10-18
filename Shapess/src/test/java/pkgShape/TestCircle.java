package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCircle {
	
	@Test 
	public void testGettersSetters() {
		Circle c4 = new Circle(5);
		
		double expectedGetter = 5.0;
		
		assertEquals(expectedGetter, c4.getRadius());
	}
	
	@Test
	public void testArea() {
		
		double expectedArea = 78.5;
		
		Circle c1 = new Circle(5);
		
		assertEquals(expectedArea, c1.area(), 0.1);
	}

	@Test
	public void testPerimeter() {
		
		double expectedPerimeter = 31.416;
		
		Circle c2 = new Circle(5);
		
		assertEquals(expectedPerimeter, c2.perimeter(), 0.01);
	}

	@Test
	public void testCircumference() {
		
		double expectedCircumference = 31.416;
		
		Circle c3 = new Circle(5);
		
		assertEquals(expectedCircumference, c3.circumference(), 0.01);
	}

	@Test
	public void illegal_test() {
		assertThrows(IllegalArgumentException.class, () ->
		{ new Circle(-5.0);
		});
	}
}

