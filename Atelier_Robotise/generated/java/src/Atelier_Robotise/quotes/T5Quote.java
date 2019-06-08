package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class T5Quote {
  private static int hc = 0;
  private static T5Quote instance = null;

  public T5Quote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static T5Quote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new T5Quote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof T5Quote;
  }

  public String toString() {

    return "<T5>";
  }
}
