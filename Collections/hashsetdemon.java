import java.util.HashSet;
public class hashsetdemon {
  public static void main(String[] args) {
    HashSet<Integer> set=new HashSet<>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(20);
    System.out.println(set);
     HashSet<String> set1=new HashSet<>();
     set1.add("John");
     set1.add("Alice");
     set1.add("Bob");
     set1.add("John");
     System.out.println(set1);
  }
}
