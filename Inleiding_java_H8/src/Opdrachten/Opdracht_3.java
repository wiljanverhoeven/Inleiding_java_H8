package Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Opdracht_3 extends Applet {
    TextField tekstvak;
    Button knop;
    String prijs;
    double prijs2, eindprijs;
    int a, b;
    DecimalFormat df = new DecimalFormat("#.00");

    public void init() {
        a = 100;
        b = 121;

        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new KnopListener());

        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(knop);
        add(tekstvak);
        prijs ="";
    }

    public void paint(Graphics g) {
        g.drawString("prijs met btw is:" +df.format(eindprijs) , 50,50);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            prijs = tekstvak.getText();
            prijs2 = Double.parseDouble(prijs);
            eindprijs = (prijs2 / 100) *121;
            repaint();
        }
    }
}