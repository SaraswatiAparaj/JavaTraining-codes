import java.util.*;

public class Linkedhashmap 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> map = new LinkedHashMap();
		
		map.put(1, "sar");
		map.put(2, "mammi");
		map.put(3,"pappa");
		map.put(4, "Raw");
		map.put(5, "Ronie");
		map.put(5, "Ronie");
		System.out.println(map);
		
		//this is to get string of that val 4
		System.out.println(map.get(4));
		
		//this is to get val of the string "sar"
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

