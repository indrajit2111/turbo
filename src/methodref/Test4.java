package methodref;
import java.util.function.BiFunction;  

//Static Method reference of predefined interface through another class 
class Arithmetic{
	
public static int add(int a, int b){  
return a+b;
}  
public static float add(int a, float b){  
	return a+b;  
}  
public static float add(float a, float b){  
	return a+b;  
} 
}

public class Test4 {  
public static void main(String[] args) {  
BiFunction<Integer, Integer, Integer>adder1 = Arithmetic::add;
BiFunction<Integer, Float, Float>adder2 = Arithmetic::add;  
BiFunction<Float, Float, Float>adder3 = Arithmetic::add;  
int result1 = adder1.apply(10, 20);  
float result2 = adder2.apply(15, 20.0f);  
float result3 = adder3.apply(35.7f, 20.0f);  
System.out.println(result1);  
System.out.println(result2);  
System.out.println(result3);   
}  
}