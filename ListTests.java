import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
	@Test 
	public void filter() {
    ArrayList<String> input1 = new ArrayList<String>();
    input1.add("Apple");
    input1.add("Banana");
    input1.add("Pear");
    StringChecker sc1 = new MockStringChecker(); 
    Object[] inputArray = ListExamples.filter(input1, sc1).toArray();
    assertArrayEquals(inputArray, new Object[]{"Apple", "Banana", "Pear"});
	}

  @Test
  public void merge() {
    ArrayList<String> input1 = new ArrayList<String>();
    input1.add("A");
    input1.add("C");
    input1.add("E");
    ArrayList<String> input2 = new ArrayList<String>();
    input2.add("B");
    input2.add("D");
    input2.add("F");
    assertArrayEquals(new Object[]{ "A", "B", "C", "D", "E", "F"}, ListExamples.merge(input1, input2).toArray());
  }
}

class MockStringChecker implements StringChecker {
    @Override
    public boolean checkString(String s) {
        return true;
    }
}
