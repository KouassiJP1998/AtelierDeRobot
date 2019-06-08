package Atelier_Robotise;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Atelier {
  public VDMSet requetes = SetUtil.set();
  public VDMSet sont_occupes = SetUtil.set();
  public VDMMap occupe_par = MapUtil.map();

  public void cg_init_Atelier_1(
      final VDMSet lesTaches, final VDMSet lesRobot, final VDMMap uneAffectation) {

    requetes = Utils.copy(lesTaches);
    sont_occupes = Utils.copy(lesRobot);
    occupe_par = Utils.copy(uneAffectation);
  }

  public Atelier(final VDMSet lesTaches, final VDMSet lesRobot, final VDMMap uneAffectation) {

    cg_init_Atelier_1(Utils.copy(lesTaches), Utils.copy(lesRobot), Utils.copy(uneAffectation));
  }

  public Atelier() {}

  public static Boolean AtelierInv(
      final VDMMap Occupe_par, final VDMSet Sont_occupes, final VDMSet Requetes) {

    Boolean andResult_4 = false;

    if (Utils.equals(MapUtil.dom(Utils.copy(Occupe_par)), Sont_occupes)) {
      if (SetUtil.subset(MapUtil.rng(Utils.copy(Occupe_par)), Requetes)) {
        andResult_4 = true;
      }
    }

    return andResult_4;
  }

  public String toString() {

    return "Atelier{"
        + "requetes := "
        + Utils.toString(requetes)
        + ", sont_occupes := "
        + Utils.toString(sont_occupes)
        + ", occupe_par := "
        + Utils.toString(occupe_par)
        + "}";
  }
}
