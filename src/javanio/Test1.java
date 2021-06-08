package javanio;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//folder creation
public class Test1 {
	public static void main(String[] args) {
		try {Path p=Paths.get("D:\\Capgemini Internship\\Classes\\DataSet");
		if(Files.exists(p)) {
			System.out.println("Already exists");
		}else {
			Path donePath = Files.createDirectories(p);
			System.out.println("Directory created at: "+donePath.toString());} 
			}
		catch (IOException e) {e.printStackTrace();}
		
	}
}
