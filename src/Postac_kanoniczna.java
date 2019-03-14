import javax.swing.*;

public class Postac_kanoniczna {

    public void PostacKanoniczna(String aTxt, String bTxt, String cTxt){

        Wierzcholek w = new Wierzcholek();
        if(w.wierzchołekP(aTxt,bTxt)>0 && w.wierzcholekQ(aTxt,bTxt,cTxt)>0) {
            JOptionPane.showMessageDialog(null, "y=" + aTxt + "(x-"
                    + w.wierzchołekP(aTxt, bTxt) +")\u00B2" + " + " + w.wierzcholekQ(aTxt, bTxt, cTxt));
        }
        if(w.wierzchołekP(aTxt,bTxt)<0 && w.wierzcholekQ(aTxt,bTxt,cTxt)>0) {
            JOptionPane.showMessageDialog(null, "y=" + aTxt + "(x+"
                    + (-w.wierzchołekP(aTxt, bTxt)) +")\u00B2" + " + " + w.wierzcholekQ(aTxt, bTxt, cTxt));
        }
        if(w.wierzchołekP(aTxt,bTxt)>0 && w.wierzcholekQ(aTxt,bTxt,cTxt)<0) {
            JOptionPane.showMessageDialog(null, "y=" + aTxt + "(x-"
                    + w.wierzchołekP(aTxt, bTxt) +")\u00B2" + w.wierzcholekQ(aTxt, bTxt, cTxt));
        }
        if(w.wierzchołekP(aTxt,bTxt)<0 && w.wierzcholekQ(aTxt,bTxt,cTxt)<0) {
            JOptionPane.showMessageDialog(null, "y=" + aTxt + "(x+"
                    + (-w.wierzchołekP(aTxt, bTxt)) +")\u00B2" + w.wierzcholekQ(aTxt, bTxt, cTxt));
        }

    }

}
