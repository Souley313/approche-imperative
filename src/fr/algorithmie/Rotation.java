/**
 * 
 */
package fr.algorithmie;

/**
 * @author Souleymane THIAM
 *
 */
public class Rotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {0,1,2,3};
		int order=4, i;int j;
		for (i = 0; i < order; i++) {
			
			int temp = array[array.length - 1];
			
			for ( j = array.length - 1; j >0; j--) {
				
				array[j] = array[j - 1];
				array[0] = temp;

				}System.out.println(array[j]);
						
		}
		
	}

}
