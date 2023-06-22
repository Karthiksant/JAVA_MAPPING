package MAPPING;
import java.util.*;
public class TREEMAP 
{
	public static void main(String[]args)
	{	
		TreeMap tm=new TreeMap();
		// created raw type only but should enter only homogenous data
		//tm.put(null, 99);
		//null keys are not allowed
		tm.put(11,null);
		//but multiple null values are allowed
		tm.put(12,null);
		tm.put(9,22);
		tm.put(8,33);
		tm.put(1,999);
		System.out.println(tm);
		//main diferrence output appears like tree based on key order
		// allows only homogenous type data
	}

}
