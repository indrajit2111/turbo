package methodref;

interface Sayable{  
    void say();  
}  
public class Test2 {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method referencing");  
    }
    public static void saySomething1(){  
        System.out.println("Hello, why is this is static method referencing");  
    }
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = Test2::saySomething1;  
        // Calling interface method  
        sayable.say();  
    }  
}  

