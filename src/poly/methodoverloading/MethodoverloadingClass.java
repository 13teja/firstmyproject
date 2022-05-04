package poly.methodoverloading;

public class MethodoverloadingClass {

	int a=45;
	int b=88;
	
	public static void main(String[] args) {
		
		MethodoverloadingClass obj =  new MethodoverloadingClass();
		 obj.addition();
		 obj.addition(23.45f, 34.67f);
		 obj.addition(0, 4);
	    obj.substraction(45.34f, 123.34f);
	    obj.substraction(34, 45);
	    
		 
		
		
		
		
		
	}

	public void addition() {
		int c= a+b;
		System.out.println("This is non parameterize method");
		System.out.println(c);
	}
	public void addition(int a, int b) {
		System.out.println("This is two  int add parameterize method");
		int c= a+b;
		System.out.println("Addition is "+c);
		
	}
	public void addition(float a, float b) {
		System.out.println("This is two float parameterize  method");
		float c= a+b;
		System.out.println("Addition is "+c);
		
		
	}
	
	public static  void substraction(int a, int b) {
		System.out.println("This is two  int add parameterize method");
		int c= a-b;
		System.out.println("substraction is "+c);
		
	}
	public static void substraction(float a, float b) {
		System.out.println("This is two float parameterize  method");
		float c= a-b;
		System.out.println("substraction is " +c);
		
		
	}
	
	
}
