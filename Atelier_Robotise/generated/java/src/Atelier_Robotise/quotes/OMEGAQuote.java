package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class OMEGAQuote {
  private static int hc = 0;
  private static OMEGAQuote instance = null;

  public OMEGAQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static OMEGAQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new OMEGAQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof OMEGAQuote;
  }

  public String toString() {

    return "<OMEGA>";
  }
}
