package JavaActivity4;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] data = { 10, 5, 3, 4, 15 };
	        ascendingSort(data);
	        System.out.println("Sorted Array in Ascending Order: ");
	        System.out.println(Arrays.toString(data));
	}

	static void ascendingSort(int array[]) {
		// TODO Auto-generated method stub
		int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
	}

}
