package JavaActivity3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	
	private static String FILE_NAME1 = "resources1/TestSheet.xlsx";
	
	public static void main(String[] args) {
		int rowNum=0;
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet(" DataType in JAVA ");
		Object [][] data = {
			    {"Datatype", "Type", "Size(in bytes)"},
			    {"int", "Primitive", 2},
			    {"float", "Primitive", 4},
			    {"double", "Primitive", 8},
			    {"char", "Primitive", 1},
			    {"String", "Non-Primitive", "No fixed size"}
			};
		
		for(Object [] d : data)
		{
			Row row= sheet.createRow(rowNum);
					rowNum++;
			int colNum=0;
			for (Object field: d)
			{
				
				Cell cell= row.createCell(colNum);
					
						colNum++;
			if(field instanceof String)
			{
				cell.setCellValue((String) field);
			}
			else if (field instanceof Integer)
			{
				cell.setCellValue((Integer) field);
			}
				
			}
			
		}	
		
		try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME1);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
		
	}

