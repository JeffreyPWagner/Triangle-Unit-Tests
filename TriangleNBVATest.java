import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleNBVATest {

	@Test
	public void test() {
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(100, 100, 1));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(100, 100, 2));
		assertEquals(Triangle.EQUILATERAL, Triangle.triangle2(100, 100, 100));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(100, 100, 199));
		assertEquals(Triangle.INVALID, Triangle.triangle2(100, 100, 200));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(100, 1, 100));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(100, 2, 100));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(100, 199, 100));
		assertEquals(Triangle.INVALID, Triangle.triangle2(100, 200, 100));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(1, 100, 100));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(2, 100, 100));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(199, 100, 100));
		assertEquals(Triangle.INVALID, Triangle.triangle2(200, 100, 100));
		
		//example robust worst boundary value case
		assertEquals(Triangle.SCALENE, Triangle.triangle2(200, 199, 201));
	}
}
