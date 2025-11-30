import java.io.*;

public class testdegre2_3 {
    public static void main(String[] args) {
        try {
            System.out.println("Veuillez saisir les coefficients a, b, c au clavier !");
            BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
            String chaine1 = clavier.readLine();
            String chaine2 = clavier.readLine();
            String chaine3 = clavier.readLine();
            double a = Double.parseDouble(chaine1);
            double b = Double.parseDouble(chaine2);
            double c = Double.parseDouble(chaine3);

            Eqdegre2AvecException eq = new Eqdegre2AvecException(a, b, c);
            System.out.println("Le résultat est : " + eq.toString());

        } catch (NumberFormatException e) {
            System.err.println("Erreur : veuillez saisir un nombre valide !");
        } catch (CoefficientZeroException e) {
            System.err.println("Erreur : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erreur de lecture au clavier : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Une erreur inattendue est survenue : " + e.getMessage());
        }
    }
}
