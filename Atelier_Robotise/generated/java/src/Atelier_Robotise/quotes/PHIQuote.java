package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PHIQuote {
  private static int hc = 0;
  private static PHIQuote instance = null;

  public PHIQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static PHIQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new PHIQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof PHIQuote;
  }

  public String toString() {

    return "<PHI>";
  }
}
