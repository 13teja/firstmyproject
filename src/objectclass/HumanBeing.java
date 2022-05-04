package objectclass;

public class HumanBeing {
	String name;
	int age;
	float weight;

	public static void main(String[] args) {
		HumanBeing abc= new HumanBeing();
		HumanBeing obj2=new HumanBeing();
		HumanBeing obj3= abc;
		abc.age =45;
		abc.name="ganesh";
		abc.weight = 66.67f;
		System.out.println(abc.name);
		System.out.println(abc.age);
		System.out.println(abc.weight);
	System.out.println(obj3.name);
		System.out.println(obj3.age);
		System.out.println(obj3.weight);
		int a=abc.age;
		System.out.println(obj3.weight);
		 abc.cantalk();
		caneat();

		HumanBeing.name="jtersdf";
	}

	public  void cantalk() {
		System.out.println(" this human can talk");
         
	}

	public static void caneat() {
		System.out.println("this human can eat pizza");
	}

}
 