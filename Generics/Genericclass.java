

 class  MyGen<T> {
T obj;
    void add(T obj) {
        this.obj = obj;
    }
   T getObj() {
        return obj;  
}
}
public class Genericclass{
    public static void main(String[] args){
        MyGen<Integer> g1=new MyGen<Integer>();
        g1.add(100);
        System.out.println(g1.getObj());
        MyGen<String> g2=new MyGen<String>();
        g2.add("Hello");
        System.out.println(g2.getObj());
    }
}
