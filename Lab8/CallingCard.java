public class CallingCard extends Card {
  private String cardNumber;
  private String pin;

  public CallingCard(String name, String cardNumber, String pin) {
    super(name);
    this.pin = pin;
    this.cardNumber = cardNumber;
  }

  public String format() {
    return super.format() + " CardNumber: " + cardNumber + " PIN: " + pin;
  }

  public String toString(){
    return "CallingCard[name=" + this.getName() + "][number="+ this.cardNumber + ", PIN=" + this.pin + "]";
  }

  @Override
  public boolean equals(Object obj){
    CallingCard callingCard = (CallingCard) obj;          // cast
    return (super.equals(callingCard)                     // check to see if cards are equal
    && this.cardNumber.equals(callingCard.cardNumber)
    && (this.pin.equals(callingCard.pin)));
  }
}