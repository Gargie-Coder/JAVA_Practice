
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class driver2 {
    public static void main(String[] args) throws Exception {
        Object obj=new String("Welcome to Java");
        Thread t=new Thread();
        List<?> l=new ArrayList<>();
        Class c=Math.class;//java.lang.Math
        //Class c=obj.getClass();java.lang.String
        //Class c=t.getClass();java.lang.Thread
        //Class c=l.getClass();java.util.ArrayList
        System.out.println("Fully Qualified Class Name: "+c.getName());
        Method[] m=c.getDeclaredMethods();
        Field[] f=c.getDeclaredFields();
        int methodc=0;
        int fieldc=0;
        for(Method method:m){
          Class<?>[] param=method.getParameterTypes();
          for(int i=0;i<param.length;i++){
            System.out.print("parameter: "+(i+1)+" "+param[i].getName()+" ");
          }
          methodc++;
            System.out.println("Method Name: "+method.getName());
        }
        for(Field field:f){
          fieldc++;
            System.out.println("Field Name: "+field.getName());
        }
        System.out.println("Number of Methods: "+methodc);
        System.out.println("Number of Fields: "+fieldc);
    }
}
