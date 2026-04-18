
import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest {
  public static void main(String[] args) {
      ArrayList<String> list=new ArrayList<>();
      list.add("Hello");
      list.add("World");
      // list.add(123); // Compile-time error: incompatible types
      String str=list.get(0); // No cast needed
      System.out.println(str);
      Iterator<String> it=list.iterator();
      while(it.hasNext()){
        String st=it.next();//type casting not needed
        System.out.println(st);
         
      }
      genericsum<Integer> sum1=new genericsum<>(5, 10);
      System.out.println(sum1.sum());
      genericsum<Double> sum2=new genericsum<>(5.5, 10.5);
      System.out.println(sum2.sum());
      genericsum<String> sum3=new genericsum<>("Hello, ", "World!");
      System.out.println(sum3.sum());

  }
}
