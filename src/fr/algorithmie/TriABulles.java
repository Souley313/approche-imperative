/**
 * 
 */
package fr.algorithmie;

/**
 * @author Souleymane THIAM
 * 
 * la méthode de tri à bulles
 *
 */
public class TriABulles {

	/**
	 * @param args
	 */
	static void tri_bulle(int[] array){  
	        int tmp = 0;  
	        for(int i=0; i < array.length; i++){
	                for(int j=1; j < (array.length-i); j++){  
	                        if(array[j-1] > array[j]){
	                                //echanges des elements
	                                tmp = array[j-1];  
	                                array[j-1] = array[j];  
	                                array[j] = tmp;  
	                        }
	 
	                }
	        }
	   }
	   static void displayTab(int[] array){    
	        for(int i=0; i < array.length; i++){
	                System.out.print(array[i] + " ");  
	        }
	        System.out.println();
	   }
	  
	   public static void main(String[] args) {
		   int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;  
	 
	        System.out.println("---Avant le tri a bulle---"); 
	    
	        displayTab(array2);
	 
	        // tri des elements de tableau avec le tri a bulle
	        tri_bulle(array2);
	 
	        System.out.println("---Apres le tri a bulle---");  
	    
	        displayTab(array2); 
	   }
	}


