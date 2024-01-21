import java.util.*; 
  
class ReduceStreamExample { 
 
public static void main(String[] args) 
{ 
  
        // Creating list of integers 
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8); 
  
        // Finding sum of all elements 
        int sum = array.stream().reduce(0, (element1, element2) -> element1 + element2); 

        System.out.println("The sum of all elements is " + sum);
    } 
} 
...................................................................................................................
import java.util.*; 
import java.util.stream.IntStream; 
  
class ReduceStreamExample1 { 

public static void main(String[] args) 
{ 
        // To get the product of all elements 
        // in given range excluding the 
        // rightmost element 
        int product = IntStream.range(2, 8).reduce((num1, num2) -> num1 * num2).orElse(-1); 
  
        System.out.println("The product is : " + product); 
    } 
} 