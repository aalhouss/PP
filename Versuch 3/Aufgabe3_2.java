package versuch3;

import java.util.Scanner;

public class Aufgabe3_2 {
	 public static int Modul(int a,int b,int c,int d) {
	    	
	    	return (a+b+c)%d;
	    	
	    }
	public static void main(String[] args) {
		int z =0;
		Scanner input = new Scanner(System.in);// Tastatureingabe lesen
		int a,b,m,Zufallszahl;// Variablen vereinbaren
	    System.out.println("Bitte eingeben:"); 
	       while(true)
	           {
	              try
	              {
	                  System.out.print("a="); 
	                  a=input.nextInt();
	                  break;
	              }
	              catch (Exception e)
	              {
	                 System.out.println("Was Sie eingegeben haben, ist keine Ganzzahl, bitte geben Sie weiterhin eine Ganzzahl ein!");
	                  input.nextLine(); // Sicherstellen, dass der Eingabewert eine Ganzzahl ist
	              }
	          }
	       while(true)
	          {
	              try
	              {
	                  System.out.print("b="); 
	                  b=input.nextInt();
	                  break;
	              }
	              catch (Exception e)
	              {
	                 System.out.println("Was Sie eingegeben haben, ist keine Ganzzahl, bitte geben Sie weiterhin eine Ganzzahl ein!");
	                  input.nextLine();
	              }
	          }
	      while(true)
	          {
	              try
	              {
	                 System.out.print("m="); 
	                  m=input.nextInt();
	                  if(m==0) {
	                	  System.out.println("m darf nicht gleich 0");
	                	  continue;
	                  }
	                  else
	                  break;
	              }
	              catch (Exception e)
	              {
	                   System.out.println("Was Sie eingegeben haben, ist keine Ganzzahl, bitte geben Sie weiterhin eine Ganzzahl ein!");
	                  input.nextLine();
	             }
	          }

	       
	 System.out.println("a= "+a+" b= "+b+" m= "+m);//
	 
	 for (int i=0;i<20;i++) {
	 
	 Zufallszahl = Modul(a,z,b,m);// Berechnen
	 z=Zufallszahl;
	 System.out.println("Zufallszahl= "+Zufallszahl);
	
	 }
	 input.close();
	}

}
