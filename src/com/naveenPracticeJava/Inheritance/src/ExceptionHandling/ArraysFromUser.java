package ExceptionHandling;

import java.util.*;

public class ArraysFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++) {
			System.out.print("enter "+arr[i]+": ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}

	}

}