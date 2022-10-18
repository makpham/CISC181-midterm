package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCircle {

	@Test
	public void circle_test1() {
		
		double expectedArea = 78.5;
		
		Circle c1 = new Circle(5);
		
		assertEquals(expectedArea, c1.area());
	}

	@Test
	public void circle_test2() {
		
		double expectedArea = 31.416;
		
		Circle c2 = new Circle(5);
		
		assertEquals(expectedArea, c2.perimeter());
	}
	public void illegal_test() {
		Exception ex = assertThrows(IllegalArgumentException.class, () ->
		{ Circle ilCircle = new Circle(-5);
		});
	}
}

