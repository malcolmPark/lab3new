import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void averageWithoutLowest() {
    double[] input1 = { 1.0, 1.0, 2.0, 3.0 };
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 2.0, 0);
  }
}
