package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class T8Quote {
  private static int hc = 0;
  private static T8Quote instance = null;

  public T8Quote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static T8Quote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new T8Quote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof T8Quote;
  }

  public String toString() {

    return "<T8>";
  }
}
