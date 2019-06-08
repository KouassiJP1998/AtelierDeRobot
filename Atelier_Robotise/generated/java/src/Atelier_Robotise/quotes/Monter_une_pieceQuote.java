package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Monter_une_pieceQuote {
  private static int hc = 0;
  private static Monter_une_pieceQuote instance = null;

  public Monter_une_pieceQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static Monter_une_pieceQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new Monter_une_pieceQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof Monter_une_pieceQuote;
  }

  public String toString() {

    return "<Monter_une_piece>";
  }
}
