package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class LibreQuote {
  private static int hc = 0;
  private static LibreQuote instance = null;

  public LibreQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static LibreQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new LibreQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof LibreQuote;
  }

  public String toString() {

    return "<Libre>";
  }
}
