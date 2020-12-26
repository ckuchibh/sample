/*	1. Create a Java class with the main method.
	2. Create an object for the OpenCSV Class with the file path of the CSV as its parameter.
	3. Use the readAll() method to read the contents of the CSV file.
	4. Use the size() method to count the number of rows in the CSV file.
	5. Create an iterator to iterate through the list and and print all the rows of the file.
	*/

package selenium;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Activity13_1 {
	
	public static void main(String[] args) throws IOException, CsvException {
		
		//Load CSV file
        CSVReader reader = new CSVReader(new FileReader("src/resources/vishnu.csv"));

        //Load content into list
        List<String[]> list = reader.readAll();
        System.out.println("Total number of rows are: " + list.size());

        //Create Iterator reference
        Iterator<String[]> itr = list.iterator();

        //Iterate all values
        while(itr.hasNext()) {
            String[] str = itr.next();

            System.out.print("Values are: ");
            for(int i=0;i<str.length;i++) {
                System.out.print(" " + str[i]);
            }
            System.out.println(" ");
        }
        
        reader.close();
	}
}