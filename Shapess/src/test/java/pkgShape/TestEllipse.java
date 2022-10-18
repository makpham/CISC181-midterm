package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEllipse {

	@Test
	public void testGettersSetters() {
		Ellipse e4 = new Ellipse(10.0, 5.0);
		
		double expectedGetter = 10.0;
		
		assertEquals(expectedGetter, e4.getRadius());
	}
	
	@Test
	public void areaTest() {
		double expectedArea = 157.08;
		
		Ellipse e1 = new Ellipse(10.0, 5.0);
		
		assertEquals(expectedArea, e1.area(), 0.01);
	}
	
	@Test
	public void perimeterTest() {
		double expectedPerimeter = 48.44;
		
		Ellipse e2 = new Ellipse(10.0, 5.0);
		
		assertEquals(expectedPerimeter, e2.perimeter(), 0.01);
	}

	@Test 
	public void circumferenceTest() {
		double expectedCircumference = 48.44;
		
		Ellipse e3 = new Ellipse(10.0, 5.0);
		
		assertEquals(expectedCircumference, e3.circumference(), 0.01);
	}
	
	@Test
	public void illegal_test() {
		assertThrows(IllegalArgumentException.class, () ->
		{ new Ellipse(-5.0, -10.0);
		});
	}
}
