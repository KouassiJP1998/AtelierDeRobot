package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Conditionner_un_produitQuote {
  private static int hc = 0;
  private static Conditionner_un_produitQuote instance = null;

  public Conditionner_un_produitQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static Conditionner_un_produitQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new Conditionner_un_produitQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof Conditionner_un_produitQuote;
  }

  public String toString() {

    return "<Conditionner_un_produit>";
  }
}
