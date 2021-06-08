package arrays;

public class Arrays3 {
public static void main(String[] args) {
		
		int arr[][]={{1,2,3},{2,4,5},{5,7,4}};

		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}


}
