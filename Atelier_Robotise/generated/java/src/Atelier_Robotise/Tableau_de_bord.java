package Atelier_Robotise;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Tableau_de_bord {
  public VDMSet requetes = SetUtil.set();
  public VDMSet sont_occupes = SetUtil.set();
  public VDMMap occupe_par = MapUtil.map();

  public void cg_init_Tableau_de_bord_1(
      final VDMSet lesTaches, final VDMSet lesRobot, final VDMMap uneAffectation) {

    requetes = Utils.copy(lesTaches);
    sont_occupes = Utils.copy(lesRobot);
    occupe_par = Utils.copy(uneAffectation);
  }

  public Tableau_de_bord(
      final VDMSet lesTaches, final VDMSet lesRobot, final VDMMap uneAffectation) {

    cg_init_Tableau_de_bord_1(
        Utils.copy(lesTaches), Utils.copy(lesRobot), Utils.copy(uneAffectation));
  }

  public VDMSet requete(final Taches Taches) {

    return SetUtil.union(Utils.copy(requetes), SetUtil.set(Taches));
  }

  public void affecter(final Robot Robot, final Taches Taches) {

    requetes = SetUtil.diff(Utils.copy(requetes), SetUtil.set(Taches));
    sont_occupes = SetUtil.union(Utils.copy(sont_occupes), SetUtil.set(Robot));
    occupe_par = MapUtil.override(Utils.copy(occupe_par), MapUtil.map(new Maplet(Robot, Taches)));
  }

  public void quitter(final Taches Taches, final Robot Robot) {

    sont_occupes = SetUtil.diff(Utils.copy(sont_occupes), SetUtil.set(Robot));
    occupe_par = MapUtil.rngResBy(Utils.copy(occupe_par), SetUtil.set(Taches));
  }

  public Boolean estOccupe(final Robot Robot) {

    return SetUtil.inSet(Robot, sont_occupes);
  }

  public Taches quelTaches(final Robot Robot) {

    return ((Taches) Utils.get(occupe_par, Robot));
  }

  public Robot quelRobot(final Taches Taches) {

    Robot x = null;
    Boolean success_1 = false;
    VDMSet set_1 = Utils.copy(sont_occupes);
    for (Iterator iterator_1 = set_1.iterator(); iterator_1.hasNext() && !(success_1); ) {
      x = ((Robot) iterator_1.next());
      success_1 = Utils.equals(((Taches) Utils.get(occupe_par, x)), Taches);
    }
    if (!(success_1)) {
      throw new RuntimeException("Let Be St found no applicable bindings");
    }

    return x;
  }

  public VDMSet occupes() {

    return Utils.copy(sont_occupes);
  }

  public VDMSet enExecution() {

    return MapUtil.rng(Utils.copy(occupe_par));
  }

  public Tableau_de_bord() {}

  public static Boolean Tableau_de_bordInv(
      final VDMMap Occupe_par, final VDMSet Sont_occupes, final VDMSet Requetes) {

    Boolean andResult_3 = false;

    if (Utils.equals(MapUtil.dom(Utils.copy(Occupe_par)), Sont_occupes)) {
      if (SetUtil.subset(MapUtil.rng(Utils.copy(Occupe_par)), Requetes)) {
        andResult_3 = true;
      }
    }

    return andResult_3;
  }

  public String toString() {

    return "Tableau_de_bord{"
        + "requetes := "
        + Utils.toString(requetes)
        + ", sont_occupes := "
        + Utils.toString(sont_occupes)
        + ", occupe_par := "
        + Utils.toString(occupe_par)
        + "}";
  }
}
