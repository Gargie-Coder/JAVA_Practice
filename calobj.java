package Initials;
public class calobj {
  public static void main(String[] args) {
    Calculator cal =new Calculator();
    cal.setter(3, 8);
    System.out.println(cal.add());
  }
}
