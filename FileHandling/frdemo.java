import java.io.*;
public class frdemo {
  public static void main(String[] args) throws Exception {
    File f=new File("file.txt");
    //read()-reads one character at a time and returns its ASCII value and if end of file is reached it returns -1
    FileReader fr=new FileReader(f);
    int i,count=0;
    while((i=fr.read())!=-1){
      System.out.print((char)i);
      count++;
    }
    System.out.println("\nTotal characters in the file: "+count);
    fr.close();

  }
}
