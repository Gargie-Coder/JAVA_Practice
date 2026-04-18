public class student{
  private String name;
  private int age;
  private int rollno;
  student(String name,int age,int rno){
    this.name=name;
    this.age=age;
    this.rollno= rno;
  }
  void getstudent(){
    System.out.println("Name:"+name+"\tAge:"+age+"\tRoll no:"+rollno);
  }

}