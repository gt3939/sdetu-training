package oop;

public class Testclass {
	public static void main(String[] args) {
		int[] values = {3, 4, 5, 6, 2};
		//System.out.println(average(1,3,5,6,2,356));
		//System.out.println(number(10));
		int a = 10;
		System.out.println(a);
		
		System.out.println("++a: " + ++a + " " + ++a + " " + ++a);
		System.out.println("-------------------------" + a);
		System.out.println("--a: " + --a + " " + --a + " " + --a);
		System.out.println("-------------------------" + a);
		System.out.println("a++: " + a++ + " " + a++ + " " + a++);
		System.out.println("--------------------------" + a);
		System.out.println("a--: " + a-- + " " + a-- + " " + a--);
		System.out.println(a);
		
		System.out.println("EXERCISES DOWN BELOW");
		System.out.println(add(3, 5));
	}
	public static double average(int... values) {
		double sum = 0;
		for(int i = 0; i < values.length; i++) sum += values[i];
		return values.length==0?0 : sum/values.length;
		
	}
	
	public static int number(int args) {
		for(int i = 10 ;i <= 10 ; --i) {
			System.out.println(i);
			
			if(i <= 0) break;
			
		}
		
		return args;
	}
	
	
	static int add(int a, int b) {
		return a + b;	
	}
	

	

}


class Student{
	String name;
	String studentId; 
	String address;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "joe";
		System.out.println(s1.name);
	}
}