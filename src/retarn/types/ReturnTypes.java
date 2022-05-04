package retarn.types;

import java.util.Arrays;

public class ReturnTypes {

	public static void main(String[] args) {
	 int arr[]= {23,44,56};
	 int arr1[]= {45,78,98};
	 
	 boolean f =Arrays.equals(arr,arr1);
	 int i=ReturnTypes.sample1();
	 System.out.println(i);
 ReturnTypes oo = new ReturnTypes();
 float g=oo.sample3(); 
 System.out.println(g);
 
 int[] add = oo.getAdditionofArray();
 
 
	}
	
  public static void sample()
    {
	  System.out.println("Sample method");
    }
  public static  int sample1()
  {
	  System.out.println("sample method 1");
	  int a= 23;
	  int b =45;
	  int c= a+b;
	   return c;
  }
  public float sample3()
  {
	  float b=45.67f;
	  return b;
  }
  
public  int[] getAdditionofArray()
{
	
	int arr1[]= {23,45};
int arr2[]= {67,67};
	int arr3[]= new int[arr1.length];
	
	arr3[0]=arr1[0]+arr2[0];
	arr3[1]=arr1[1]+arr2[1];
	return arr3;
	
}
	
	
	
	
	
	
	
	
	
	
	
	}
}

