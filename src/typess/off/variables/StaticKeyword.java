package typess.off.variables;

public class StaticKeyword {
	int a=89;
	String name="ktctc";
	static int abcd;
	static char ch;
	
	public static void samplestaticMethod() {
		
		System.out.println("this is sample static method ");
		
	}
	
    public void sampleNonstaticMethod() {
    	
	 System.out.println(" this is sample non static method ");
	 
 }
 public static void main(String[] args)   {
  StaticKeyword.abcd=89;
  System.out.println(StaticKeyword.ch);
  System.out.println(StaticKeyword.abcd);
  StaticKeyword.samplestaticMethod();
  //StaticKeyword.NonstaticMethod();// 
  
  StaticKeyword obj = new StaticKeyword();
  System.out.println(obj.name);
  System.out.println(obj.abcd);
  obj.sampleNonstaticMethod();
  obj.sampleNonstaticMethod();
  
  
  VariableTypesClass abc =  new VariableTypesClass();
  System.out.println(abc.abcd);
  System.out.println(abc.pqr);
  
 }
}
