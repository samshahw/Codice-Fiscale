import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Comune {

  public static String comune(String s) {

    String chatFile = "comuni.csv";
    String line;                                        // String to store the line contents
    String fileSplitBy = ",";                           // .csv are comma-separated files

    // Store the file contents in a BufferedReader object
    try {

      BufferedReader br = new BufferedReader(new FileReader(chatFile));

      while ((line = br.readLine()) !=
          null) {        // While the file has stile content (8105 rows)

        String[] row = line.split(fileSplitBy);     // Split every row in an array of strings

        if (row[0].equals(s.toUpperCase()))         // row[0]: nome del comune, row[1]: codice
        {
          return row[1];
        }
      }
    } catch (IOException e) {

      e.printStackTrace();
    }

    return "0000";
  }

}
