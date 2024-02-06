import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a list of integers
        List<Integer> number = Arrays.asList(1,2, 3, 4, 5, 6, 7, 8, 9, 10); 
 
        // demonstration of map method
        List<Integer> table = number.stream().map(x -> x * 2).collect(Collectors.toList());

        System.out.println(table);
        
	}

}
