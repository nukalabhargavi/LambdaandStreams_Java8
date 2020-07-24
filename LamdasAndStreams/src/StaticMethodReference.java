
import java.util.*;
import java.util.function.Predicate;

public class StaticMethodReference{
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int noOfStrings=sc.nextInt();
		String[] stringArray=new String[noOfStrings];
		for(int iterator=0;iterator<noOfStrings;iterator++)
			stringArray[iterator]=sc.next();
        List<String> list = Arrays.asList(stringArray);
        List<String> resultPalindromes = StaticMethodReference.searchPalindrome(list, str -> StaticMethodReference.checkPalindrome(str));
        System.out.println("Palindromes are " + resultPalindromes);
    }
 
    public static boolean checkPalindrome(String str) {
    	StringBuilder resultString =new StringBuilder();
    	for(int iterator = str.length()-1; iterator >= 0 ; iterator--)
    	     resultString = resultString.append(str.charAt(iterator));
    	return str.equalsIgnoreCase(resultString.toString());
        } 
    public static List<String> searchPalindrome(List<String> list, Predicate<String> predicate) { 
    	List<String> sortedPalindromes = new ArrayList<>(); 
    	list
    	.stream()
    	.filter(iterator -> (predicate.test(iterator))).forEach(iterator ->{
            sortedPalindromes.add(iterator);
        });
        return sortedPalindromes;
 
    }
    
}
