package MAPPING;
import java.util.*;
public class HASHMAP
{
	public static void main(String[]args)
	{	
	//	raw/ heterogenous type
		HashMap hm=new HashMap();
		hm.put(1,null);
		hm.put(99,null);//unordered 
		// null multiple nulls are allowed 
		hm.put(3,"karthik");
		hm.put(4,"karthik");
		//hm.put(4,"sant")
		// duplicate keys are not allowed
		// but duplicate values are allowed
		Object obj1="karu";
		hm.put(5, obj1);
//      we can put objects in value special feature
		hm.put(null, 1);
		hm.put(null, 2);
		hm.put(null, 3);//null=3
// i.e indirectly one null key is allowed preference for last
// if null is given to key last  only one value of null is shown at first
		//getting output with keys and values
		System.out.println(hm);
		//getting only values but not keys
		System.out.println(hm.values());
		
		//iterartor listiterator foreachloop not allowed
		System.out.println("null key pair data is"+hm.get(null));
		System.out.println("key 3 value data is"+hm.get(3));
		
//		HASHMAP obj2=new HASHMAP();
//		obj2="sant";
//      Type mismatch: cannot convert from String to HASHMAP
//      hm.put(6, obj2);
		
		//homogenous or generic type
		
		HashMap <Integer,String> hm1=new HashMap<>();
		hm1.put(null, "null value");
		hm1.put(99, "karu");
		hm1.put(88,"sant");
		System.out.println(hm1);
	}
}
