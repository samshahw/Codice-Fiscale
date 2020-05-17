import java.util.Calendar;

public class DataNascita {

  public static String anno(String anno) {

    if (Integer.parseInt(anno) < 1900 ||
        Integer.parseInt(anno) > Calendar.getInstance().get(Calendar.YEAR)) {
      System.exit(-1);
    }

    return anno.substring(2);
  }


  public static String mese(int mese) {

    if (mese < 1 || mese > 12) {
      System.exit(-1);
    }

    mese -= 1;

    String[] months = {"A", "B", "C", "D", "E", "H", "L", "M", "P", "R", "S", "T"};

    return months[mese];
  }


  public static String giorno(int giorno, String sesso) {

    if (giorno < 1 || giorno > 31) {
      System.exit(-1);
    }

    if (!(sesso.equals("M") || sesso.equals("F"))) {
      System.exit(-1);
    }

    if (sesso.equals("F")) {
      giorno += 40;
    }

    return String.valueOf(giorno);
  }

}
