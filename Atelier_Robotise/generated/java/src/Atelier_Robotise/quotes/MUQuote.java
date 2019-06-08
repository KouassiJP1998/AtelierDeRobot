package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class MUQuote {
  private static int hc = 0;
  private static MUQuote instance = null;

  public MUQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static MUQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new MUQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof MUQuote;
  }

  public String toString() {

    return "<MU>";
  }
}
