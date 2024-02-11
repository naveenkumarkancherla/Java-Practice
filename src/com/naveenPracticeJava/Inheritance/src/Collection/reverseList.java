package Collection;

import java.util.*;

public class reverseList {

	public static void main(String[] args) {
		 Object[] arr = new Object[]{1, 8, 0, 5, 1, 6};
	     ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));
	     ArrayList<Integer> l2 = new ArrayList();
	     for(int i = l1.size()-1; i >= 0;i--) {
	    	 l2.add(l1.get(i));
	     }
	     System.out.println(l2);
	}

}
