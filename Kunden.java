
/*Kunden.java (Bolkar ünlü 190504036) /*
public class Kunden extends Person{

  private String geschlecht ;
  private int alter;
  public Kunden (String tcN){
    super(tcN); 
  }
  public void setGeschlecht(String geschlecht){
    this.geschlecht=geschlecht;
  }
  public String getGeschlecht(){
    return geschlecht;
  }
  public void setAlter( int  alter ){
    if (alter>=0 && alter<= 150 ){
    this.alter=alter;
   }
  }
  
  

  public int getAlter(){
    return alter;
 }
}



















