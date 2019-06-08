package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class T12Quote {
  private static int hc = 0;
  private static T12Quote instance = null;

  public T12Quote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static T12Quote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new T12Quote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof T12Quote;
  }

  public String toString() {

    return "<T12>";
  }
}
