package Initials;
import java.util.Scanner;
class hello{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int arr[] = new int[10];
    System.out.println("Enter the elements of the array:");
    for(int item:arr){
     arr[item]=in.nextInt();
     System.out.println(arr[item]+" ");
    }
  

  }
}