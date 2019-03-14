import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OknoMenu {
    public JPanel panelMenu;
    private JButton przyciskFunkcjaLiniowa;
    private JButton przyciskFunkcjaKwadratowa;

    public OknoMenu() {
        przyciskFunkcjaKwadratowa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ramka = new JFrame("Funkcja Kwadratowa");
                ramka.setContentPane(new OknoFunkcjaKwadratowa().panelFunkcjaKwadratowa);
                ramka.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ramka.pack();
                ramka.setVisible(true);
                ramka.setSize(480,260);
            }
        });
        przyciskFunkcjaLiniowa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ramka = new JFrame("Funkcja Liniowa");
                ramka.setContentPane(new OknoFunkcjaLiniowa().panelFunkcjaLiniowa);
                ramka.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ramka.pack();
                ramka.setVisible(true);
                ramka.setSize(480,260);
            }
        });
    }
}
