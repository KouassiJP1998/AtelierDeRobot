package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class T11Quote {
  private static int hc = 0;
  private static T11Quote instance = null;

  public T11Quote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static T11Quote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new T11Quote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof T11Quote;
  }

  public String toString() {

    return "<T11>";
  }
}
