package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class BÊTAQuote {
  private static int hc = 0;
  private static BÊTAQuote instance = null;

  public BÊTAQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static BÊTAQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new BÊTAQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof BÊTAQuote;
  }

  public String toString() {

    return "<BÊTA>";
  }
}
