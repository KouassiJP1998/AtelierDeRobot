package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class IOTAQuote {
  private static int hc = 0;
  private static IOTAQuote instance = null;

  public IOTAQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static IOTAQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new IOTAQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof IOTAQuote;
  }

  public String toString() {

    return "<IOTA>";
  }
}
