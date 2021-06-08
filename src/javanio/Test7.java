package javanio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Test7 {
	public static void main(String[] args) {

		try {
			Path p = Paths.get("D:\\Capgemini Internship\\Classes\\DataSet\\New1.txt");
			//Path donePath = Files.createFile(p);
			for(int i=0;i<10;i++) {
			String str = "This is appending" + i;
			Files.write(p, System.getProperty("line.separator").getBytes(),StandardOpenOption.APPEND);
			Files.write(p, str.getBytes(),StandardOpenOption.APPEND);
			Files.write(p, System.getProperty("line.separator").getBytes(),StandardOpenOption.APPEND);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
