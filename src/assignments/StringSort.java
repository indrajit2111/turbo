package assignments;

import java.util.*;
public class StringSort {

 static String sortStrings(String[] str) {
	 String temp;
	  
	  for(int i=0;i<str.length;i++) {
		  for(int j=i+1;j<str.length;j++) {
		   
			  if(str[i].compareTo(str[j])>0)
			   { temp=str[i];
				 
				str[i]=str[j];
				   str[j]=temp; 
 }
		  }
	  } 
	  
	  if(str.length % 2!=0) {
		 
		  for(int i=0;i<str.length/2+1;i++) {
			  str[i]=str[i].toUpperCase();
		  }for(int i=str.length/2+1;i<str.length;i++) {
			  str[i]=str[i].toLowerCase();
		  }
	  }
	  else if(str.length % 2==0) {
		 
		  for(int i=0;i<str.length/2;i++) {
			  str[i]=str[i].toUpperCase();
		  }for(int i=str.length/2+1;i<str.length;i++) {
			  str[i]=str[i].toLowerCase();
		  }
	  }
	  return Arrays.toString(str);
 }
 public static void main(String args[]) {
     
	   System.out.println("Enter the  number of strings : ");
	  Scanner sc= new Scanner(System.in);
	   int n= sc.nextInt();
	   String s[]= new String[n];
	   Scanner c= new Scanner(System.in);
	   for(int i=0;i<n;i++) {
	   s[i] = c.nextLine();
	
}
	   
	   System.out.println(sortStrings(s));
 }
}