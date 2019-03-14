import javax.swing.*;

public class Wierzcholek {

    public double wierzchołekP(String aTxt, String bTxt){
        double a = Double.parseDouble(aTxt);
        double b = Double.parseDouble(bTxt);
        double p = (-b)/(2*a); System.out.println("Wierzchołek p: " + String.valueOf(p));

        return p;
    }

    public double wierzcholekQ(String aTxt, String bTxt, String cTxt){

        double a = Double.parseDouble(aTxt);
        double b = Double.parseDouble(bTxt);
        double c = Double.parseDouble(cTxt);
        double delta = (b * b) - (4 * a * c);  System.out.println("delta: " + String.valueOf(delta));
        double q = (-delta)/(4*a); System.out.println("Wierzchołek q: " + String.valueOf(q));

        return q;
    }

}
