
import java.util.*; 
import java.util.stream.IntStream; 

public class AverageOfIntegers {
	 private static Scanner sc;

	public static void main(String[] args) 
	    {
		    sc = new Scanner(System.in);
		    int noOfElements=sc.nextInt();
		    int[] array=new int[noOfElements];
		    for(int iterator=0;iterator<noOfElements;iterator++)
		    	array[iterator]=sc.nextInt();
	        IntStream inStream = IntStream.of(array); 
	        OptionalDouble optDouble = inStream.average(); 
	        if (optDouble.isPresent()) { 
	            System.out.println(optDouble.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("-1"); 
	        } 
	    } 

}