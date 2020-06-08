/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Souleymane THIAM
 *
 */
public class InteractifFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Entrer un nombre");
		try (Scanner scanner = new Scanner(System.in)) {
			int ajout = scanner.nextInt();
			
			int n1=0,n2=1,n3,i;    
			 System.out.print(n1+" "+n2);//Affichage de 0 et 1 
			    
			 for(i=2;i<ajout;++i)//la boucle commence à 2 car 0 et 1 sont déjà afficher 	    
			 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
			 }
		}    

	}

}
