import java.util.*;
import java.util.stream.*;

public class StringFilter {
	private static Scanner sc;

	public static List<String> verificationMethod(List<String> list) {
		return list
				.stream()
				.filter(stringElement -> stringElement.startsWith("a") && stringElement.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		int noOfStr=sc.nextInt();
		List<String> list= new ArrayList<String>();
		for(int iterator=0;iterator<noOfStr;iterator++)
			list.add(sc.next());
	     List<String> resultList = verificationMethod(list); 
	     System.out.println(resultList);	
	}
}