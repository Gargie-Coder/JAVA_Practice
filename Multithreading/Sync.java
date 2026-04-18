public class Sync{
  public static void main(String[] args){
    Table t=new Table();
    First t1=new First(t);
    t1.start();
    Second t2=new Second(t);
    t2.start();
  }
}