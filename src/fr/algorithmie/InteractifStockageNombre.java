/**
 * 
 */
package fr.algorithmie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Souleymane THIAM
 * 
 * un programme avec le menu suivant :
		1. Ajouter un nombre
		2. Afficher les nombres existants
 * 
 *
 */
public class InteractifStockageNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choix;
		int ajout =0;
		List<Integer> list = new ArrayList<Integer>();
	    System.out.println("|   MENU SELECTION                              |");
	    System.out.println("|        1. Ajouter un nombre                    |");
	    System.out.println("|        2. 2. Afficher les nombres existants       |");
	    System.out.println("|        3. Exit           |");
	    choix = Keyin.inInt(" Select option: ");
	    
    	
    	try (Scanner scanner = new Scanner(System.in)) {
			// Switch construct
			switch (choix) {
			case 1:
				System.out.println("Entrer un nombre");
				ajout = scanner.nextInt();
				list.add(ajout);
			  break;
			case 2:
				list.add(ajout);
				for(Integer elem: list){
			    	 System.out.println (elem);
			    }
			  break;}
		}
	  }
	}

	class Keyin {

	  //*******************************
	  //   support methods
	  //*******************************
	  //Method to display the user's prompt string
	  public static void printPrompt(String prompt) {
	    System.out.print(prompt + " ");
	    System.out.flush();
	  }

	  //Method to make sure no data is available in the
	  //input stream
	  public static void inputFlush() {
	    try {
	      while ((System.in.available()) != 0) {
		}
	    } catch (java.io.IOException e) {
	      System.out.println("Input error");
	    }
	  }
	  public static String inString() {
	    int aChar;
	    String s = "";
	    boolean finished = false;

	    while (!finished) {
	      try {
	        aChar = System.in.read();
	        if (aChar < 0 || (char) aChar == '\n')
	          finished = true;
	        else if ((char) aChar != '\r')
	          s = s + (char) aChar; // Enter into string
	      }

	      catch (java.io.IOException e) {
	        System.out.println("Input error");
	        finished = true;
	      }
	    }
	    return s;
	  }

	  public static int inInt(String prompt) {
	    while (true) {
	      inputFlush();
	      printPrompt(prompt);
	      try {
	        return Integer.valueOf(inString().trim()).intValue();
	      }

	      catch (NumberFormatException e) {
	        System.out.println("Invalid input. Not an integer");
	      }
	    }
	}
}
