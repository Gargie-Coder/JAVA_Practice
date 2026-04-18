package Inheritence;
public class teamemployee extends Employee {
  
  int bonus;//own members of the child class
  // public void setbonus(int bonus){
  //   this.bonus=bonus; 
  // }
  public teamemployee(String ename,int eid,String emid,int esal,int bonus){//parameterized constructor of the child class that calls the parent class constructor and must be the first statement becuase the parent class constructor is called first in the child class constructor 
    super(ename,eid,emid,esal);
    this.bonus=bonus;
  }
  
  @Override//Overriding the display method of employee class
  public void display(){
    super.display();
    System.out.println("Bonus:"+bonus);
  
  }  
   @Override
    public void calSalary(){
    int da=42;
    int hra=3;
    int ta=24;
    double totsal=getSal()+(da+hra+ta)/100.0+bonus;
  System.out.println("Total Salary: " + totsal);
  }
/**
 * Main method for testing teamemployee class
 * This program demonstrates the teamemployee class by creating a teamemployee object
 * and calling its methods
 * @param args command line arguments (not used)
 */
public static void main(String[] args) {
  teamemployee te= new teamemployee();
  te.setbonus(200000);
  te.setdata("Gungun",99,"gungun@gmail.com",100000);
  te.display();
  te.calSalary();
}

}



