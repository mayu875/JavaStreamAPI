import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateExample {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		List<String> nameList = new ArrayList<String>();
			
			nameList.add("Mayuri");
			nameList.add("Mayuri");
			nameList.add("Mayuri");
			nameList.add("Pooja");
			
		Map<String, Integer> map = nameList.stream().collect(Collectors.toMap
				(Function.identity(), list -> 1, Math::addExact)); 

		Map<String, Integer> hm = new HashMap<String, Integer>();
			for(Map.Entry<String, Integer> me:map.entrySet()) {					
				 System.out.println(me.getKey()+" : "+me.getValue());
		}
	}
}
		 
		 
            
	 