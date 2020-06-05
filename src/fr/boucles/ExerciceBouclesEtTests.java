/**
 * 
 */
package fr.boucles;

/**
 * @author Souleymane THIAM
 * 
 * Classe permettant de manipuler les boucles et les tests
 *
 */
public class ExerciceBouclesEtTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declaration du tableau
				int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
				
				//Affichage de l’ensemble des éléments du tableau grâce à une boucle
				System.out.println("Le tableau:");
				for(int i=0; i<=array.length-1; i++) {
					System.out.println(array[i]);
				}
				
				//Afficher l’ensemble des éléments dans l’ordre inverse du tableau
				System.out.println("Le tableau à l'inverse:");
				for(int i=(array.length-1); i>=0; i--) {
					System.out.println(array[i]);
				}		
				
				//Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
				System.out.println("Les entiers supérieurs à 3 du tableau:");
				for(int i=0; i<=array.length-1; i++) {
					if(array[i]>3) {
						System.out.println(array[i]);
					}
				}
				
				//Combiner une boucle et un test de manière à n’afficher que les entiers pairs
				System.out.println("Les entiers pairs du tableau:");
				for(int i=0; i<=array.length-1; i++) {
					if(array[i] % 2 == 0) {
						System.out.println(array[i]);
					}
				}
				
				//Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
				System.out.println("Les entiers à index pairs du tableau:");
				for(int i=0; i<=array.length-1; i++) {
					if(i % 2 == 0) {
						System.out.println(array[i]);
					}
				}
				
				//Combiner une boucle et un test de manière à n’afficher que les entiers impairs
				System.out.println("Les entiers impairs du tableau:");
				for(int i=0; i<=array.length-1; i++) {
					if(array[i] % 2 == 1) {
					System.out.println(array[i]);
					}
				}
	}

}
