package Initials;
public class Stmain {
  public static void main(String[] args) {
    Studentmanagement S1=new Studentmanagement(110,"Gabriela","C");
    Studentmanagement S2=new Studentmanagement(112,"Gariela","A");
    Studentmanagement S3=new Studentmanagement(113,"Giela","B");
    // S1.setter(110,"Gabriela","C");//default constuctor
    S1.getter();
    
    // S2.setter(112,"Gariela","A");
    S2.getter();
   
    // S3.setter(113,"Giela","B");
    S3.getter();
    System.out.println(Studentmanagement.countS);
  }
}
