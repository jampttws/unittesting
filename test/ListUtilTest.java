import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Test for ListUtil class.
 * @author Tanasorn Tritawisup
 *
 */
public class ListUtilTest {
	
	@Test
	public void testNormalList() {
		List<String> list = java.util.Arrays.asList("a", "a", "b", "b", "c");
		assertEquals(3, ListUtil.countUnique(list));

	}
	
	@Test (expected = NullPointerException.class)
	public void testListIsNull() {
		List<?> list = null;
		assertEquals(0, ListUtil.countUnique(list));
	}
	
	@Test
	public void testNullInList(){
		List<String> list = java.util.Arrays.asList("a", "a", "b", "b", "c", null);
		assertEquals(4, ListUtil.countUnique(list));
	}
	
	@Test
	public void testAddAnyObject(){
		List<Object> list = new ArrayList<>();
		list.add("add");
		list.add(1);
		list.add(5.0);
		assertEquals(3, ListUtil.countUnique(list));
		list.add("happy");
		assertEquals(4, ListUtil.countUnique(list)); 
	}

	@Test
	public void testEmptyList(){
		List<?> list = new ArrayList<>();
		assertEquals(0,  ListUtil.countUnique(list));
	}


	//binarySearch test
	
	@Test (expected = IllegalArgumentException.class)
	public void testBinaryElementIsNull(){
		String[] array = {"a", "b", "c", "d"};
		assertEquals(3, ListUtil.binarySearch(array, null));
	}
	
	@Test
	public void testBinaryOneElementArray(){
		String[] array = {"a"};
		assertEquals(0, ListUtil.binarySearch(array, "a"));
		assertEquals(-1, ListUtil.binarySearch(array, "b"));
	}
	
	@Test
	public void testBinaryNormalArray(){
		Double[] array = {0.0, 0.1, 0.2, 0.3, 0.4, 0.5};
		assertEquals(0, ListUtil.binarySearch(array, 0.0));
		assertEquals(3, ListUtil.binarySearch(array, 0.3));
		assertEquals(5, ListUtil.binarySearch(array, 0.5));
	}
	
	@Test
	public void testBinarySameElementInArray(){
		Integer[] array = {1, 2, 2, 3 ,4};
		assertEquals(2, ListUtil.binarySearch(array, 2));
	}
	
	
}
