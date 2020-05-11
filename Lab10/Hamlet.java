/* April 27, 2020
  Author: Patrick Hynes
  CMPT 220 –Software Development
  Lab 10  */

import java.util.*;

public class Hamlet {
  public static void main (String[] args) {

    Scanner input = new Scanner(System.in);   // read in file
    int thouCount = 0;

    while (input.hasNext()) {                 // while the input file contains more words
      if ( input.next().equalsIgnoreCase("thou") )
        thouCount++;
    }
    System.out.println("Number of times 'thou' appeared in this file:: " + thouCount);
  }
}