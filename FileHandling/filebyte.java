
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filebyte {
  public static void main(String[]args) throws Exception{
   
    FileOutputStream fo=new FileOutputStream("out.txt");
    String s="Hey Run down the city dhurandhar ,god damn lamborgini tick tock walk teri soni honi honi ki seene te mar geni ke hoja vina pyar tere naal mai dur dur rawa tenu bach te bachande";
    byte b[]= s.getBytes();
 
    fo.write(b);
    System.out.print("Succeessful exexution....");

    int i;
    FileInputStream fi=new FileInputStream("out.txt");
    while((i=fi.read())!=-1){
      System.out.print((char)i);
    }

    }

  }

