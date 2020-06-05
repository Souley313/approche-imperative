/**
 * 
 */
package fr.boucles;

/**
 * @author Souleymane THIAM
 * 
 * Classe permettant de manipuler les boucles
 *
 */
public class ExerciceBoucleBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Déclaration des variables 
		int i; 
		
		//Affichez tous les nombres de 1 à 10
		System.out.println("Les nombres de 1 à 10");
		for(i=1; i<=10; i++ ) {
			System.out.println(i);
		}
		
		//initialisation du variable 
		i=1;
				
		//Affichez 20 fois mon nom et mon prénom
		//initialisation du variable 
		i=1;
		System.out.println("Mon nom et Prénom affiché 10 fois");
		while( i <=20) {
			i++;
			System.out.println("THIAM Souleymane");
		}
		
		//Affichez les éléments pairs de 2 à 100
		System.out.println("Les nombres pairs de 2 à 100");
		for(i=2; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//Affichez les éléments impairs de 1 à 99
		System.out.println("Les nombres impairs de 1 à 99");
		for(i=1; i<=99; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}
