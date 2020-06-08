/**
 * 
 */
package fr.algorithmie;

/**
 * @author Souleymane THIAM
 * 
 * la méthode tri par sélection d'un tableau
 *
 */
public class TriParSelection {

	/**
	 * @param args
	 */
	//Methode permettant de faire une tri par selection d'un tableau
    public static void tri_selection(int[] array) {
         for (int i = 0; i < array.length - 1; i++) {
              int index = i;  
              for (int j = i + 1; j < array.length; j++) {
                   if (array[j] < array[index]){ 
                        index = j;
                   }
              }
              int min = array[index];
              array[index] = array[i]; 
              array[i] = min;
         }
    }
    
    //Methode permettant d'afficher un tableau
    static void displayTab(int[] array) {
         for(int i=0; i < array.length; i++) {  
              System.out.print(array[i] + " ");  
         } 
         System.out.println();    
    }
 
    public static void main(String a[]) {  
    	int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
    	
         System.out.println("**** Avant le tri par selection *****");
         displayTab(array2);
         //appel de la methode tri d un tableau avec l algorithme de tri par selection
         tri_selection(array2);

         System.out.println("**** Apres le tri par selection ****");  
         displayTab(array2); 
    }	

}


