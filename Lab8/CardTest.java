public class CardTest{
  public static void main(String[] args) {
    BillFold bf1 = new BillFold();
    Card idCard = new IDCard("Pat", "MARIST2021");
    Card callingCard = new CallingCard("John Doe", "24680", "0990");

    bf1.addCard(idCard);
    bf1.addCard(callingCard);

    System.out.println(bf1.formatCards());
  }
}