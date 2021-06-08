package assignments;
class Account{
    public long accNum;
    public double balance;
    public Person accHolder;
    
        public long getAccNum(){return accNum;}
        public void setAccNum(long l){this.accNum=l;}
       public double getBal(){return balance;}
       public void setBalance(double b){this.balance=b;}
        public Person getAccHolder(){return accHolder;}
        public void setAccHolder(Person p){this.accHolder=p;}
    
    public void withdraw(double bal){
        this.balance-=bal;
    }
    public void deposit(double bal1){
        this.balance+=bal1;
    }
    public double getBalance(){
        return balance;
    }
}

class Person{
    public String name;
    public float age;
       public String getName(){return name;}
       public void setName(String s){this.name=s;}
       public double getAge(){return age;}
       public void setAge(float a){this.age=a;}
}

class SavingsAccount extends Account{
    final double minimum=500.00;
    //@Override
    public void withdraw(double bal2){
        if(this.balance>minimum){
            this.balance-=bal2;
        }else{
            System.out.println("Insufficient funds");
        }
    }
}
class CurrentAccount extends Account{
    public double ovrdraft=2500.00;
    //@Override
    public void withdraw(double bal3){
        if(bal3<(balance+ovrdraft)){
            this.balance-=bal3;
        }
    }
}


public class Inheritance1 {
	public static void main(String []args){
        Account a1=new Account();
        Account a2=new Account();
        Person p1=new Person();
        Person p2=new Person();
        p1.setName("Smith");
        p1.setAge(69.00f);
        a1.setAccNum(101);
        a1.setBalance(2000.00);
        a1.setAccHolder(p1);
        p2.setName("Kathy");
        p2.setAge(33.33f);
        a2.setAccNum(102);
        a2.setBalance(3000.00);
        a2.setAccHolder(p2);
        a2.withdraw(2000.00);
        a1.deposit(2000.00);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        
        
    }
}
