package Collection;

import java.util.*;
public class DeleteL1FromL2 {

	public static void main(String[] args) {
		Object[] arr1 = new Object[] {4,9,8};
		Object[] arr2 = new Object[] {4,1,9,4,8,0,5,1,8,6};
		ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr1));
		ArrayList<Integer> l2 = new ArrayList(Arrays.asList(arr2));
        l2.removeAll(l1);
        System.out.println(l2);
	}

}
