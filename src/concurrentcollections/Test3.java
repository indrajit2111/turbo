package concurrentcollections;
import java.util.concurrent.*;
public class Test3 {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> arr= new CopyOnWriteArrayList<Integer>();
		arr.add(102);
		arr.add(101);
		arr.addIfAbsent(105);
		arr.removeIf((i)->i<102);
		System.out.println(arr);
		
		CopyOnWriteArraySet<Integer> arr1= new CopyOnWriteArraySet<Integer>();
		arr1.add(102);
		arr1.add(101);
		arr1.removeIf((i)->i<102);
		System.out.println(arr1);
	}

}
