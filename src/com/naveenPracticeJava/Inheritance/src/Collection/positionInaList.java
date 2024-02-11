package Collection;

import java.util.*;
public class positionInaList {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Object[] arr = new Object[]{1, 8, 0, 5, 1, 6};
	        ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));

	        System.out.println("Original List: " + l1);

	        System.out.print("Enter a value from the above list: ");
	        int n = sc.nextInt();
	        if(l1.contains(n)){
	        int position = l1.indexOf(n);
            position +=1;
	  
	        System.out.println("Position of " + n + " in the list: " + position);
	        }
	        else {
	        	System.err.println("element not found in the above list!");
	        }
	        
	    }
	}
