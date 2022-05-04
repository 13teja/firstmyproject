package typess.off.variables;

public class VariableTypesClass {
   // instance variable 
	String name;
	static int abcd= 89;
	
	static float pqr=55.65f; // italic means static 
	
	public static void main(String[] args) {
		
		int abcd= 89;
		int ghe =78;
		VariableTypesClass obj = new VariableTypesClass();
		VariableTypesClass obj2 = new VariableTypesClass();
		obj.name="ktctc";
	
		// obj.ghe=78;
		obj.pqr =78;
		System.out.println(obj2.pqr);
		System.out.println(obj.name);
		pqr=45.55f;
		System.out.println(pqr);
		System.out.println(obj.abcd);
		

	}

	
	public static void samplemethod() {
		// local variable is in the method // local variable not used in
		// main method even if we create obj
		int a=55;
		int b=45;
		int c= a+b;
		int abcd=34;
		System.out.println(c);
		System.out.println(pqr);
		
	}
	public void samplenonstaticmethod() {
pqr=34.56f;
System.out.println(pqr);
		
		
	}
}
