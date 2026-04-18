package Initials;
public class factorial{
  public int fact(int n){
    if(n<=1){
      return 1;
    }
    else{
      return n*fact(n-1);
    }
  }
  public static void main(String[] args) {
    factorial f=new factorial();
    System.err.println(f.fact(5));
  }
}