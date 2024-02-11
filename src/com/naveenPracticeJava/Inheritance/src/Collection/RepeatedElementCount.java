package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RepeatedElementCount {

    public static void main(String[] args) {
        String[] arr = new String[]{"baby", "ball", "soap", "baby", "shampoo", "chalk", "soap", "makeup", "baby", "lotion"};
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Original List: " + l1);

        ArrayList<String> duplicates = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        //HasSet means which does not take or allow duplicate values
        for (String item : l1) {
            if (!set.add(item)) {
                duplicates.add(item);
            }
        }

        System.out.println("Duplicated Elements and their Count:");
        for (String duplicate : new HashSet<>(duplicates)) {
            int count = getCount(l1, duplicate);
            System.out.println(duplicate + " - " + count + " times");
        }
    }

    private static int getCount(ArrayList<String> list, String element) {
        int count = 0;
        for (String item : list) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;
    }
}
