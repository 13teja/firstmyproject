package objectclass;

public class AobjectClass {

	public static void main(String[] args) {
		
		ArithmaticCalculation acobj = new ArithmaticCalculation();
		HumanBeing hbobj = new HumanBeing();
		ArithmaticCalculation acobj2= new ArithmaticCalculation();
		
		hbobj.name="madhuri";
		hbobj.cantalk();
		
		acobj.a=55;
		acobj.b=23;
		acobj2.a=7;
		acobj2.b=4;
		
		acobj2.addition();
		acobj2.substraction();
		acobj.addition();
		acobj.substraction();

	}

}
