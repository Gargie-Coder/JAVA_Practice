
import java.lang.reflect.*;

public class Testclass {
  private int tid;
  private static String tname="This is confidential";
  public static void main(String[] args) throws Exception {
      Testclass t=new Testclass();
      Class c=t.getClass();
      System.out.println("Fully Qualified Class Name: "+c.getName());
      Field[] f=c.getDeclaredFields();
      for(Field field:f){
          System.out.println("Field Name: "+field.getName()+"->"+Modifier.toString(field.getModifiers()));

      }
      Field str=c.getDeclaredField("tname");
      str.setAccessible(true);
      System.out.println("Field Value: "+str.get(t));

  }
}
