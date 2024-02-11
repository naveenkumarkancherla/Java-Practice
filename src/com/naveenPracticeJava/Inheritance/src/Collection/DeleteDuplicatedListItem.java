package Collection;

import java.util.*;

public class DeleteDuplicatedListItem {

		public static void main(String[] args) {
			Object[] arr = new Object[] {4,1,9,4,8,0,5,8,1,8,6};
			ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));
			ArrayList<Integer> duplicates = new ArrayList();
	        HashSet<Integer> set = new HashSet();
	        
	        for (int item : l1) {
	            if (!set.add(item)) {
	                duplicates.add(item);
	            }
	        }
	        l1.removeAll(duplicates);
	        System.out.println(l1);
	    }
	}

