import java.util.*;
public class wildcard {
  public static void main(String[] args){
  List<Integer> intList=new ArrayList<>();
  intList.add(1);
  intList.add(2);
  intList.add(3);
  List<Double> doubleList=new ArrayList<>();
  doubleList.add(1.5);
  doubleList.add(2.5);
  doubleList.add(3.5);
  System.out.println("Sum of integers: "+sum(intList));
  System.out.println("Sum of doubles: "+sum(doubleList));
  }
  public static double sum(List<? extends Number> list){
    double s=0;
    for(Number n:list){
      s+=n.doubleValue();
    }
    return s;
  }
}
