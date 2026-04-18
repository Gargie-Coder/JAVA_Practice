class driver extends Thread{
   public static void main(String[] args) {
         Display d=new Display();
         Thread t1=new Thread(){
            public void run(){
               d.printsmall();
            }
         };
         Thread t2=new Thread(){
            public void run(){
               d.printlarge();
            }
         };
         t1.start();
         t2.start();

   }
}