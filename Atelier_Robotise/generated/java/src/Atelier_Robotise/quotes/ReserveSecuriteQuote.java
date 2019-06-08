package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class ReserveSecuriteQuote {
  private static int hc = 0;
  private static ReserveSecuriteQuote instance = null;

  public ReserveSecuriteQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static ReserveSecuriteQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new ReserveSecuriteQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof ReserveSecuriteQuote;
  }

  public String toString() {

    return "<ReserveSecurite>";
  }
}
