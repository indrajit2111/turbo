package javanio;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//file creation
public class Test2 {
	public static void main(String[] args) {
		try {Path p=Paths.get("D:\\Capgemini Internship\\Classes\\DataSet\\xyz.txt");
		if(Files.exists(p)) {
			System.out.println("File Already exists");
		}else {
			Path donePath = Files.createFile(p);
			System.out.println("File created at: "+donePath.toString());} 
			}
		catch (IOException e) {e.printStackTrace();}
		
	}
}