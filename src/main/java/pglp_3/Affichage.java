package pglp_3;

import java.time.LocalDateTime;

public class Affichage implements DIP_interface {

	public void affichage() {
			System.out.println(LocalDateTime.now() + " : Dé but de uneMethodeMetier " ) ; // l o g message
			
			System.out.println(LocalDateTime.now() + " : Fin de uneMethodeMetier " ) ; // l o g message
		
	}
}
