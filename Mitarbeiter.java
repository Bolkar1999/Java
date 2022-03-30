/* Bolkar ünlü 190504036 /*
public  class Mitarbeiter extends Person {

  private String gehalt ;
  private String pflicht;
  public Mitarbeiter (String tcN){
    super(tcN); 
  }
  public void setGehalt(String gehalt){
    this.gehalt=gehalt;
  }
  public String getGehalt(){
    return gehalt;
  }
  public void setPflicht(String pflicht){
    this.pflicht=pflicht;
  }
  public String getPflicht() {
    return pflicht;
  }
  
}
