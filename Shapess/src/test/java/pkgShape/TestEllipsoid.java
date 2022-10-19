package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEllipsoid {

	@Test
	public void isSphereTest() {
		Ellipsoid e6 = new Ellipsoid(4,4,4);
		boolean expectedBool = true;
		
		assertEquals(expectedBool, e6.isSphere());
	}
	
	@Test
	public void testGettersSetters() {
		Ellipsoid e4 = new Ellipsoid(2.0, 5.0, 10.0);
		
		double expectedGetter = 2.0;
		
		assertEquals(expectedGetter, e4.getRadius());
	}
	
	@Test
	public void areaTest() throws UnsupportedOperationException{
		new Ellipsoid(1.9,2.4,3.2);
	}
	
	@Test
	public void perimeterTest() throws UnsupportedOperationException{
		new Ellipsoid(1.4,2.8,3.3);
	}
	
	@Test
	public void circumferenceTest() throws UnsupportedOperationException{
		new Ellipsoid(1.9,2.3,1.3);
	}
	
	@Test
	public void volumeTest() {
		double expectedVolume = 418.88;
		
		Ellipsoid e5 = new Ellipsoid(10.0, 5.0, 2.0);
		
		assertEquals(expectedVolume, e5.volume(), 0.01);
	}
	
	@Test
	public void illegal_test() {
		assertThrows(IllegalArgumentException.class, () ->
		{ new Ellipsoid(-5.0, -10.0, -2.0);
		});
	}
}
