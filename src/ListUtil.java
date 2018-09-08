import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Count the number of distinct elements in a list.
 * @author Tanasorn Tritawisup
 *
 */
public class ListUtil {
	 
	/**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * TODO: can the list contain null values? Does null count as a unique element?
     *
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
    public static int countUnique(List<?> list){
    	List<Object> distinct = new ArrayList<>();
    	for(Object o : list){
    		if(list.contains(o) && (!distinct.contains(o))){
    			distinct.add(o);
    		}
    	}
		return distinct.size(); 	
    }

    /**
     * Find the position of element in array by binary search.
     * The element cannot be null.
     * 
     * @param array of object that extends comparable.
     * @param element that you want to find position.
     * @return position of element in array. If the array don't have that element
     *         return -1.
     */
	public static <T extends Comparable<? super T>> int binarySearch(T[] array, T element){
    	Arrays.sort(array);
    	
    	if(element == null) throw new IllegalArgumentException("Search element must not be null");
    	
		int max = array.length-1;
		int min = 0;
		int half = 0;
		
		if(array[max].equals(element)) return max;
		
		while(element.compareTo(array[half]) != 0) {
			half = Math.floorDiv((max+min), 2);
			
			if(array[half].compareTo(element) > 0) max = half;
			else if(array[half].compareTo(element) < 0) min = half;
					
			if((max-min) == 1 || max == min) return -1;
		}
		
    	 return half;
	}
    
    public static void main(String[] args) {
		Double[] jj = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
//			{"1", "2", "3", "4", "5", "6", "7", "8"};
	
	    System.out.println(binarySearch(jj, 0.0));
	}

}
