package Initials;
public class mulinherC implements mulinherA, mulinherB {
  public void methodA() {
    System.out.println("Implementation of methodA from mulinherA");
  }
  public void methodB() {
    System.out.println("Implementation of methodB from mulinherB");
  }
  public void methodC() {
    System.out.println("MethodC from mulinherC");
  }
  public static void main(String[] args) {
    mulinherA obj = new mulinherC();
    obj.methodA();
    mulinherB obj2 = new mulinherC();
    obj2.methodB();
    // obj2.methodA();// This line will cause a compile-time error because methodA() is not defined in mulinherB
    // obj2.methodC();// This line will cause a compile-time error because methodC() is not defined in mulinherB

    mulinherC obj3 = new mulinherC();
    obj3.methodA();
    obj3.methodB();
    obj3.methodC();

  }
}
