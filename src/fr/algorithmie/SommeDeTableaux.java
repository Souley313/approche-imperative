/**
 * 
 */
package fr.algorithmie;

/**
 * @author Souleymane THIAM
 *
 */
public class SommeDeTableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration du tableau
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		int[] res = new int [array1.length];
		
		System.out.println("Le tableau somme:");
		for(int i=0; i<=array1.length-1; i++) {
				res [i] = array1 [i] + array2 [i] ;
				System.out.println(res[i]);
		}
	}
}
