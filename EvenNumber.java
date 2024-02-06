
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> number = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
	
	List<Integer> evenNumbers = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	
	System.out.print("Even Numbers = ");

    	System.out.println(evenNumbers);
       
	}
}
