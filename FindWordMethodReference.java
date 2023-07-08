package Day2;

import java.util.List;

public class FindWordMethodReference {
	public void find(List<String> a) {
		for(String i:a) {
			if(i.length()>3) {
				System.out.println(i);
			}
		}
	}

}
