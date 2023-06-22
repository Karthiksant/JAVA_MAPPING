package MAPPING;
import java.util.*;
public class LINKEDHASMAP 
{
	public static void main(String[]args)
	{	
		LinkedHashMap lh=new LinkedHashMap();
		lh.put(22, "start");
		lh.put(null,99);
		lh.put(1, "end");
		System.out.println(lh);
		// main difference between hashmap and linkedhashmap is
		// output appears as per insertion order in LHMap
		//but in hashmap null value appears at first only 
		
	}
}
