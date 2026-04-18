
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