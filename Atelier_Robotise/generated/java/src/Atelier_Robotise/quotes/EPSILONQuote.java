package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class EPSILONQuote {
  private static int hc = 0;
  private static EPSILONQuote instance = null;

  public EPSILONQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static EPSILONQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new EPSILONQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof EPSILONQuote;
  }

  public String toString() {

    return "<EPSILON>";
  }
}
