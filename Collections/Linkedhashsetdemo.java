import java.util.LinkedHashSet;
 class Linkedhashsetdemo {
  public static void main(String[] args) {
    LinkedHashSet<Integer> set=new LinkedHashSet<>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(20);
    System.out.println(set);
     LinkedHashSet<String> set1=new LinkedHashSet<>();
     set1.add("John");
     set1.add("Alice");
     set1.add("Bob");
     set1.add("John");
     System.out.println(set1);
  }
}
