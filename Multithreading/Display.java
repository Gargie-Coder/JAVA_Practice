public class Display{
  public synchronized void printsmall(){
 for(int i=97;i<113;i++)
    System.out.println((char)i);
  }
  public synchronized void printlarge(){
    for(int i=65;i<90;i++)
    System.out.println((char)i);
  }
}
