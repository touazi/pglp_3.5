package pglp_3;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AffichageTest1 {


    public void constructeurMetier(){
        UneClasseMetier metier = new UneClasseMetier();
        assertTrue(metier!= null);
    }
	
	  @Test
	    public void affichagedemetier(){
	        UneClasseMetier metier = new UneClasseMetier();
	        DipInterface affi= new Affichage();
	        metier.affichage(affi);
	    }
}
