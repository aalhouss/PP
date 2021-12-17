package versuch3;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe3_1 {
    public static int Modulo(int a,int b,int c,int d) {
    	
    	return (a+b+c)%d;
    	
    }
	public static void main(String[] args) {
		Random rand = new Random();
		  int z = rand.nextInt();
		  System.out.println("z="+ z);// Zufallzahl erzeugen
		  
		  int a,b,m,Zufallszahl;// Variablen vereinbaren

		  
		Scanner input = new Scanner(System.in);// Tastatureingabe lesen
		
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

		       
		 System.out.println("a= "+a+" z= "+z+" b= "+b+" m= "+m);//
		 
		 Zufallszahl = Modulo(a,z,b,m);// Berechnen
		  
		 System.out.println("Zufallszahl= "+Zufallszahl);

		 input.close();
	}

}
