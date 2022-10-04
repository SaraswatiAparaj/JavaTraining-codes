package sar;
import java.util.*;

public class PropertiesHashmap 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap();
		
		map.put(1, "sar");
		map.put(2, "mammi");
		map.put(3,"pappa");
		map.put(4, "Raw");
		map.put(5, "Ronie");
	
		System.out.println(map);
		
		System.out.println(map.get(4));
		
		for(Map.Entry<Integer,String> entry : map.entrySet() )
		{
			if(entry.getValue().equals("sar"))
			{
			int	key = entry.getKey();
			System.out.println(key);
			break;
			}
		}

	}

}

