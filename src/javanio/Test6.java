package javanio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

//Copy File and Move File
public class Test6 {
	public static void main(String[] args) {
		try {
			System.out.println("Start time: "+new Date());
			Path source=Paths.get("C:\\Users\\Indrajit\\Downloads\\Zack.Snyders.Justice.League.2021.1080p.WEBRip.2GB.DD5.1.x264-GalaxyRG[TGx]\\Zack.Snyders.Justice.League.2021.1080p.WEBRip.2GB.DD5.1.x264-GalaxyRG.mkv");
			Path destination=Paths.get("D:\\Capgemini Internship\\Classes\\DataSet\\New1.mkv");
			Files.copy(source, destination);
			//Files.move(source, destination);
			System.out.println("End time: "+new Date());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
