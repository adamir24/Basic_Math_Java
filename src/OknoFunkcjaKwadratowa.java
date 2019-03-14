import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OknoFunkcjaKwadratowa {
    public JPanel panelFunkcjaKwadratowa;
    private JTextField poleA;
    private JTextField poleB;
    private JTextField poleC;
    private JButton przyciskMiejscaZerowe;
    private JButton przyciskWierzcholek;
    private JButton przyciskIloczynowa;
    private JButton przyciskKanoniczna;
    private JButton przyciskWykres;


    public OknoFunkcjaKwadratowa()
    {
        przyciskMiejscaZerowe.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String aTxt = poleA.getText();
                String bTxt = poleB.getText();
                String cTxt = poleC.getText();

                Miejsca_Zerowe_FKwadratowa mz = new Miejsca_Zerowe_FKwadratowa();
                mz.miejsca_zerowe(aTxt, bTxt, cTxt);
            }
        });

        przyciskWierzcholek.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String aTxt = poleA.getText();
                String bTxt = poleB.getText();
                String cTxt = poleC.getText();

                Wierzcholek w = new Wierzcholek();
                JOptionPane.showMessageDialog(null, "Wierzchołkiem parabloli są punkty:\np: "
                        + w.wierzchołekP(aTxt,bTxt) + "\nq: "+w.wierzcholekQ(aTxt,bTxt,cTxt));
            }
        });

        przyciskIloczynowa.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String aTxt = poleA.getText();
                String bTxt = poleB.getText();
                String cTxt = poleC.getText();

                Postac_Iloczynowa pi = new Postac_Iloczynowa();
                pi.postacIloczynowa(aTxt, bTxt,cTxt);
            }
        });

        przyciskKanoniczna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String aTxt = poleA.getText();
                String bTxt = poleB.getText();
                String cTxt = poleC.getText();

                Postac_kanoniczna pk = new Postac_kanoniczna();
                pk.PostacKanoniczna(aTxt,bTxt,cTxt);
            }
        });
        przyciskWykres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String aTxt = poleA.getText();
                String bTxt = poleB.getText();
                String cTxt = poleC.getText();

                Parabola p = new Parabola();
                p.parabola(aTxt,bTxt,cTxt);

            }
        });
    }
}
