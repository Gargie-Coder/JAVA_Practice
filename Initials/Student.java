package Initials;
public class Student {
  private String sname;//instance variables
  private int sage;
  private int srollnumber;
  public void setStudent(String name,int age,int rno){
     sname=name;
     sage=age;
     srollnumber = rno;

  }
  public void getStudent(){
    System.out.println(sname+" "+sage+" "+srollnumber);
  }
}
