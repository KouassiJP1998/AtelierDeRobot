package Atelier_Robotise;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Animateur {
  private Robot r1 =
      new Robot(
          Atelier_Robotise.quotes.ALPHAQuote.getInstance(),
          Atelier_Robotise.quotes.OccupeQuote.getInstance());
  private Robot r2 =
      new Robot(
          Atelier_Robotise.quotes.BÊTAQuote.getInstance(),
          Atelier_Robotise.quotes.OccupeQuote.getInstance());
  private Robot r3 =
      new Robot(
          Atelier_Robotise.quotes.DELTAQuote.getInstance(),
          Atelier_Robotise.quotes.LibreQuote.getInstance());
  private Robot r4 =
      new Robot(
          Atelier_Robotise.quotes.EPSILONQuote.getInstance(),
          Atelier_Robotise.quotes.NonDisponibleQuote.getInstance());
  private Robot r5 =
      new Robot(
          Atelier_Robotise.quotes.GAMMAQuote.getInstance(),
          Atelier_Robotise.quotes.OccupeQuote.getInstance());
  private Robot r6 =
      new Robot(
          Atelier_Robotise.quotes.IOTAQuote.getInstance(),
          Atelier_Robotise.quotes.LibreQuote.getInstance());
  private Robot r7 =
      new Robot(
          Atelier_Robotise.quotes.KAPPAQuote.getInstance(),
          Atelier_Robotise.quotes.NonDisponibleQuote.getInstance());
  private Robot r8 =
      new Robot(
          Atelier_Robotise.quotes.LAMBDAQuote.getInstance(),
          Atelier_Robotise.quotes.LibreQuote.getInstance());
  private Robot r9 =
      new Robot(
          Atelier_Robotise.quotes.MUQuote.getInstance(),
          Atelier_Robotise.quotes.OccupeQuote.getInstance());
  private Robot r10 =
      new Robot(
          Atelier_Robotise.quotes.NUQuote.getInstance(),
          Atelier_Robotise.quotes.LibreQuote.getInstance());
  private Robot r11 =
      new Robot(
          Atelier_Robotise.quotes.OMEGAQuote.getInstance(),
          Atelier_Robotise.quotes.OccupeQuote.getInstance());
  private Robot r12 =
      new Robot(
          Atelier_Robotise.quotes.PHIQuote.getInstance(),
          Atelier_Robotise.quotes.LibreQuote.getInstance());
  private Taches t1 =
      new Taches(
          Atelier_Robotise.quotes.T1Quote.getInstance(),
          Atelier_Robotise.quotes.Conditionner_un_produitQuote.getInstance());
  private Taches t2 =
      new Taches(
          Atelier_Robotise.quotes.T2Quote.getInstance(),
          Atelier_Robotise.quotes.Conditionner_un_produitQuote.getInstance());
  private Taches t3 =
      new Taches(
          Atelier_Robotise.quotes.T3Quote.getInstance(),
          Atelier_Robotise.quotes.Monter_une_pieceQuote.getInstance());
  private Taches t4 =
      new Taches(
          Atelier_Robotise.quotes.T4Quote.getInstance(),
          Atelier_Robotise.quotes.Assembler_une_pieceQuote.getInstance());
  private Taches t5 =
      new Taches(
          Atelier_Robotise.quotes.T5Quote.getInstance(),
          Atelier_Robotise.quotes.Monter_une_pieceQuote.getInstance());
  private Taches t6 =
      new Taches(
          Atelier_Robotise.quotes.T6Quote.getInstance(),
          Atelier_Robotise.quotes.Conditionner_un_produitQuote.getInstance());
  private Taches t7 =
      new Taches(
          Atelier_Robotise.quotes.T7Quote.getInstance(),
          Atelier_Robotise.quotes.Monter_une_pieceQuote.getInstance());
  private Taches t8 =
      new Taches(
          Atelier_Robotise.quotes.T8Quote.getInstance(),
          Atelier_Robotise.quotes.Conditionner_un_produitQuote.getInstance());
  private Taches t9 =
      new Taches(
          Atelier_Robotise.quotes.T9Quote.getInstance(),
          Atelier_Robotise.quotes.Conditionner_un_produitQuote.getInstance());
  private Taches t10 =
      new Taches(
          Atelier_Robotise.quotes.T10Quote.getInstance(),
          Atelier_Robotise.quotes.Monter_une_pieceQuote.getInstance());
  private Taches t11 =
      new Taches(
          Atelier_Robotise.quotes.T11Quote.getInstance(),
          Atelier_Robotise.quotes.Conditionner_un_produitQuote.getInstance());
  private Taches t12 =
      new Taches(
          Atelier_Robotise.quotes.T11Quote.getInstance(),
          Atelier_Robotise.quotes.Monter_une_pieceQuote.getInstance());
  private VDMSet les_requetes = SetUtil.set(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
  private VDMSet Robot_occupes = SetUtil.set(r1, r2, r4, r6, r8, r9, r11);
  private Tableau_de_bord LeSysteme =
      new Tableau_de_bord(
          Utils.copy(les_requetes),
          Utils.copy(Robot_occupes),
          MapUtil.map(
              new Maplet(r1, t7),
              new Maplet(r2, t6),
              new Maplet(r4, t5),
              new Maplet(r6, t4),
              new Maplet(r8, t3),
              new Maplet(r9, t2),
              new Maplet(r11, t1)));

  public Boolean test_estOccupe() {

    return LeSysteme.estOccupe(r5);
  }

  public VDMSet test_occupes() {

    return LeSysteme.occupes();
  }

  public VDMSet test_enExecution() {

    return LeSysteme.enExecution();
  }

  public Taches test_quelTaches() {

    return LeSysteme.quelTaches(r2);
  }

  public Robot test_quel_Robot() {

    return LeSysteme.quelRobot(t6);
  }

  public Animateur() {}

  public String toString() {

    return "Animateur{"
        + "r1 := "
        + Utils.toString(r1)
        + ", r2 := "
        + Utils.toString(r2)
        + ", r3 := "
        + Utils.toString(r3)
        + ", r4 := "
        + Utils.toString(r4)
        + ", r5 := "
        + Utils.toString(r5)
        + ", r6 := "
        + Utils.toString(r6)
        + ", r7 := "
        + Utils.toString(r7)
        + ", r8 := "
        + Utils.toString(r8)
        + ", r9 := "
        + Utils.toString(r9)
        + ", r10 := "
        + Utils.toString(r10)
        + ", r11 := "
        + Utils.toString(r11)
        + ", r12 := "
        + Utils.toString(r12)
        + ", t1 := "
        + Utils.toString(t1)
        + ", t2 := "
        + Utils.toString(t2)
        + ", t3 := "
        + Utils.toString(t3)
        + ", t4 := "
        + Utils.toString(t4)
        + ", t5 := "
        + Utils.toString(t5)
        + ", t6 := "
        + Utils.toString(t6)
        + ", t7 := "
        + Utils.toString(t7)
        + ", t8 := "
        + Utils.toString(t8)
        + ", t9 := "
        + Utils.toString(t9)
        + ", t10 := "
        + Utils.toString(t10)
        + ", t11 := "
        + Utils.toString(t11)
        + ", t12 := "
        + Utils.toString(t12)
        + ", les_requetes := "
        + Utils.toString(les_requetes)
        + ", Robot_occupes := "
        + Utils.toString(Robot_occupes)
        + ", LeSysteme := "
        + Utils.toString(LeSysteme)
        + "}";
  }
}
