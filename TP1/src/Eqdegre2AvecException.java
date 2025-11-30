import java.io.*;

public class Eqdegre2AvecException extends Eqdegre2 {
    public Eqdegre2AvecException(double a, double b, double c) throws CoefficientZeroException {
        super(a, b, c);
        if (a == 0) {
            throw new CoefficientZeroException("a ne peut pas être égal à 0 pour une equation du second degre.");
        }
    }
}
