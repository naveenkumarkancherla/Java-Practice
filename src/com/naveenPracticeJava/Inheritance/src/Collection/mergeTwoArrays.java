package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeTwoArrays {

	public static void main(String[] args) {
		Object[] arr1 = new Object[] {4,9,0};
		ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr1));
		Object[] arr2 = new Object[] {5,0,10};
		ArrayList<Integer> l2 = new ArrayList(Arrays.asList(arr2));
        ArrayList<Integer> l3 = new ArrayList();
        l3.addAll(l1);
        l3.addAll(l2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
	}

}
