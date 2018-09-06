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



}
