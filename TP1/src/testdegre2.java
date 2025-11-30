import java.io.*;

public class testdegre2 {

		 public static void main(String[] args) throws Exception
		    {
		      System.out.println("Veuillez saisir les coefs a, b, c au clavier !");
		      BufferedReader clavier=new BufferedReader(new InputStreamReader(System.in));
		      String chaine1=clavier.readLine();
		      String chaine2=clavier.readLine();
		      String chaine3=clavier.readLine();
		      

		      double a=Double.parseDouble(chaine1) ;
		      double b=Double.parseDouble(chaine2) ;
		      double c=Double.parseDouble(chaine3) ;
		       

		       Eqdegre2 eq=new Eqdegre2(a,b,c);

		       System.out.println("Le resultat est : "+eq.toString());
		       

		       System.exit(0);     
		    

	}

}
