package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Fixer_une_pieceQuote {
  private static int hc = 0;
  private static Fixer_une_pieceQuote instance = null;

  public Fixer_une_pieceQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static Fixer_une_pieceQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new Fixer_une_pieceQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof Fixer_une_pieceQuote;
  }

  public String toString() {

    return "<Fixer_une_piece>";
  }
}
