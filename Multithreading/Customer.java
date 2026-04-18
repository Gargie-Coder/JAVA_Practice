public class Customer {
  double balance;
  public void getbalance(){
    System.err.println("Balance is:"+balance);
  }
  public Customer(double balance){
    this.balance=balance;
  }
  public synchronized void withdraw(double amount){
     System.out.println("Going to withdraw....");
    if(amount>balance){
      try {
        System.out.println("Waiting to be deposited as amount is more than the balance☹️");
          wait();
      } catch (Exception e) {
        System.err.println("Error");
      }
      balance=balance-amount;
     getbalance();
     System.out.println("Successfully withdrawn");
    }
  }
  public synchronized void deposit(double amount){
    System.out.println("Going to deposit....");
     balance=balance+amount;
     getbalance();
         System.out.println("Successfully deposited....");
     notify();
  }
}
