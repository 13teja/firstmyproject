package data.types;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass2 {

			public static void main(String[] args) {

				HashMap<Integer, String> data = new HashMap<>();

				data.put(1, "Amit");
				data.put(2, "Ajay");
				data.put(3, "Sanket");
				data.put(4, "Sanket");
				data.put(4, "Damodar");
				
				System.out.println(data.size());
				data.remove(2);
				System.out.println(data);
				data.put(2, "Amitabh");
				System.out.println(data.get(4));
				
				for (Entry<Integer, String> each:data.entrySet())
				{
					System.out.println(each.getKey());
					System.out.println(each.getValue());
					
				}
				
				
				

			}

			}


