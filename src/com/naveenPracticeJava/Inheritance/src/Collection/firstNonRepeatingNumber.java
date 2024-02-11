package Collection;

import java.util.Arrays;
import java.util.*;

public class firstNonRepeatingNumber {

	    public static void main(String[] args) {
	        Object[] arr = new Object[]{4, 1, 9, 4, 8, 0, 5, 8, 1, 8, 6};
	        ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));

	        int nonRepeat = l1.get(0);
	        int count;

	        for (int i = 0; i < l1.size(); i++) {
	            count = 0;
	            for (int j = 0; j < l1.size(); j++) {
	                if (i != j && l1.get(i).equals(l1.get(j))) {
	                    count++;
	                }
	            }
	            if (count == 0) {
	                nonRepeat = l1.get(i);
	                System.out.println("First non-repeating number: " + nonRepeat);
	                break;
	            }
	        }
	    }
	}

