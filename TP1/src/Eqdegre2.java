import java.io.*;

public class Eqdegre2 {
	private double r1,r2,i1,i2;
    public Eqdegre2(double a, double b, double c)
    {
    	System.out.println("Constructeur"); 
    	r1=r2=i1=i2=0;   
    	résoudre(a,b,c);  
     }
    
     public void résoudre(double a, double b, double c)
     {
    	 if (a == 0) {
    		   // Cas d'une équation du premier degré
             if (b == 0) {
                 if (c == 0) {
                     System.out.println("0=0");
                 } else {
                     System.out.println(" (aucune solution)");
                 }
             } else {
                 r1 = r2 = -c / b;  
                 System.out.println("Equation du premier degre : Racine unique : x = " + r1);
             }
             return;
    	 }
    	 double delta= b*b - (4 * a * c);
    	 if (delta > 0) {
             r1 = (-b + Math.sqrt(delta)) / (2 * a);
             r2 = (-b - Math.sqrt(delta)) / (2 * a);
         } else if (delta == 0) {
             r1 = r2 = -b / (2 * a);
         } else {
             r1 = r2 = -b / (2 * a);
             i1 = Math.sqrt(-delta) / (2 * a);
             i2 = -i1; 
         }
          System.out.println("Methode de résolution");
      }
      public String toString()
      {
         return " \nRacine 1 : "+r1+" +i "+i1+"\n"+"Racine 2 : "+r2+" +i "+i2+"\n";

      }

}



