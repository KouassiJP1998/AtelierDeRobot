package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class NUQuote {
  private static int hc = 0;
  private static NUQuote instance = null;

  public NUQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static NUQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new NUQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof NUQuote;
  }

  public String toString() {

    return "<NU>";
  }
}
