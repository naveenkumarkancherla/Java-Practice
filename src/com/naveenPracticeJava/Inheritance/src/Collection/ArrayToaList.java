package Collection;

import java.util.*;
public class ArrayToaList {

	public static void main(String[] args) {
		Object[] arr = new Object[] {4,9,8,5,0,10};
		ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));
		
		int[] array = new int[l1.size()];

        for(int i = 0; i < l1.size();i++) {
        	array[i] = l1.get(i);
        }
        for(int i = 0; i < l1.size(); i++) {
        	System.out.print(array[i]+" ");
        }

	}

}
