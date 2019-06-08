package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Assembler_une_pieceQuote {
  private static int hc = 0;
  private static Assembler_une_pieceQuote instance = null;

  public Assembler_une_pieceQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static Assembler_une_pieceQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new Assembler_une_pieceQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof Assembler_une_pieceQuote;
  }

  public String toString() {

    return "<Assembler_une_piece>";
  }
}
