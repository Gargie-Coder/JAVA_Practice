
import java.util.*;

public class ArrayListdemo {
  public static void main(String[] args) {
    List<String> List=new ArrayList<>();
    List.add("John");
    List.add("Alice");
    List.add("Bob");
    List.add("John");
    List.add("Gargie");
    List.add("Gungun");
    System.out.println(List);
    Iterator<String> it=List.iterator();
    while(it.hasNext()){
     System.out.print(it.next()+" ");
    }
    List.set(4,"Gracy");
    System.out.println(List);
    System.out.println(List.get(4));
      List.remove(5);
    System.out.println(List.lastIndexOf(("John")));
      List.remove("John");
      List.clear();
      List<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    System.out.println(Collections.binarySearch(list, 30));
    
  }
}
