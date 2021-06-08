package methodref;

interface i1{
    public String m1(String s);
}

class A{
    public String c(String s){
        if(s.length()>3){
            s=s.toUpperCase();
        }else{
            s=s.toLowerCase();
        }
        return s;
    }
}
class B{
    public void print(String s,i1 m){
        s=m.m1(s);
        System.out.println(s);
    }
}

public class Test1{

     public static void main(String []args){
         B b=new B();
         A a=new A();
         String s="Indrajit";
         //String s="Ind";
         b.print(s,a::c);
        
     }
}