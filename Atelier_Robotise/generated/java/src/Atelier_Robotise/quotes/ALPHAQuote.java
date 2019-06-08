package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class ALPHAQuote {
  private static int hc = 0;
  private static ALPHAQuote instance = null;

  public ALPHAQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static ALPHAQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new ALPHAQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof ALPHAQuote;
  }

  public String toString() {

    return "<ALPHA>";
  }
}
