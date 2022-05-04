package thiss.keyword;

public class CurrentClassMethod {

		int rollNum = 45;
		String name = "Amit";
		
		static String clgName = "ABC";
		
		public CurrentClassMethod()
		{
			
		}
		
		public CurrentClassMethod(int r, String d)
		{
			rollNum = r;
			System.out.println(rollNum);
			name = d;
			System.out.println(name);
			this.nonStaticMethod();
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			CurrentClassMethod oo3 = new CurrentClassMethod(34, "UAT");
			
			
	      CurrentClassMethod oo = new CurrentClassMethod();
			
			oo.rollNum = 88;
			oo.name = "Sanjay";
			
			CurrentClassMethod oo1 = new CurrentClassMethod();
			
			oo.nonStaticMethod();
			
			oo1.nonStaticMethod();
			
			oo.nonStaticMethod2();

		}

		
		
		public void nonStaticMethod()
		{
			int rollNum = 66;
			String name = "HYT";
			System.out.println(" non Static Method");
			System.out.println(rollNum);
			System.out.println(name);
		  this.nonStaticMethod2();
		   this.staticMethod();
		}
		
		public static void staticMethod()
		{
			System.out.println("Static Method");
			
			System.out.println(clgName);
		}
		
		public void nonStaticMethod2()
		{
			
			System.out.println(this.rollNum);
			System.out.println(this.name);
			System.out.println(clgName);
		}




	}


