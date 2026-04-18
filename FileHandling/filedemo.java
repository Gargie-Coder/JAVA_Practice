import java.io.*;
public class filedemo  {
 public static void main(String[] args) throws IOException {
  // File f=new File("file.txt");//created or if already exits it is replaced
  FileWriter fw =new FileWriter("file.txt",true);//true for appending
  fw.write("Hey Buddy I got the summertime summertime sadness\n");
  fw.write("There's nothing wrong contemplating God"); 
  fw.close();
 }


}
