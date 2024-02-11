package Collection;

import java.util.*;

public class AscendingOrderList {

	public static void main(String[] args) {
		Object[] arr = new Object[] {4,1,9,4,8,0,5,8,1,8,6};
		ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));
		ArrayList<Integer> asc = new ArrayList();
		Collections.sort(l1);
		System.out.println("Ascending order is: "+l1);
		for(int i = l1.size()-1;i >= 0; i--) {
			asc.add(l1.get(i));
		}
		System.out.println("Descending order is: "+asc);
	}
}
