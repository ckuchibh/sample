package JavaActivity3;

import java.util.*;

public class Activity4_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> mylist = new ArrayList<Integer>(5);
		Random indexGen = new Random();

		System.out.println("Enter integers please ");
		System.out.println("(EOF or non-integer to terminate): \n ");

		while (scan.hasNextInt()) {
			mylist.add(scan.nextInt());
		}

		Integer nums[] = mylist.toArray(new Integer[0]);
		// System.out.println(mylist);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		int index = indexGen.nextInt(nums.length);
		System.out.println("Index value generated: " + index);
		System.out.println("Value in arary at generated index: " + nums[index]);

		scan.close();
	}
}