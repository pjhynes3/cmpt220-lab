public class BillFold {
  private Card card1;
  private Card card2;

  public void addCard(Card card) {      // add a new card
    if (card1 == null)
      card1 = card;
    else if (card2 == null)
      card2 = card;
    else 
      return;
  }

  public String formatCards() {
    String formatted = "";

    if (card1 != null) {
      formatted += card1.format();
    }

    formatted = formatted + " | ";

    if (card2 != null) {
      formatted += card2.format();
    }

    formatted = "[" + formatted;
    formatted = formatted + "]";
    return formatted;
  }

  public int getExpiredCardCount(){
    int count = 0;                // initialize to zero, billfold can only hold up to a max of two cards anyway
    if(card1.isExpired()) count++;
    if(card2.isExpired()) count++;  // highest expired count can be is two
    return count;
  }
}