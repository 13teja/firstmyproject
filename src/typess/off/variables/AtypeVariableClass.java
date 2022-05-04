package typess.off.variables;

public class AtypeVariableClass {
	 static StaticKeyword obj = new StaticKeyword();
   int a =89;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword.abcd = 89;
		StaticKeyword.samplestaticMethod();
		//StaticKeyword obj = new StaticKeyword();
		
		System.out.println(obj.name);
		System.out.println(obj.abcd);
		obj.samplestaticMethod();
		obj.sampleNonstaticMethod();
		System.out.println(a);
		
		AtypeVariableClass.obj.samplestaticMethod();
	}
 public void sample() {
	 System.out.println(obj.name);
		System.out.println(obj.abcd);
		obj.samplestaticMethod();
		obj.sampleNonstaticMethod();
		System.out.println(a);
	 
 }
}
