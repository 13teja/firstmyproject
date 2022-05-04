package thiss.keyword;

public class ConstructorCallArgument {
	int a = 90;
	String nn = "abcd";

	public ConstructorCallArgument() {
		a = 99;
		nn = "KTCTC";
		sampleMethod(this);
		A ob = new A(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCallArgument obj = new ConstructorCallArgument();

		System.out.println(obj.a);
		System.out.println(obj.nn);
		ConstructorCallArgument obj1 = new ConstructorCallArgument();
		obj1.a = 60;
		obj1.nn = "HHH";
		obj1.smMethod();

	}

	public void sampleMethod(ConstructorCallArgument oo) {
		System.out.println(oo.a);
		System.out.println(oo.nn);
	}

	public void smMethod() {
		A ao = new A(this);
	}

}
