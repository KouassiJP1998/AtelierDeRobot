package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class GAMMAQuote {
  private static int hc = 0;
  private static GAMMAQuote instance = null;

  public GAMMAQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static GAMMAQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new GAMMAQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof GAMMAQuote;
  }

  public String toString() {

    return "<GAMMA>";
  }
}
