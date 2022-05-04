package poly.methodoverriding;

public class B extends A {
	int aa =78;
	static int stAA=89;
	
	public void nonstaticmethodforAddition(int a, int b) {
		System.out.println("non static method for addition  from B");
		int c = a+ b;
		 System.out.println("addition is"+c);
	}
	
	
	public static void staticmethodforSubstraction(int a , int b ) {
		System.out.println(" static method for substraction from B");
		int c = a- b;
		 System.out.println("substraction is"+c);

}
	public static void main(String[] args) {
		A oo= new  A();
		System.out.println(oo.aa);
		System.out.println(oo.stAA);
		oo.nonstaticmethodforAddition(34, 89);
		oo.staticmethodforSubstraction(89, 76);
		
		A ab= new B();
		System.out.println(ab.aa);
		System.out.println(ab.stAA);
		ab.staticmethodforSubstraction(45, 66);
		ab.nonstaticmethodforAddition(34, 56);
		ab.nonstaticmethodforAddition(56, 80);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		B bb= new B();
		System.out.println(bb.aa);
		System.out.println(bb.stAA);
		bb.nonstaticmethodforAddition(23, 33);
		bb.staticmethodforSubstraction(45, 67);
		bb.staticmethodforSubstraction(34, 56);
		
		

	}
}
