package thiss.keyword;

public class ConstructorCall {

	 int a = 90;
		String nn = "abcd";
		
		public ConstructorCall()
		{
			this(3,"KTCTC");
			System.out.println("This is default constructor");
		}
		
		public ConstructorCall(int z, String str)
		{
			System.out.println("This is two parameter constructor");
			a= z;
			nn = str;
		}
		
		
		public ConstructorCall(int g)
		{
			this();
			System.out.println("This is single parameter constructor");
			a = g;
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ConstructorCall oo = new ConstructorCall(23);
			
			ConstructorCall obj = new ConstructorCall();
			

		}
		
		public void nonStaticMethod()
		{
			//this();
		}

	}


