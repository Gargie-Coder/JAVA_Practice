
//Runnable is a functional interface and can be implemented using lambda expression
//  it is used becuase java does not support multiple inheritance and if we want to extend some other class and also want to create a thread then we can implement Runnable interface

public class RunnableDemo implements Runnable {
  public void run(){
    for(int i=0;i<10;i++){
      System.out.println("User Thread is running..."+i);
    }
  }
    public static void main(String[]args){
    RunnableDemo t1=new RunnableDemo();
    Thread th1=new Thread(t1);
    th1.start();
    RunnableDemo t2=new RunnableDemo();
    Thread th2=new Thread(t2);
    th2.start();
    // th2.run();//runs like normal method call and not as a thread
    // th1.run();//runs like normal method call and not as a thread
   

  }
}
