package Day2;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String a=null;
		String b="Arun";
//		Optional<String>  b=Optional.of(a);
//		System.out.println(b);
		Optional<String> c=Optional.ofNullable(b);
		System.out.println(c.empty());
//		
//		Optional<String> d=Optional.empty();
//		System.out.println(d);
		
	}

}
