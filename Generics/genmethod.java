public class genmethod {
 <E> void printArray(E[] elements) {
      for(E element:elements){
          System.out.println(element);
      }
}
    public static void main(String[] args) {
        genmethod gm=new genmethod();
        Integer[] intArray={1,2,3,4,5};
        String[] strArray={"Hello","World"};
        System.out.println("Integer Array:");
        gm.<Integer>printArray(intArray);
        System.out.println("String Array:");
        gm.<String>printArray(strArray);
    }
}