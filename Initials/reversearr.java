package Initials;
import java.util.Scanner;
public class reversearr {
  public static void swap (int arr[],int beg,int end){
    
      int temp=arr[beg];
      arr[beg]=arr[end];
      arr[end]=temp;
    };
  
  }
  public static void reverse( int arr[]){
    int beg=0;
    int end=arr.length-1;
    while(beg<end){
      swap(arr,beg,end);
      beg++;
      end--;
    }
    
      
    
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]= new int[10];
      for(int i=0;i<arr.length;i++){
       arr[i]= sc.nextInt();
      }
      System.out.println("The array initially is this");
      for(int i:arr){
      System.out.println(i);
      }
      reverse(arr);
      System.out.println("After the reversal");
      for(int i:arr){
      System.out.println(i);
      }
  }
}