package JavaActivity3;
import java.util.HashSet;

public class Activity3_2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Elements
        hs.add("S");
        hs.add("U");
        hs.add("B");
        hs.add("H");
        hs.add("A");
        hs.add("S");
        hs.add("H");
        
        //Printing
        System.out.println("Original HashSet: " + hs);        
        //Print size 
        System.out.println("Size of HashSet: " + hs.size());
        
        //Remove element
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        //Remove element that is not present
        if(hs.remove("Z")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
        
        //Search for element
        System.out.println("Checking if S is present: " + hs.contains("S"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}