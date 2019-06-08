package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class NonDisponibleQuote {
  private static int hc = 0;
  private static NonDisponibleQuote instance = null;

  public NonDisponibleQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static NonDisponibleQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new NonDisponibleQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof NonDisponibleQuote;
  }

  public String toString() {

    return "<NonDisponible>";
  }
}
