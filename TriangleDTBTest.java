import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleDTBTest {


	@Test
	public void test() {
		assertEquals(Triangle.INVALID, Triangle.triangle2(4, 1, 2));
		assertEquals(Triangle.INVALID, Triangle.triangle2(1, 4, 2));
		assertEquals(Triangle.INVALID, Triangle.triangle2(1, 2, 4));
		assertEquals(Triangle.EQUILATERAL, Triangle.triangle2(5, 5, 5));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(2, 2, 3));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(2, 3, 2));
		assertEquals(Triangle.ISOSELES, Triangle.triangle2(3, 2, 2));
		assertEquals(Triangle.SCALENE, Triangle.triangle2(3, 4, 5));
		
		//example special value testing cases
		assertEquals(Triangle.INVALID, Triangle.triangle2(1, 1, 2));
		assertEquals(Triangle.INVALID, Triangle.triangle2(1, 2, 1));
		assertEquals(Triangle.INVALID, Triangle.triangle2(2, 1, 1));
		
	}

}
