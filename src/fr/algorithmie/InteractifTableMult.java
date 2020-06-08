/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Souleymane THIAM
 * 
 * Un programme qui demande un nombre à l’utilisateur qui doit être compris 
 * entre 1 et 10. Une fois que le nombre est bien entre 1 et 10, le programme 
 * affiche la table de multiplication de ce nombre
 *
 */
public class InteractifTableMult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb;
    	System.out.println("Veuillez saisir un nombre compris entre 1 et 10 :");
	    try (Scanner scanner = new Scanner(System.in)) {
			nb = scanner.nextInt();
			
			while (nb<1 || nb>10) {
			   System.out.println("Le nombre que vous avez saisi n'est pas compris entre 1 et 10");
			   nb = scanner.nextInt();
			 
			}
		}
	    System.out.println("\n La table de multiplication de " +nb+ ":\n");
	   for (int i = 1; i <= 10; i++){
		   System.out.println(nb+"*"+i+"=" +nb*i);	   
	}}}	

