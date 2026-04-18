public class Person {
  private String name;
  private int age;
  public Person(String n,int a){//constructor
    this.name=n;
    this.age=a;
  }
  public void setter(String n,int a){
    name=n;
    age=a;
  }
  public void getter(){
    System.out.println("name:"+name+" "+"age:"+age);
  }
 public void getdetails(){
  System.out.println("name:"+name+" "+"age:"+age);
 }
}
