public class IDCard extends Card
{
  private String IDNumber;

  public IDCard(String name, String idNumber) {  //constructor
    super(name);
    IDNumber = idNumber;
  }

  public String format() {
    return super.format() + " IDCardNumber: " + IDNumber;
  }

  public String toString( ){
    return "IDCard[name=" + this.getName() + "][idNumber=" + this.IDNumber + "]";
  }

  @Override
  public boolean equals(Object obj)
  {
    IDCard idCard = (IDCard) obj;                                                 //cast
    return (super.equals(idCard) && this.IDNumber.equals(idCard.IDNumber));       // check to see if cards are equal
  }
}