package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class T6Quote {
  private static int hc = 0;
  private static T6Quote instance = null;

  public T6Quote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static T6Quote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new T6Quote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof T6Quote;
  }

  public String toString() {

    return "<T6>";
  }
}
