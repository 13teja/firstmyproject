package inheritance;

public class B extends A{
	  int bb =67;
	  static int stBB=34;
	  
	  public void nonstaticmethod() {
		  System.out.println("non static method form B");
		  System.out.println(aa);
		  System.out.println(stAA);
		  System.out.println(bb);
		  System.out.println(stBB);
	  }
	 public static void staticmethod() {
		 System.out.println("static method from B");
		 System.out.println(stAA);
		 System.out.println(stBB);
	 }
	 
	 public static void addition(int a, int b)
	 {
		 int c = a+b;
		 System.out.println(c);
	 }
	public static void main(String []args) {
		 B obj = new B();
		 obj.aa=90;;
		 obj.bb=45;
		 A.stAA=34;
		 B.stBB=34;
		 
		 B.staticmethod();
		 A.staticmethod();
		 obj.nonstaticmethod();
		 obj.nonstaticmethod();
		 obj.addition(34, 45);
		 obj.addition(34,56,89);
		 
		 
	 }
	 
}
