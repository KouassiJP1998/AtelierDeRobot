package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class T1Quote {
  private static int hc = 0;
  private static T1Quote instance = null;

  public T1Quote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static T1Quote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new T1Quote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof T1Quote;
  }

  public String toString() {

    return "<T1>";
  }
}
