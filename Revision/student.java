public class student extends Person {
  private int rollno;
  public student(String n,int a,int rollno){//if a parent class has constructor then the child class must also have it so we are using super constructor to invoke the parent constructor
      super(n, a);
      this.rollno=rollno;
  }
  public void getdetails(){
    super.getdetails();//to get the private members of the parent class printed we will call the getdetails method of the parent class using the super keyword
 System.out.println("rollno:"+rollno);
 }
  public void getstudent() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getstudent'");
  }
}
