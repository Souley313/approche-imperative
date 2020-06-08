/**
 * 
 */
package fr.algorithmie;

/**
 * @author Souleymane THIAM
 *
 */
public class RechercheMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;			
		
		//Rechercher le plus petit élément du tableau array
		int minVal = 0;//Déclaration et initialisation de la variable qui devra etre le maximum
		for(int i=0; i<=array.length-1; i++) {
			if(array[i] < minVal)
		           minVal = array[i];
		 }
		System.out.print("\nLe plus petit élément du taleau = "+minVal);
	}

}
