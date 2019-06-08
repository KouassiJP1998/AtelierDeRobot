package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class T4Quote {
  private static int hc = 0;
  private static T4Quote instance = null;

  public T4Quote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static T4Quote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new T4Quote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof T4Quote;
  }

  public String toString() {

    return "<T4>";
  }
}
