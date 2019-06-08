package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class KAPPAQuote {
  private static int hc = 0;
  private static KAPPAQuote instance = null;

  public KAPPAQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static KAPPAQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new KAPPAQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof KAPPAQuote;
  }

  public String toString() {

    return "<KAPPA>";
  }
}
