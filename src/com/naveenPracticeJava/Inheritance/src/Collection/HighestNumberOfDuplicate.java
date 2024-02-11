package Collection;

import java.util.*;

public class HighestNumberOfDuplicate {

	public static void main(String[] args) {
		Object[] arr = new Object[] {4,1,9,4,8,0,5,8,1,8,6};
		ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));
		ArrayList<Integer> duplicates = new ArrayList();
        HashSet<Integer> set = new HashSet();
        
        for (int item : l1) {
            if (!set.add(item)) {
                duplicates.add(item);
            }
        }
 
        int highest = 0,c=0;
        for (int duplicate : new HashSet<>(duplicates)) {
            int count = getCount(l1, duplicate);
            
            if(highest <= duplicate) {
                highest = duplicate;
                c = count;
            }
        }
		System.out.println("Highest duplicated element is "+highest+" and it's count is: "+c);
    }

    private static int getCount(ArrayList<Integer> l1, int duplicate) {
        int count = 0;
        for (Integer item : l1) {
            if (item.equals(duplicate)) {
                count++;
            }
        }
        return count;
    }
}

