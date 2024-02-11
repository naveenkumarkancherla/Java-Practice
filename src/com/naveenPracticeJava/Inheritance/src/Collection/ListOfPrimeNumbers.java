package Collection;

import java.util.*;
public class ListOfPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		ArrayList<Integer> l1 = new ArrayList<>();
		int count=0;
		for(int i = 2; i <= n; i++) {
			for(int j = 1; j <= i;j++) {
				if(i % j == 0) {
					count++;
				}
				
			}
			if(count == 2) {
				l1.add(i);
			}
			count = 0;
		}
		System.out.println("List of Prime numbers are: ");
		System.out.println(l1);

	}

}
