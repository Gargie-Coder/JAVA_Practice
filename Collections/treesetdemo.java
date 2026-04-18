import java.util.*;
class namecomparator implements Comparator<employee>{
    @Override
    public int compare(employee e1, employee e2){
        int result = e1.empname.compareTo(e2.empname);

        if(result == 0){
            return e1.empid - e2.empid; // tie-breaker
        }

        return result;
    }
}
  class salarycomparator implements Comparator<employee>{
    @Override
    public int compare(employee e1, employee e2){
        int result = Double.compare(e2.salary, e1.salary); // primary

        if(result == 0){
            return e1.empid - e2.empid; // secondary (unique)
        }

        return result;
    }
}
public class treesetdemo {
  public static void main(String[] args) {
    // TreeSet<Integer> set=new TreeSet<>();
    // set.add(30);
    // set.add(10);
    // set.add(20);
    // set.add(20);
    // System.out.println(set);
    //  TreeSet<String> set1=new TreeSet<>();
    //  set1.add("John");
    //  set1.add("Alice");
    //  set1.add("Bob");
    //  set1.add("John");
    //  System.out.println(set1);
//     TreeSet → asks Comparator → "Who comes first?"
// Comparator → answers using compare()
// TreeSet → places element accordingly
    TreeSet<employee> ts1=new TreeSet<>(new namecomparator());
    employee e1=new employee(1,"Gargue",50000000.00);
    employee e2=new employee(2,"Parth", 500000000.00);
    employee e3=new employee(3,"Gungun", 5000000000.00);
    employee e4=new employee(4,"Gungun", 50000000.00);
    ts1.add(e1);
    ts1.add(e2);
    ts1.add(e3);
    ts1.add(e4);
    System.out.println("Names in asc order");
     for(employee e:ts1){
      System.out.println(e.empid+" "+e.empname+" "+e.salary);
    }
      TreeSet<employee> ts2=new TreeSet<>(new salarycomparator());
      ts2.add(e1);
      ts2.add(e2);
      ts2.add(e3);
      ts2.add(e4);
      System.out.println("Salary in desc order");
        for(employee e:ts2){
        System.out.println(e.empid+" "+e.empname+" "+e.salary);
      }
  

  }
  
}


