import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleWNECTest {

	@Test
	public void test() {
		assertEquals(Triangle.SCALENE, Triangle.triangle2(3, 4, 5));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(2, 2, 3));
		assertEquals(Triangle.EQUILATERAL, Triangle.triangle2(5, 5, 5));
		assertEquals(Triangle.INVALID, Triangle.triangle2(4, 1, 2));
		
		//example strong robust equivalence case
		assertEquals(Triangle.INVALID, Triangle.triangle2(-1, 5, -1));
		

	}

}
