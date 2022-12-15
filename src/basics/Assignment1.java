package basics;

import java.util.Arrays;



public class Assignment1{
	
	public static void main(String[] args) {
		//Write a function that returns the sum of numbers 1 to n
		System.out.println(numSum(6));
		//Write a function that computes the factorial value- use recursion
		System.out.println(fact(4));
		
		//Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array
		int numbers[] = {-2, 3, -34, 2, 5, 6, 5, 23};
		System.out.println(findMin(numbers));
		System.out.println(findMax(numbers));
		System.out.println(findAvg(numbers));
		
	}
	
	
	public static int numSum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + i;
			
		}
		return sum;
	}
	
	public static int fact(int n) {
		if( n == 1){
			return 1;
		}
		else if(n == 2) {
			return 2;
		}
		return ((fact(n-1)) * (n)); 	
		
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				 min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int findAvg(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum / arr.length;
	}
	
	
	
}





/*public class Assignment1 {

	public static void main(String[] args) {
		
	
		int[] numbers = {1, 5, 6, 3, 2, 5, 12};
		System.out.println(findMin(numbers));
		System.out.println(findMax(numbers));
		System.out.println(findAvg(numbers));
}
	
	
	// count from 1 to n
	/*public static int count(int n);
	int n = 3;
	int sum = 0;
	
	for(int i = 0; i <= n; i++) {
		sum = sum + i;
	}
	System.out.println(sum);
*/
	
	//System.out.println(fact(6));
	//System.out.println(min);
	//factorial of a number n
	/*public static int fact(int n) {
		if(n == 1) {
			return 1;
		}
		else if(n == 2) {
			return 2;
		}
		return(n * (fact(n-1))); 
	}*/
	
	/*
	//Three functions that take an array as a parameter and return the minimum, average, and maximum values of that array
	public static int findMin(int[] arr) {
		
		int min = arr[0];
		//return minimum values of array
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				System.out.println(i);
			}
		}
		return min;

	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int findAvg(int[] arr) {
		int sum = 0;
		for(int n = 0; n < arr.length; n++) {
			sum = sum + arr[n];
		}
		return sum / arr.length;
		
	}
	
}	
*/
