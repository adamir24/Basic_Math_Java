import javax.swing.*;

public class BasicMath {

    public static void main(String[] args) {
        JFrame ramka = new JFrame("Basic Math");
        ramka.setContentPane(new OknoMenu().panelMenu);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.pack();
        ramka.setVisible(true);
        ramka.setSize(300,200);
    }
}
