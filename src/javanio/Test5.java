package javanio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
//Write the content of a file to new file
public class Test5 {
	public static void main(String[] args) {
		
		try {
			Path p1=Paths.get("D:\\Capgemini Internship\\Classes\\DataSet\\New2.txt");
			Path donePath1=Files.createFile(p1);
			
			Path p2=Paths.get("D:\\Capgemini Internship\\Classes\\DataSet\\xyz.txt");
			List<String> data=Files.readAllLines(p2);
			Files.write(donePath1,data);
			System.out.println("Data is transferred from: "+ p2.toString()+" to: "+p1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
