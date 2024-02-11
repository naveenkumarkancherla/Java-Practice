package Collection;

import java.util.*;
public class SumOfEvenInList {

	public static void main(String[] args) {
		Object[] arr = new Object[] {4,5,0,9,8,10};
		ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));
		int sum = 0;
		for(int i = 0; i < l1.size(); i++) {
			if(l1.get(i)%2==0) {
				sum += l1.get(i);
			}
		}
        System.out.println("sum of even number in ArrayList is: "+sum);
	}

}
