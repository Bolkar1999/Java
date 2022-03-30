/* Bolkar ünlü 190504036 /*
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
  
  public static void main(String[] args) {

    ArrayList mitarbeiter = new ArrayList();
    ArrayList kunden = new ArrayList();
  
    Scanner sc = new Scanner(System.in);
    
    int operation = 0;
    while (operation != 100) {

      System.out.println("Welche Operation moechten Sie durchfuehren?");
      System.out.println("  1- Mitarbeiter hinzufuegen");
      System.out.println("  2- Kunde hinzufuegen");
      System.out.println("  100 - Programm beenden");

      operation = sc.nextInt();
      switch (operation) {
        case 1:
      System.out.println("Geben Sie bitte Tc_nummer ein:");
          String mit_tcN = sc.next();
          Mitarbeiter m1 = new Mitarbeiter(mit_tcN);
      System.out.println("Geben sie bitte  der Name ein");       
          String mit_name = sc.next();
          m1.setName(mit_name);
          
      System.out.println("Geben Sie bitte der Nachname ein:");
          String mit_nachname=sc.next();
          m1.setNachname(mit_nachname);
      System.out.println("Geben Sie bitte der Alter ein :"); 
          String mit_pflicht=sc.next();
          m1.setPflicht(mit_pflicht);
          
      System.out.println("Geben Sie bitte Gehalt  ein:"); 
          String mit_gehalt=sc.next();
          m1.setGehalt(mit_gehalt);
          mitarbeiter.add(m1);
          break;
        case 2:
          System.out.println("Geben Sie bitte ID ein: ");
          String kun_tcN = sc.next();
          Kunden k1 = new Kunden (kun_tcN);

          System.out.println("Geben sie bitte name ein");
          String kun_name =sc.next();
          k1.setName(kun_name);

    System.out.println("Geben Sie bitte der Nachname ein: ");
          String kun_nachname = sc.next();
          k1.setNachname(kun_nachname);

                
          System.out.println("Geben sie bitte Geschlecht ein ");
          String kun_geschlecht=sc.next();
          k1.setGeschlecht(kun_geschlecht);

          System.out.println("Geben sie bitte Alter ein");
          int kun_alter=sc.nextInt();
          k1.setAlter(kun_alter);
          kunden.add(k1);
          break;
      }


            
    }
      
  }

}
