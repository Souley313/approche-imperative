/**
 * 
 */
package fr.algorithmie;

/**
 * @author Souleymane THIAM
 *
 */
public class FirstLast6 {

	/**
	 * @param args
	 */
	
	public static void recherche6(int[] array) {
		boolean index = false;
        for (int i = 0; i < array.length - 1; i++) {
        	if(array.length>=1 && array[0]==6 || array[array.length-1]==6 ) {
        		 index = true;  
        	}else {
        		 index = false; 
        	}
         }
         System.out.println(index);
	 }
   
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int[] array2 = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
    	
        System.out.println("**** Le tableau *****");
        //appel de la methode pour verifier si notre tableau contient des élements et la valeur 6 à indice 1 ou 6
        recherche6(array2);

	}

}
