/* Gruppe von Hansheng Wang und Ahmad Al Housseini*/ 
package versuch2;

import java.io.*;
/*ASCII CODE
a-z： a:97 b:98 c:99 d:100 e:101 f:102 g:103 h:104 i:105 j:106 k:107 l:108 m:109 n:110 o:111 p:112 q:113 r:114 s:115 t:116 u:117 v:118 w:119 x:120 y:121 z:122
A-Z： A:65 B:66 C:67 D:68 E:69 F:70 G:71 H:72 I:73 J:74 K:75 L:76 M:77 N:78 O:79 P:80 Q:81 R:82 S:83 T:84 U:85 V:86 W:87 X:88 Y:89 Z:90
*/
public class Aufgabe2_2 {
	// methode 1 Verschluesselung
    public static StringBuffer VER (StringBuffer a,int b) {

    	for(int i=0;i<a.length();i++) { // Ascii code von Zeichenkette byteweise einlesen
   		 if(65<=a.charAt(i) && a.charAt(i)<=90) {  // wenn i-ten Buchstabe von Zeichenkette  Großbuchstabe ist
   			 
   			 if(a.charAt(i)+b>90) { 
   				a.setCharAt(i,(char) (a.charAt(i)+b-26));	} 
   			 else {
   			 a.setCharAt(i,(char) (a.charAt(i)+b))	; }/*Wenn der Buchstaben, der im Alphabet b Positionen hinter a_i steht, erreicht  dabei das Ende des Alphabets, 
                                                         wird den i-ten Buchstabe durch "（Ascill von a_i）+b - 26" ersetzt. sonst einfach im Alphabet nach hinter b poistion verschieben wird */
   		}
   		 
   		     else if(97<=a.charAt(i) && a.charAt(i)<=122) {// wenn i-ten Buchstabe von Zeichenkette  Kleinbuchstabe ist
   			 if(a.charAt(i)+b>122) {
   				a.setCharAt(i,(char) (a.charAt(i)+b-26));	} 
   			 else {
   			 a.setCharAt(i,(char) (a.charAt(i)+b))	; }
   			 }                               /*Wenn der Buchstaben, der im Alphabet b Positionen hinter a_i steht, erreicht  dabei das Ende des Alphabets, 
                                             wird den i-ten Buchstabe durch "（Ascill von a_i）+b - 26" ersetzt. sonst einfach im Alphabet nach hinter b poistion verschieben wird*/
   	    else {
   			a.setCharAt(i,a.charAt(i));   //anderen Zeichen  unverändert bleiben.
   		 }
    	}
    return a; // Ergebnisse ins a zurückführen
    }
 // methode 2 Entschluesselung
    public static StringBuffer ENT (StringBuffer a,int b) {
    	for(int i=0;i<a.length();i++) {   // Ascii code von Zeichenkette byteweise einlesen
   		 if(65<=a.charAt(i) && a.charAt(i)<=90) {  // wenn i-ten Buchstabe von Zeichenkette  Großbuchstabe ist
   			 
   			 if(a.charAt(i)-b<65) {
   				a.setCharAt(i,(char) (26+a.charAt(i)-b));	} 
   			 else {
   			 a.setCharAt(i,(char) (a.charAt(i)-b))	; }
   		}                                                         /*Wenn der Buchstaben, der im Alphabet b Positionen vor a_i steht, erreicht  dabei den Anfang des Alphabets, 
                                                                    wird den i-ten Buchstabe durch "（Ascill von a_i）-b + 26" ersetzt. sonst einfach im Alphabet b poistion nach vorne verschieben  */
   		 else if(97<=a.charAt(i) && a.charAt(i)<=122) {    // wenn i-ten Buchstabe von Zeichenkette  Kleinbuchstabe ist
   			if(a.charAt(i)-b<97) {
   				a.setCharAt(i,(char) (26+a.charAt(i)-b));	} 
   			 else {
   			 a.setCharAt(i,(char) (a.charAt(i)-b))	; }
   			 }                                                  /*Wenn der Buchstaben, der im Alphabet b Positionen vor a_i steht, erreicht  dabei den Anfang des Alphabets, 
                                                                 wird den i-ten Buchstabe durch "（Ascill von a_i）-b + 26" ersetzt. sonst einfach im Alphabet  b poistion nach vorne verschieben  */
   		 else {
   			a.setCharAt(i,a.charAt(i));//anderen Zeichen  unverändert bleiben.
   		 }
    	}
        return a;// Ergebnisse ins a zurückführen
    }
    
public static void main(String[] args)throws IOException {
		
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));// Einlesen von Tastatureingabe
		int n=0;                                                               // "Schlüssel" soll als Variable "n" deklariert werden
		boolean check=false;                                                  // Mit Variable"check" als boolescher Typ,um die Eingabe zu überprüfen
		String Antwort;
		do{
		         try
		              {
		                System.out.println("Bitte eine natürliche Zahl n eingeben:");
		                 n = Integer.parseInt(in.readLine());          // Eingabe als Integer Typ einlesen und  variable "n" zuweisen
		                         if (n<1 || n>25){                     // Der Benutzer soll so lange um eine Neueingabe gebeten werden, wie der Wert nicht zwischen 1 und 25 ist
		                        	 System.out.println("Schlüssel n muss zwischen 1 und 25, bitte geben Sie weiterhin ein!");
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
		
		System.out.println("Bitte Zeichenkette eingeben:");
		StringBuffer strBuf = new StringBuffer(in.readLine());//Einlesen einer Zeichenkette in einen StringBuffer.
		StringBuffer strBuf_new=new StringBuffer();
		strBuf_new=strBuf_new.append(strBuf); //  Abspeichern des neuen Ergebnisses in einen neuen StringBuffer
		do {  
			  System.out.println("\"Verschluesselung\" bitte eingeben v, \"Entschluesselung\" bitte eingeben e:");
		       Antwort= in.readLine();// Anweisung von Tastatur einlesen
	         if(Antwort.equals("v")){
                 VER(strBuf_new,n);// Aufruf von Methode Verschlüsselung bei Eingabe von "v"
                 System.out.println(strBuf+" \"nach Verschluesselung ist\": "+strBuf_new);
	    	     check=false;// Schleife unterbrechen
	    	     }
	        else if(Antwort.equals("e")){
	        	 ENT(strBuf_new,n);// Aufruf von Methode Entschlüsselung bei Eingabe von "n"
                 System.out.println(strBuf+" \"nach Entschluesselung ist\": "+strBuf_new);
	        	 check=false;// Schleife unterbrechen
	        	 }     
	         else {
	        	 System.out.println("nur \"v\" oder \"e\" erlaubt:");
	        	 check=true;// Wenn Eingabe weder v noch e ist, wird die Schleife fortsetzen
	        	 }
	         }while(check);
		
	}
 }
