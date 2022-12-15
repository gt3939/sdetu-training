package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is determined by sum of two previous fibonnaci numbers
		// Fib(0) = 0
		// Fib(1) = 1
		// Fib(2) = fib(1) + fib(0) = 1
		// Fib(3) = fib(2) + fib (1) = 2
		// Fib(4) = fib(3) + fib(2) = 3
		// Fib(5) = fib(4) + fib(3) = 5
		// Fib(6) = fib(5) + fib(4) = 8
		//System.out.println(fib(6));
		System.out.println(fib(5));
		
	}
	
	public static int fib(int n) {
		if(n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
		//Recursion
	}





	}