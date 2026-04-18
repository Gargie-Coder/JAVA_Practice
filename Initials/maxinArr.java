package Initials;
public class maxinArr {
public static int max( int[]arr){
  int max =arr[0];
  for(int item:arr){
   if(item>max){
    max=item;
    }
  }
return max;
}
 public static void main(String[] args) {
     int arr[] = {2,5,3,6,3};
     System.out.println(max(arr));
 }
  
}


