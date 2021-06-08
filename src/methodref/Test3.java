package methodref;
//static method referencing of runnable interface or a predefined interface
public class Test3 {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) { 
    	//this override run() method in Runnable interface without implementing the interface.
        Thread t2=new Thread(Test3::ThreadStatus);  
        t2.start();       
    }  
}  