package Atelier_Robotise;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Taches {
  public Object identite;
  public Object profil;

  public void cg_init_Taches_1(final Object sadescription, final Object saClasse) {

    identite = sadescription;
    profil = saClasse;
  }

  public Taches(final Object sadescription, final Object saClasse) {

    cg_init_Taches_1(sadescription, saClasse);
  }

  public Object GetIdentite() {

    return identite;
  }

  public Object GetProfil() {

    return profil;
  }

  public Taches() {}

  public String toString() {

    return "Taches{"
        + "identite := "
        + Utils.toString(identite)
        + ", profil := "
        + Utils.toString(profil)
        + "}";
  }
}
