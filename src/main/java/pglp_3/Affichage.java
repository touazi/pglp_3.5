package pglp_3;

import java.time.LocalDateTime;
/**
 * * classe affichage.
 * @author lylia touazi.
 */
public class Affichage implements DipInterface {
/**
 * * methode affichage.
 */
public final void affichage() {
System.out.println(LocalDateTime.now() + ":Dé but de uneMethodeMetier");
System.out.println(LocalDateTime.now() + ": Fin de uneMethodeMetier ");
}
}
