/**
 * 
 */
package fr.algorithmie;

/**
 * @author Souleymane THIAM
 *
 */
public class AffichagePartiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;				
		
		//Afficher que les entiers supérieurs à 3 du tableau array
		System.out.println("les entiers supérieurs à 3 du tableau: ");
		
		for(int i=0; i<=array.length-1; i++) {
			if(array[i]>3) {
				System.out.println(array[i]);
			}
		}
		
		//Afficher que les entiers pairs du tableau array
		System.out.println("\nles entiers pairs du tableau: ");
		for(int i=0; i<=array.length-1; i++) {
			if(array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		//Afficher que les valeurs correspondant aux index pairs
		System.out.println("\nles valeurs correspondant aux index pairs du tableau: ");
		for(int i=0; i<=array.length-1; i++) {
			if(i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		//Afficher que les entiers impairs du tableau array
		System.out.println("\nles entiers impairs du tableau: ");		
		for(int i=0; i<=array.length-1; i++) {
			if(array[i] % 2 == 1) {
				System.out.println(array[i]);
			}
		}
		
	}

}
