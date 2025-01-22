public class Stave {
  
  private String staveName;
  private int staveLevel;
  private int stavePa;
  private int staveMa;
  private int staveCc;

  //contructor
  public Stave(String staveName, int staveLevel, int stavePa, int staveMa, int staveCc){
    this.staveName = staveName;
    this.staveLevel = staveLevel;
    this.stavePa = stavePa;
    this.staveMa = staveMa;
    this.staveCc = staveCc;
  }

  //getter
  public String getStaveName() {
    return this.staveName;
  }
  public int getStaveLevel() {
    return this.staveLevel;
  }
  public int getStavePa() {
    return this.stavePa;
  }
  public int getStaveMa() {
    return this.staveMa;
  }
  public int getStaveCc() {
    return this.staveCc;
  }

  //setter
  public void setStaveName(String staveName) {
    this.staveName = staveName;
  }
  public void setStaveLevel(int staveLevel) {
    this.staveLevel = staveLevel;
  }
  public void setStavePa(int stavePa) {
    this.stavePa = stavePa;
  }
  public void setStaveMa(int staveMa) {
    this.staveMa = staveMa;
  }
  public void setStaveCc(int staveCc) {
    this.staveCc = staveCc;
  }

  public String toString(){
     return" Stave Name:" + this.staveName + 
           ", Stave Level:" + this.staveLevel + 
           ", Stave Pa:" + this.stavePa + 
           ", Stave Ma:" + this.staveMa +
           ", Stave Cc:" + this.staveCc;
    }

    public void setStaveLevelUp() {
      if(getStaveLevel() >= 3) {
      setStaveLevel(getStaveLevel());
      setStavePa(getStavePa());
      setStaveMa(getStaveMa());
      setStaveCc(getStaveCc());
    } else {
      setStaveLevel(getStaveLevel() +1);
      setStavePa(getStavePa() + 100);
      setStaveMa(getStaveMa() + 100);
      setStaveCc(getStaveCc() + 100);
    }
  }

    public void setStaveLevelDown() {
      if(getStaveLevel() <=1) {
      setStaveLevel(getStaveLevel());
      setStavePa(getStavePa());
      setStaveMa(getStaveMa());
      setStaveCc(getStaveCc());
      } else {
      setStaveLevel(getStaveLevel() -1);
      setStavePa(getStavePa() - 100);
      setStaveMa(getStaveMa() - 100);
      setStaveCc(getStaveCc() - 100);
      }
    }

  }

