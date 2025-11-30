import javax.swing.JOptionPane;

public class menuAvecException {
    public static void main(String[] args) {
        try {
            // Saisie des coefficients via des boîtes de dialogue
            String inputA = JOptionPane.showInputDialog("Veuillez saisir le coefficient a :");
            String inputB = JOptionPane.showInputDialog("Veuillez saisir le coefficient b :");
            String inputC = JOptionPane.showInputDialog("Veuillez saisir le coefficient c :");

            // Vérification si l'utilisateur a annulé la saisie
            if (inputA == null || inputB == null || inputC == null) {
                JOptionPane.showMessageDialog(null, "Saisie annulée.", "Information", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            // Conversion des chaînes saisies en double
            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);
            double c = Double.parseDouble(inputC);

            // Création de l'objet pour résoudre l'équation
            Eqdegre2AvecException eq = new Eqdegre2AvecException(a, b, c);

            // Affichage des résultats dans une boîte de dialogue
            JOptionPane.showMessageDialog(null, "Le resultat est :\n" + eq.toString(), "Resultats", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            // Gestion d'une mauvaise saisie (non numérique)
            JOptionPane.showMessageDialog(null, "Erreur : veuillez saisir un nombre valide !", "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (CoefficientZeroException e) {
            // Gestion de l'exception personnalisée
            JOptionPane.showMessageDialog(null, "Erreur : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        // Fermeture de l'application
        System.exit(0);
    }
}
