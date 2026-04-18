import java.util.Scanner;
public class solution {
  public static void main(String[]args){
   //1
    String s1="Welcome to the jungle";
   //2 
    System.out.println("Enter a String");
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    for(char ch:input.toCharArray()){
      System.out.println(ch);
    }
   //3
    String s2="Gungun";
    String s3="gungun";
    System.out.println(s2.equals(s3));
    System.out.println(s2==s3);
  //4
  System.out.println(s3.toUpperCase()+s1.toLowerCase());
  //5
    System.out.println(s2.isEmpty());
  //6
  System.out.println(s1.charAt(0));
  System.out.println(s1.charAt(s1.length()-1));
  //7
  String s4=s2+s3;
  StringBuffer sb= new StringBuffer("hello");
  sb.append(s3);
  StringBuilder sbl=new StringBuilder("Bye");
  sbl.append(sb);
  System.out.println(s4+sb+sbl);
  //8
  System.out.println(s2.startsWith("G"));
  System.out.println(s2.endsWith("g"));
  


   
  }
}
