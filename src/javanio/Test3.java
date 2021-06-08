package javanio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

//Read From File
public class Test3 {
	public static void main(String[] args) {try 
		{
		Path p=Paths.get("D:\\Capgemini Internship\\Classes\\DataSet\\xyz.txt");
		List<String> data=Files.readAllLines(p);
		data.forEach(System.out::println);
			
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}
