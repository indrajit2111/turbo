package javanio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//Write in file
public class Test4 {
	public static void main(String[] args) {
		try {
			
			/*
			 * Path p = Paths.get("D:\\Capgemini Internship\\Classes\\DataSet\\New1.txt");
			 * Path donePath = Files.createFile(p); String str =
			 * "Hello My name is Indrajit"; Files.write(donePath, str.getBytes());
			 * System.out.println("Data is written on: " + p.toString());
			 */
			//Write the content of a file to new file
			Path p1=Paths.get("D:\\Capgemini Internship\\Classes\\DataSet\\New2.txt");
			Path donePath1=Files.createFile(p1);
			
			Path p2=Paths.get("D:\\Capgemini Internship\\Classes\\DataSet\\xyz.txt");
			List<String> data=Files.readAllLines(p2);
			Files.write(donePath1,data);
			System.out.println("Data is transferred from: "+ p2.toString()+" to: "+p1.toString());
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
