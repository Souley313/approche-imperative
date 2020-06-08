/**
 * 
 */
package fr.algorithmie;

/**
 * @author Souleymane THIAM
 * 
 * EXERCICE AFFICHAGEINVERSE
 *
 */
public class AffichageInverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Affichage de l�ensemble des �l�ments du tableau gr�ce � une boucle
		System.out.println("Le tableau:");	
		for(int i=0; i<=array.length-1; i++) {
			System.out.println(array[i]);
		}
		
		//Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau
		System.out.println("\nLe tableau � l'inverse:");		
		for(int i=(array.length-1); i>=0; i--) {
			System.out.println(array[i]);
		}
		
		//Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy
		
		//D�clarartion de arrayCopy
		int[] arrayCopy = new int [array.length];		
		System.out.println("\nAffichage du tableau arrayCopy:");		
		for(int i=0; i<=array.length-1; i++) {
			arrayCopy[i]=array[i];
			System.out.println(arrayCopy[i]);
		}	
	}

}
