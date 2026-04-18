import java.util.*;
public class hehe{
  public static void main(String[] args) {
    int[] arr={5,8,3,7,9,1};
    int n=arr.length;
     int max=-1;
    for(int i=0;i<n-1;i++){
      int count=1;
      for(int j=0;j<n-i-1;j++){
        if(arr[i]<arr[j]){
          count++;
          
        }
      }
     max = Math.max(count, max);
    }
    System.out.println(max);
  }
}