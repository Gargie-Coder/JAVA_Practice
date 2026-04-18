package Initials;
public class Studentmanagement { 
  private int sid; //instance variables
  private String sname;
  private String sgrade;
 static int countS;
  public Studentmanagement(){
    System.out.println("this is a default constructor");
  }
  public Studentmanagement(int sid,String sname,String sgrade){
   this.sgrade=sgrade;
   this.sid=sid;
   this.sname=sname;
   countS++;
  
  }
  
   
  public void setter(int id,String name,String grades){ //local variables
   sid=id;
   sname=name;
   if("A".equals(grades) || "B".equals(grades) || "C".equals(grades) || "D".equals(grades) || "E".equals(grades)){
      sgrade= grades;
   }
   else{
    System.out.println("Enter a valid grade");
   }
   
  }
  public void getter(){
    System.out.println(sid+" "+sname+" "+sgrade);
  }
}
