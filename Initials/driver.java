package Initials;
public class driver implements printable {
  public void show() {
    System.out.println("Hello, I am showing something!");
  }
  
  public void print() {
    System.out.println("Hello, I am printing something!");
  }
  
  public static void main(String[] args) {
    printable obj = new driver();//upcastingm
    obj.show();
    obj.print();
  }
  
}
