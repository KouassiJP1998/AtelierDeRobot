package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class LAMBDAQuote {
  private static int hc = 0;
  private static LAMBDAQuote instance = null;

  public LAMBDAQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static LAMBDAQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new LAMBDAQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof LAMBDAQuote;
  }

  public String toString() {

    return "<LAMBDA>";
  }
}
