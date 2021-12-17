/* Gruppe von Hansheng Wang und Ahmad Al Housseini*/ 
package versuch2;

import java.io.*;


public class Aufgabe2_3_3 {

public static void main(String[] args)throws IOException {
		

		int z1=0;
		int z2=0;                                                               // "Schlüssel" soll als Variable "n" deklariert werden
		int t=0;
		boolean check=false;                                                  // Mit Variable"check" als boolescher Typ,um die Eingabe zu überprüfen
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));// Einlesen von Tastatureingabe
		do{
		         try
		              {                                                                 // Eingabe als Integer Typ einlesen 
		                System.out.println("Bitte eine natürliche Zahl z1 eingeben:");
		                 z1 = Integer.parseInt(in.readLine()); 

		                 if (z1<0){                     // Der Benutzer soll so lange um eine Neueingabe gebeten werden, wie der Wert nicht groesser als 0
		                        	 System.out.println("z1 muss größer als 0!");
		                             check=true;
		                         }else{
		                             check=false;}  
		              }
		              catch (Exception e)
		              {
		                 System.out.println("Was Sie eingegeben haben, ist keine Zahl, bitte geben Sie weiterhin ein!");
		                 check=true;                                 // Der Benutzer soll so lange um eine Neueingabe gebeten werden, wie er nicht Zahl eingibt.
		              }
		   } while(check); 
		do{
	         try
	              {                                                                 // Eingabe als Integer Typ einlesen 
	                System.out.println("Bitte eine natürliche Zahl z2 eingeben:");
	                 z2 = Integer.parseInt(in.readLine()); 

	                 if (z2<z1){                     // Der Benutzer soll so lange um eine Neueingabe gebeten werden, wie der Wert z2 nicht groesser als z1
	                        	 System.out.println("z2 muss größer als z1!");
	                             check=true;
	                         }else{
	                             check=false;}  
	              }
	              catch (Exception e)
	              {
	                 System.out.println("Was Sie eingegeben haben, ist keine Zahl, bitte geben Sie weiterhin ein!");
	                 check=true;                                 // Der Benutzer soll so lange um eine Neueingabe gebeten werden, wie er nicht Zahl eingibt.
	              }
	   } while(check); 
		do{
	         try
	              {                                                                 // Eingabe als Integer Typ einlesen 
	                System.out.println("Bitte eine natürliche Zahl t eingeben:");
	                 t = Integer.parseInt(in.readLine()); 

	                 if (t<2 || t>9){                     // Der Benutzer soll so lange um eine Neueingabe gebeten werden, wie der Wert nicht zwischen 2 und 9
	                        	 System.out.println("t muss zwischen 2 und 9");
	                             check=true;
	                         }else{
	                             check=false;}  
	              }
	              catch (Exception e)
	              {
	                 System.out.println("Was Sie eingegeben haben, ist keine Zahl, bitte geben Sie weiterhin ein!");
	                 check=true;                                 // Der Benutzer soll so lange um eine Neueingabe gebeten werden, wie er nicht Zahl eingibt.
	              }
	   } while(check); 
		
		for (int i=z1; i<=z2; i++) {
	    	if(i%10==t || i/10%10==t || i%t==0) { //Zahlenbereich von z1 bis z2 erzeugen.
	    		System.out.print(" bumm "); //alle Zahlen, die durch t teilbar sind oder in denen die Ziffer t vorkommt, durch das Wort „bumm“ zu ersetzen.
	    	}
	    	else {
	    		System.out.print(" "+i+" ");
	    	}
	    }

 }
}
