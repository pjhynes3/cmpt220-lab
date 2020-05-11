/* Author: Patrick Hynes
  Date: April 12, 2020 */



/* 1. Use this class as a superclass to implement a hierarchy of related classes:
      CLASS                         ADDITIONAL ATTRIBUTES
        IDCard                        ID Number
        CallingCard                   Card number, PIN
        DriverLicense                 Expiration Year 
*/
public class Card {
  private String name;
  public Card() {
    name = "";
  }

  public Card(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }
  
  public boolean isExpired() {
    return false;
  }

  public String format() {
    return "Card holder: "+ name;
  }

  public String toString(){
    return "Card[name=" + this.name + "]";
  }

  public boolean equals(Object obj)
  {
    Card card = (Card)obj;                  //cast
    return (this.name.equals(card.name));   //check to see if cards are equal
  }
}