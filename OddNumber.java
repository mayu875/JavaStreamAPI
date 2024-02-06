
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> number = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
	
	List<Integer> oddNumbers = number.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
	
	System.out.print("Odd Numbers = ");

    	System.out.println(oddNumbers);
       
	}
}
