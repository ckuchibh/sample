package JavaActivity3;

import java.util.*;

public class Activity3_1 {
	
	public static void main(String[] args) {
		List<String> myList=new ArrayList<String>();
		
		myList.add("Apple");
		myList.add("Mango");
		myList.add("Orange");
		myList.add("Grapes");
		myList.add("Papaya");
		
		for(int i=0;i < myList.size(); i++) {
			System.out.println("MyList Entry:"+ myList.get(i));
		}
		System.out.println("Third Entry to the list : " + myList.get(2));
		System.out.println("Is guava in the list :"+ myList.contains("Guava"));
		
		myList.remove("Papaya");
		
		System.out.println("New Size of the list :"+ myList.size());
	}

}
