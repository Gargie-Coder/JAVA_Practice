
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class streambuffer {
  public static void main(String[] args) throws Exception  {
    BufferedInputStream bi=new BufferedInputStream(new FileInputStream("streambuffer.java"));
    BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("bout.txt"));
     int i;
  while((i=bi.read())!=-1){
    bo.write(i);
  }
  bo.close();
bi.close();

}}
