/* Bolkar ünlü 190504036 /*
public class Person {

  private String name ;
  private String nachname;
  private String tc_nummer;
  
  public Person(String tcN) {
        boolean result = tcN.matches("[0-9]+");
        if (tcN.length() == 7 && result){
            this.tc_nummer = tcN;
        }
        else {
            System.out.println("Geben Sie bitte eine gueltige Tc nummer!");
        }
    }
  public String getTc_nummer() {
        return tc_nummer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }

   
  

}
