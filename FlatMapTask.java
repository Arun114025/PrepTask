package Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTask {
	public static void main(String[] args) {
		List<Integer> lisit1=Arrays.asList(35,20,40,60);
		List<Integer> lisit2=Arrays.asList(20,50,37,40);
		
		List<List<Integer>> a=Arrays.asList(lisit1,lisit2);
		List<Integer> result=a.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		result.forEach(x->System.out.println(x));
		
	}

}
