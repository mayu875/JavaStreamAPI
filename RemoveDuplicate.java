import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("Mayuri");
		nameList.add("Mayuri");
		nameList.add("Mayuri");
		nameList.add("Pooja");
		
		//System.out.println("ArrayList with duplicates: " + nameList); 
		
		List<String> newList = nameList.stream().distinct().collect(Collectors.toList()); 

     	                //System.out.println("ArrayList with duplicates removed: " + newList); 
		
                                System.out.println(newList); 

	} 
} 
  
