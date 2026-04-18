package Initials;
public class outer_class {
  private int data=99;
  
  class inner_class{
    void display(){
    System.out.println("Inner class inside outer_class"+data);//can  directly access all the variables and methods of outer class
    }}
    void displayo(){
      inner_class in=new inner_class();
      in.display();

  }
  public static void main(String[] args) {
      outer_class outer=new outer_class();
      outer_class.inner_class inner=outer.new inner_class();//creating instance of inner class that only exists within outer class so we need to create instance of outer class first
      inner.display();
      outer.displayo();
  }
}
