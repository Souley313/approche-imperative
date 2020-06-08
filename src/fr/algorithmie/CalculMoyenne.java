/**
 * 
 */
package fr.algorithmie;

/**
 * @author Souleymane THIAM
 * 
 * Calcul de la moyenne des éléments du tableau
 *
 */
public class CalculMoyenne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;			
		
		int som = 0;//Déclaration et initialisation de la variable qui devra etre la somme
		for(int i=0; i<=array.length-1; i++) {
		     som += array[i];
		 }
		float moy = (float)som /array.length;
		
		System.out.print("\nla moyenne des éléments du tableau = "+moy);

	}

}
