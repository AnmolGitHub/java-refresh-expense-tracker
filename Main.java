import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> nums = List.of(10, 50, 5, 100, 40);
	
		List<Integer> filtered = nums.stream()
				.filter(n -> n > 30)
				.sorted()
				.toList();
		System.out.println(filtered);
		System.out.println("Top 2: " + getTopN(nums, 2));
		}
		public static List<Integer> getTopN(List<Integer> nums, int n) {
    	return nums.stream()
            .sorted((a, b) -> b - a)   // sort descending
            .limit(n)
            .toList();
	}

}
