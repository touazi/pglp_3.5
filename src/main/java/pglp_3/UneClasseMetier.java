package pglp_3;


/**
 * class UnClasseMetier.
 * @author lylia touazi
 * @version 3.0
*  class UnClasseMetier {
*public void uneMethodeMetier ( ){
*System.out.println ( LocalDateTime.now ( )+ " :
*Début de une Methode Metier " );
*System.out.println (LocalDateTime.now( ) + 
*" : Fin de une Methode Metier " );}}
* ce code ne respecte pas le principe DIP car Lorsque ce
* principe est appliqué, cela signifie que les classes de
* haut niveau ne fonctionnent pas directement avec les
* classes de bas niveau,or que ici ce n'est pas le cas.
* pour ce fait on dois utiliser des interfaces
* comme couche abstraite. Dans ce cas, l'instanciation de
* nouveaux objets de bas niveau à l'intérieur des classes
*  de haut niveau (si nécessaire) ne peut pas être effectuée
*   à l'aide de l'opérateur new. Au lieu de cela, certains
*   des modèles de conception créatifs peuvent être utilisés.
*   */



public class UneClasseMetier {
/**
 * methode affichage.
 * * @param dip elle prend l'interfe en parametre
 *  * et afficher
 *   * */
public void affichage(DipInterface dip) {
dip.affichage();
}
}
