package ReflectionAPI;
import java.lang.reflect.*;



public class driver {
  public static void main(String[] args) {
      myclass obj=new myclass("Draco", 25, "New York");
      Field[] fields=obj.getClass().getDeclaredFields();
      for(Field field:fields){
        if(field.getName().equals("name")){
          try {
            field.setAccessible(true);
              field.set(obj, "Tom Felton");
          } catch (Exception e) {
          }
          
        }
        System.out.println("Field Name: "+field.getName());
        System.out.println("Field Type: "+field.getType());
        System.out.println("Field Modifiers: "+Modifier.toString(field.getModifiers()));
        System.out.println();
        System.out.println("Updated Name: "+obj.getName());
      }
      
  }
}
