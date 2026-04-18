package Inheritence;
public class Employee {
  private String name;
  private int id;
  private String emailid;
  private int Salary;
  public Employee(String ename,int eid,String emid,int esal){
    this.name=ename;
    this.id=eid;
    this.emailid=emid;
    this.Salary=esal;
  }
  // public void setdata(String ename,int eid,String emid,int esal){
  //   this.name=ename;
  //   this.id=eid;
  //   this.emailid=emid;
  //   this.Salary=esal;
  // }
  public void display(){
    System.out.println(name+" "+id+" "+emailid+" "+Salary);
  }
  public int getSal(){
    return Salary;
  }
  public void calSalary(){
    int da=42;
    int hra=3;
    int ta=24;
    System.out.println("Total Salary"+Salary+da+hra+ta);
  }



}
