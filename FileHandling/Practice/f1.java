
import java.io.*;

// package FileHandling.Practice;
public class f1 {
  public static void main(String args[]) {
    File file = new File("abc.txt");

    try {
      if (!file.exists()) {
        System.out.println("abc.txt not found — creating file with sample text.");
        try (FileWriter fw = new FileWriter(file)) {
          fw.write("Sample text\nFirst line from abc.txt\n");
        }
      }

      System.out.println("Reading abc.txt:");
      try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
          System.out.println(line);
        }
      }
    } catch (IOException e) {
      System.err.println("I/O error: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
