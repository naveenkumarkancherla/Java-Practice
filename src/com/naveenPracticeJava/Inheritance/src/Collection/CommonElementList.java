package Collection;

import java.util.Arrays;
import java.util.*;

public class CommonElementList {

	public static void main(String[] args) {
		Object[] arr1 = new Object[] {4,9,8,5};
		Object[] arr2 = new Object[] {1,8,0,5,1,6};
		ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr1));
		ArrayList<Integer> l2 = new ArrayList(Arrays.asList(arr2));
		ArrayList<Integer> common = new ArrayList<>();
        for(int item : l1) {
        	if(l2.contains(item)) {
        		common.add(item);
        	}
        }
        System.out.println(common);
	}

}
