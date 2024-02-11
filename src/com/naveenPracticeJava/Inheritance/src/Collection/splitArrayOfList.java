package Collection;

import java.util.*;
public class splitArrayOfList {

	public static void main(String[] args) {
		Object[] arr = new Object[] {4,9,8,5,0,10};
		ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));
	    ArrayList<Integer> l2 = new ArrayList<>();
	    ArrayList<Integer> l3 = new ArrayList<>();
	    
	    for(int i = 0; i < l1.size()/2; i++) {
	    	l2.add(l1.get(i));
	    }
	    for(int i = l1.size()/2; i < l1.size();i++){
	    	l3.add(l1.get(i));
	    }
	    System.out.println("Before splitting of an array is:");
	    System.out.println(l1);
	    System.out.println("After splitting of an array is:");
	    System.out.println(l2);
	    System.out.println(l3);
	}

}
