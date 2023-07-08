package Day2;

import java.util.ArrayList;

public class FindWord {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Arun");
		a.add("XYZ");
		a.add("Sun");
		a.add("Go");
		a.add("Will");
		a.add("Aravind");
		FindWordMethodReference x = new FindWordMethodReference();
		FindWordLength y = x::find;
		y.findWordslength(a);

	}

}
