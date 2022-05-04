package data.types;
import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {

		ArraysClass obj = new ArraysClass();
		
		int arr[] = {23,45,2,1,56};
		
		int arr1[] = {23,45,2,1,56};
		byte b = 45;
		byte c = 45;
	
		System.out.println(obj);
		Arrays.sort(arr);
		System.out.println(arr);
		
      boolean ff = Arrays.equals(arr, arr1);
      System.out.println(ff +"ff");
		
		boolean flag = b==c;
		System.out.println(flag);
		
		int arr2[] = arr;
		
		int a = arr[2];
		
		System.out.println(a);
		System.out.println(arr[1]);
		arr[1] = 90;
		System.out.println(arr[1]);
		
		int lngth = arr.length;
		System.out.println(lngth);
		boolean fl = arr==arr1;
		System.out.println(fl);
		boolean fl1 = arr==arr2;
		System.out.println(fl1);
		
		
		

	}

	}


