import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {


	@Test
	public void test() {
		assertEquals(Triangle.INVALID,
				Triangle.triangle2(0, 0, 0));
		assertEquals(Triangle.INVALID,
				Triangle.triangle2(1, 1, 3));
		assertEquals(Triangle.EQUILATERAL,
				Triangle.triangle2(2, 2, 2));
		assertEquals(Triangle.ISOSELES,
				Triangle.triangle2(2, 2, 3));
		assertEquals(Triangle.SCALENE,
				Triangle.triangle2(2, 3, 4));
	}

}
