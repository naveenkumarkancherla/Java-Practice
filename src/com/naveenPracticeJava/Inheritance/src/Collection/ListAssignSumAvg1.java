package Collection;

import java.util.*;

public class ListAssignSumAvg1 {

	public static void main(String[] args) {
		Object[] arr = new Object[] {4,5,0,9,8,10};
		ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));
		System.out.println(l1);
		int sum = 0;
		for(int i = 0; i < l1.size();i++) {
			sum += l1.get(i);
		}
		System.out.println("Sum of arrayList elements is: "+sum);
//		System.out.println(l1.size());   
		System.out.println("Average of arrrayList elements is: "+sum/(l1.size()));

	}

}
