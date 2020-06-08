/**
 * 
 */
package fr.algorithmie;

/**
 * @author formation
 *
 */
public class ComparaisonTableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration du tableau
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		int j=0;
		for(int i=0; i<=array1.length-1; i++) {
			if( array1 [i] == array2 [i]) {
				j;
			}
		}
		System.out.println("Le tableau somme:"+j);
	}

}
