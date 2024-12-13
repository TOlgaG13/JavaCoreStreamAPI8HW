package sample1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
		String evenNumb=numbers.stream()
				.filter(a->a%2==0)
				.map(a->Integer.toString(a))
				.collect(Collectors.joining("; "));
		String oddNumb=numbers.stream()
				.filter(a->a%2!=0)
				.map(a->Integer.toString(a))
				.collect(Collectors.joining("; "));
		System.out.println(evenNumb);
		System.out.println(oddNumb);
	}

}
