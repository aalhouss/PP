/* Gruppe von Hansheng Wang und Ahmad Al Housseini*/ 
package versuch2;

import java.io.*;


public class Aufgabe2_1 {

	public static void main(String[] args)throws IOException {
		
	BufferedReader in =new BufferedReader(new InputStreamReader(System.in));// Einlesen der Tastatureingabe
	int port=0;                                                            // Portnummer soll als Variable "ports" deklariert werden
	boolean check=false;                                                  // Mit Variable"check" als boolescher Typ,um die Eingabe zu überprüfen
	int Flag=1;                                                          // mit Flag Bestimmen, ob die Schleife fortgesetzt wird
	String Antwort;                                                     // Wunsch von Benutzer wird der Variable "Antwort" zugewiessen 
while (Flag==1) {   
	do{
	         try
	              {
	                System.out.println("Bitte  Portnummer eingeben:");
	                 port = Integer.parseInt(in.readLine());          // Eingabe als Integer Typ einlesen und  variable "port" zuweisen
	                         if (0<=port && port<=65535){
	                          check=false;
	                         }else{
	                   System.out.println("Portnummer muss zwischen 0 und 65535, bitte geben Sie weiterhin ein!");	 
	                           check=true;}
	                }                                              //Der Benutzer soll so lange um eine Neueingabe gebeten werden, wie den Wert außerhalb des Bereichs (0-65535) ist.
	              catch (Exception e)
	              {
	                 System.out.println("Was Sie eingegeben haben, ist keine Zahl, bitte geben Sie weiterhin ein!");
	                 check=true;                                 // Der Benutzer soll so lange um eine Neueingabe gebeten werden, wie er nicht Zahl eingibt.
	              }
	   } while(check); 
	
if (0<=port && port<=1023) {
		   
		   System.out.print("Art des Ports: "+port+" ist Well-known, ");//Die Ports mit den Nummern von 0 bis 1023 sind „well-known ports“.
		   switch(port) {                                              
			case 21: System.out.println("Dienst des Ports ist FTP");break;
			case 23: System.out.println("Dienst des Ports ist Telnet");break;
			case 25: System.out.println("Dienst des Ports ist SMTP");break;
			case 80: System.out.println("Dienst des Ports ist HTTP");break;
			case 143: System.out.println("Dienst des Ports ist IMAP");break;
			default:System.out.println("Sonstiger Dienst");break;
			}                                                          //Im Fall eines well-known ports: Ausgabe des Diensts dieses Ports
	   }

if (1024<=port && port<=49151) { 
		   System.out.println("Art des Ports: "+port+" ist registered");
	   }                                                             //Die Ports mit den Nummern von 1024 bis 49151 sind „registered ports“

if (49152<=port && port<=65535) {
		   System.out.println("Art des Ports: "+port+" ist dynamic");
	   }                                                              //Die Ports mit den Nummern von 49152 bis 65535 sind „dynamic ports“

System.out.println("Weiter brechnen? Wenn nein, bitte 'n' eingeben.Wenn Sie etwas anderes eingeben, wird das Programm fortgesetzt"); 

System.out.println("Ihre Antwort:"); 
      Antwort= in.readLine();
    if(Antwort.equals("n")){
    	System.out.println("Auf wiedersehen");                       //Der Vorgang soll beliebig oft wiederholt werden können, bis der Benutzer 'n'eingegeben wird.
    	break;
    }
 else{
	 Flag=1;
     }
    }
  }
}
