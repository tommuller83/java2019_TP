// Q2.2

import javax.swing.JOptionPane;

public class menu{
    public static void main(String[] args) {
        try {
            // Saisie des coefficients via des boîtes de dialogue
            String inputA = JOptionPane.showInputDialog("Veuillez saisir le coefficient a :");
            String inputB = JOptionPane.showInputDialog("Veuillez saisir le coefficient b :");
            String inputC = JOptionPane.showInputDialog("Veuillez saisir le coefficient c :");

            // Conversion des chaînes saisies en double
            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);
            double c = Double.parseDouble(inputC);

            // Création de l'objet pour résoudre l'équation
            Eqdegre2 eq = new Eqdegre2(a, b, c);

            // Affichage des résultats dans une boîte de dialogue
            JOptionPane.showMessageDialog(null, "Le resultat est :\n" + eq.toString());

        } catch (NumberFormatException e) {
            // Gestion d'une mauvaise saisie (non numérique)
            JOptionPane.showMessageDialog(null, "Erreur : veuillez saisir un nombre valide !");
        }

        // Fermeture de l'application
        System.exit(0);
    }
}
