public class Multi extends Thread {
  public void run(){
    for(int i=0;i<10;i++){
      System.out.println("User Thread is running..."+i);
    }
  }
  public static void main(String[]args){
    Multi t1=new Multi();
    t1.start();
    Multi t2=new Multi();
    t2.start();
    //  for(int i=0;i<5;i++){
    //   System.out.println("Main Thread is running..."+i);
    // }


  }
}
