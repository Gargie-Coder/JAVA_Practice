package Initials;
public class SBI implements RBI{
  public void deposit(){
    System.out.println("Deposit success and you got an interest rate of "+IntRate+"%");
  }//compiler will consider it as public static void deposit(){},also these methods should be written public if they are not written public then it will give error because by default interface methods are public abstract.*attempting to assign weaker access privileges; was public.*
  public void withdraw(){
    System.out.println("Withdraw success");
  }//compiler will consider it as public static void withdraw(){}
  public void transfer(){
    System.out.println("Transfer success");
  }//this method is not present in interface so no need to write it as public
  public static void main(String[] args) {
    SBI s=new SBI();
    s.deposit();
    s.withdraw();
    s.transfer();
    RBI r=new SBI();
    r.deposit();
    r.withdraw();
    //r.transfer();//error:cannot find symbol because reference variable r of type RBI cannot access method transfer() which is not present in RBI interface
    //r.IntRate=4.5;//error:cannot assign a value to final variable IntRate
    
  }
}