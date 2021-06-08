package collections;
import java.util.*;

public class Lab6_4 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> marks= new HashMap<Integer,Integer>();
		marks.put(100,98);
		marks.put(101,88);
		marks.put(102,48);
		marks.put(103,78);
		HashMap<Integer,String> medal= new HashMap<Integer,String>();
		for(Map.Entry<Integer,Integer> entry:marks.entrySet()) {
			if(entry.getValue()>=90) {
				 medal.put(entry.getKey(),"Gold");
			 }
			 else if(entry.getValue()>=80) {
				 medal.put(entry.getKey(),"Silver");
			 }
			 else if(entry.getValue()>=70) {
				 medal.put(entry.getKey(),"Bronze");
			 }
			 else {
				 medal.put(entry.getKey(),"Fail");
			 }
		}
		System.out.println(medal);
	}

}
