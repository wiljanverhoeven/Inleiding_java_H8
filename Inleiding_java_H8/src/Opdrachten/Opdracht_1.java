package Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_1 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String string;


    public void init() {
        tekstvak = new TextField("", 30);

        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());

        knop2 = new Button("No");
        knop2.addActionListener(new KnopListener2());
        add(knop);
        add(knop2);
        add(tekstvak);
        string ="";
    }

    public void paint(Graphics g) {
        g.drawString("" +string, 50,50);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string = tekstvak.getText();
            repaint();
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}