package Inheritence;
public class emmain {
  public static void main(String[]args){
Inheritence.teamemployee e1 = new Inheritence.teamemployee();
   e1.setdata("Gargie", 91, "grace@gmail.com", 10000000);//since the private members can't be accessed but are able to do so because the methods are made public
   e1.display();
   e1.calSalary();
  }
}
