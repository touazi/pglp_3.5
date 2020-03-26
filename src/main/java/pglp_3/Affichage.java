package pglp_3;

import java.time.LocalDateTime;
/**
 * * classe affichage.
 */
public class Affichage implements DipInterface {
/**
 * * methode affichage.
 */
public void affichage() {
System.out.println(LocalDateTime.now() + ":Dé but de uneMethodeMetier");
System.out.println(LocalDateTime.now() + ": Fin de uneMethodeMetier ");
	}
}