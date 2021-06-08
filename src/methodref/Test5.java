package methodref;

//Constructor Method Referencing
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class Test5 {  
    public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello, I am Indrajit");  
    }  
}  