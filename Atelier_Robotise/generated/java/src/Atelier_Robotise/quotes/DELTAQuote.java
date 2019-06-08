package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class DELTAQuote {
  private static int hc = 0;
  private static DELTAQuote instance = null;

  public DELTAQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static DELTAQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new DELTAQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof DELTAQuote;
  }

  public String toString() {

    return "<DELTA>";
  }
}
