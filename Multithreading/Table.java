class Table{
public synchronized  void printTable(int n){//synchonized keyword is used to maintain the order and prevent one thread to interfere while other thread is using a resource
for(int i=1;i<=10;i++){
System.out.println(n+"*"+i+"="+(n*i));
try {
    Thread.sleep(500);
} catch (Exception e) {
}
}}
}
class First extends Thread{
  Table t;
  public First(Table t){
    this.t=t;
  }
  public void run(){
    t.printTable(19);
  }
}
class Second extends Thread{
  Table t;
  public Second(Table t){
    this.t=t;
  }
  public void run(){
    t.printTable(20);
  }
}