package poly.methodoverriding;

public class A {
	
	int aa =780;
	static int stAA=839;
	
	public void nonstaticmethodforAddition(int a, int b) {
		System.out.println("non static method for addition  from A");
		int c = a+ b;
		 System.out.println("addition is"+c);
	}
	
	
	public static void staticmethodforSubstraction(int a , int b ) {
		System.out.println(" static method for substraction from A");
		int c = a- b;
		 System.out.println("substraction is"+c);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
