public class arrays {
  public static void main(String[] args) {
    student[] students = new student[3];
    students[0] = new student("John", 20, 101);
    students[1] = new student("Alice", 22, 102);  
    students[2] = new student("Bob", 19, 103);
    for (student s : students) {
      s.getstudent();  
    }
    Object[] arr=new Object[500];
    arr[0]=new student("Gargie",21,91);
    arr[1]=new student("Gungun",23,80);
    arr[2]=new customer(19,"Parth");
    for (Object elem : arr) {
      if (elem instanceof student) {
        ((student) elem).getstudent();
      } else if (elem instanceof customer) {
        ((customer) elem).getcustomer();
      }
        
    }
  
}
}