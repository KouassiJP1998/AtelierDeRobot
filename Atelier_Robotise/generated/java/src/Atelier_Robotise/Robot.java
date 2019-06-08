package Atelier_Robotise;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Robot {
  public Object code;
  public Object etat;

  public void cg_init_Robot_1(final Object sonCode, final Object sonEtat) {

    code = sonCode;
    etat = sonEtat;
  }

  public Robot(final Object sonCode, final Object sonEtat) {

    cg_init_Robot_1(sonCode, sonEtat);
  }

  public Object GetCode() {

    return code;
  }

  public Object GetEtat() {

    return etat;
  }

  public Robot() {}

  public String toString() {

    return "Robot{" + "code := " + Utils.toString(code) + ", etat := " + Utils.toString(etat) + "}";
  }
}
