package lambdas;

import java.util.function.Predicate;

public class Practice2 {
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		Predicate<Integer> prEven = (num) -> num % 2 == 0;
		Predicate<Integer> prOdd = (num) -> num % 2 != 0;
		

		System.out.print("Printing all even numbers in the array : ");
		
		for(int i = 0; i < a.length; i++) {
			if(prEven.test(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
		
		System.out.println("\n");
		System.out.print("Printing all odd numbers in the array : ");
		
		for(int i = 0; i < a.length; i++) {
			if(prEven.negate().test(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
		
		System.out.println("\n");
		System.out.print("Printing all numbers in the array : ");
		
		for(int i = 0; i < a.length; i++) {
			if(prEven.test(a[i]) || prOdd.test(a[i])) {
				System.out.println(a[i]);
			}
//			if(prEven.or(prOdd).test(a[i])) {
//				System.out.print(a[i]);
//			}
		}
			
	}
}
