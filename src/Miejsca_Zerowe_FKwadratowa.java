import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import static java.lang.StrictMath.sqrt;

public class Miejsca_Zerowe_FKwadratowa {


    public double Delta(String aTxt, String bTxt, String cTxt){

        double a = Double.parseDouble(aTxt);
        double b = Double.parseDouble(bTxt);
        double c = Double.parseDouble(cTxt);

        double delta = (b * b) - (4 * a * c);

        return delta;
    }

    public double x1(String aTxt, String bTxt, double delta){
            double a = Double.parseDouble(aTxt);
            double b = Double.parseDouble(bTxt);
            double sqrtDelta = sqrt(delta);
            double x1 = ((-b) - sqrtDelta) / (2*a);

            return x1;
    }
    public double x2(String aTxt, String bTxt, double delta){

            double a = Double.parseDouble(aTxt);
            double b = Double.parseDouble(bTxt);
            double sqrtDelta = sqrt(delta);
            double x2 = ((-b) + sqrtDelta) / (2*a);

            return x2;
    }

    public double x0(String aTxt, String bTxt){

        double a = Double.parseDouble(aTxt);
        double b = Double.parseDouble(bTxt);
        double x0 = -b / 2 * a;

        return x0;
    }


    public void miejsca_zerowe(String aTxt, String bTxt, String cTxt) {

        double a = Double.parseDouble(aTxt);
        double b = Double.parseDouble(bTxt);
        double c = Double.parseDouble(cTxt);

        double delta2 = (b * b) - (4 * a * c);
        System.out.println("Delta: "+ String.valueOf(delta2));

        if (delta2 > 0) {
            double sqrtDelta2 = sqrt(delta2);
            System.out.println("Pierwiastek z delty: "+String.valueOf(sqrtDelta2));

            double x11 = ((-b) - sqrtDelta2) / (2 * a); System.out.println("x1: "+ String.valueOf(x11));
            double x22 = ((-b) + sqrtDelta2) / (2 * a); System.out.println("x2: "+ String.valueOf(x22));
            JOptionPane.showMessageDialog(null, "Pierwiastki tego równania\n x1: " + x11 + "\n x2: " + x22);
        }
        if (delta2 == 0) {
            double x0 = (-b) / (2*a);
            JOptionPane.showMessageDialog(null, "To równanie ma tylko jedno rozwiązanie: " + x0);
        }
        if (delta2 < 0) {
            JOptionPane.showMessageDialog(null, "To równanie nie ma rozwiązań");
        }

    }
}