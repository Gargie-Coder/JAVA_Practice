public class ITCdemo {
  public static void main(String[] args) {
      Customer c1 =new Customer(50000);
      new Thread(){//anonymous inner class
        public void run(){
          c1.withdraw(60000);
        }
      }.start();
      new Thread(){
     public void run(){
      c1.deposit(40000);
     }
      }.start();
  }
}
