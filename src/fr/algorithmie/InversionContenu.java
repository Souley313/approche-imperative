/**
 * 
 */
package fr.algorithmie;

/**
 * @author Souleymane THIAM
 *
 */
public class InversionContenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/**
		 * Créer un tableau arrayCopy et copier tous les 
		 * éléments de array dans arrayCopy mais dans l’ordre inverse.
		 * 
		 * Afficher l’ensemble des éléments des 2 tableaux
		 * 
		 * */
		//Déclarartion de arrayCopy
		int[] arrayCopy = new int [array.length];
		
		System.out.println("le tableau array est");
		for(int i=0; i<=array.length-1; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("\nle tableau arrayCopy est");
		for(int i=(array.length-1); i>=0; i--) {
			arrayCopy[i]=array[i];
			System.out.println(arrayCopy[i]);
		}

	}

}
