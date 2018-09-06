import java.util.ArrayList;
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
    
    public static void main(String[] args) {
		List<String> jj = new ArrayList<>();
		jj.add("jamp");
		jj.add("jamp");
		jj.add("mint");
		jj.add("mint");
		jj.add("faii");
		jj.add("mint");
		jj.add("mint");
		jj.add("faii");
		jj.add(null);
		System.out.println(countUnique(jj));
	}

}
