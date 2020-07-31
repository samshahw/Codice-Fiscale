import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    StringBuilder codiceFiscale = new StringBuilder();

    String nome, cognome, sesso, comune, annoNascita;
    int meseNascita, giornoNascita;

    // Nome
    System.out.print("Nome: ");
    nome = scan.nextLine();

    // Cognome
    System.out.print("Cognome: ");
    cognome = scan.nextLine();

    // Anno di nascita
    System.out.print("Anno di nascita: ");
    annoNascita = scan.next();

    // Mese di nascita
    System.out.print("Mese di nascita (numero): ");
    meseNascita = scan.nextInt();

    // Giorno di nascita
    System.out.print("Giorno di nascita: ");
    giornoNascita = scan.nextInt();

    // Sesso
    System.out.print("Sesso (M o F): ");
    sesso = scan.next();

    // Comune
    System.out.print("Comune: ");
    comune = scan.next();

    System.out.println();

    codiceFiscale.append(NomeCognome.nomeCognome(cognome, false));    // Cognome
    codiceFiscale.append(NomeCognome.nomeCognome(nome, true));        // Nome
    codiceFiscale.append(DataNascita.anno(annoNascita));              // Anno di nascita
    codiceFiscale.append(DataNascita.mese(meseNascita));              // Mese di nascita
    codiceFiscale.append(DataNascita.giorno(giornoNascita, sesso));   // Giorno di nascita e sesso
    codiceFiscale.append(Comune.comune(comune));                      // Calcolo del comune
    codiceFiscale.append(CIN.cin(codiceFiscale.toString()));          // Calcolo del CIN

    // Output
    System.out.println("Il codice fiscale generato risulta: " + codiceFiscale.toString());
  }

}
