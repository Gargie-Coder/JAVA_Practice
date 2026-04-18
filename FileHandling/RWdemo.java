import java.io.*;
public class RWdemo {
/**
 * Main method of the program.
 * This method reads a file, copies its content to another file and prints the content of the file.
 * It throws an exception if there is an error while reading or writing to the file.
 * @param args The command line arguments passed to the program.
 * @throws Exception If there is an error while reading or writing to the file.
 */

  public static void main(String[] args) throws Exception {
  //throws is used to declare that a method may cause a checked exception and transfers the responsibility of handling it to the caller. 
   File f=new File("RWdemo.txt");
    FileReader fr=new FileReader("file.txt");
    FileWriter fw=new FileWriter(f);
    int i;
    while((i=fr.read())!=-1){
      fw.write(i);
      System.out.print((char)i);//int to char conversion
    }
    System.out.println("\nFile copied successfully");
    fr.close();
    fw.close();
  }
}
