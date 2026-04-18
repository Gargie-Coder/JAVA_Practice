import java.util.*;

public class stackdemo {
  public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 String str=sc.nextLine();
    Stack s=new Stack();
   for(Character ch:str.toCharArray()){
     s.push(ch);
   }
   String rev="";
   for(Character ch:str.toCharArray()){
     rev=rev+s.pop();
   }
   System.out.println(rev.equalsIgnoreCase(str));
  }
}
