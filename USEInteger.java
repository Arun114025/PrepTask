package Day2;

import java.util.*;

public class USEInteger {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(18);
		nums.add(12);
		nums.add(7);
		nums.add(27);

		IntegerTask num = (x -> {
			for (Integer z : x) {
				if (z % 2 == 0 && z % 3 == 0) {
					System.out.println(z);
				}
			}
		});
		num.findNum(nums);
		
		
		
		
		
	}
}
