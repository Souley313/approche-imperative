/**
 * 
 */
package fr.declaration.variable;

/**
 * @author Souleymane THIAM
 * 
 * Classe permettant la déclaration des variables
 * @version 1.0
 *
 */
public class DeclarationApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration des variables
		byte       b      = 1  ;
		short      s       = -3200  ;
		int     nbre    = 100  ;
		long    l   =  10000000 ;
		float   f   = 3.4f  ;
		double  d   = 43.12 ;
		char    c =  'c';
		boolean bo     = true  ;
		String  ch    = "Souleymane";
				
		// Affichage des variables
		System.out.println(b);
		System.out.println(s);
		System.out.println(nbre);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bo);
		System.out.println(ch + "\n");
		
		String randomString = "Voici le résultat d’un calcul : 1+5=6";
		
		System.out.println(randomString);
		
		System.out.println("Voici le résultat d’un calcul :\n 1+5=6");

	}

}
