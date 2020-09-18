package Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk_Opdracht extends Applet {
    TextField tekstvak1, tekstvak2;
    Button knop1, knop2, knop3, knop4;
    double a,b, eindgetal;
    String as, bs, eindgetal2;

    public void init() {

        //tekstvakken
        tekstvak1 = new TextField("", 10);

        tekstvak2 = new TextField("", 10);

        //knoppen
        knop1 = new Button("+");
        knop1.addActionListener(new plus());

        knop2 = new Button("/");
        knop2.addActionListener(new slash());

        knop3 = new Button("-");
        knop3.addActionListener(new min());

        knop4 = new Button("*");
        knop4.addActionListener(new keer());

        //add
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
        add(tekstvak1);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
    }

    //plus
    class plus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            as = tekstvak1.getText();
            bs = tekstvak2.getText();
            a = Double.parseDouble(as);
            b = Double.parseDouble(bs);
            eindgetal = a + b;
            eindgetal2 = String.valueOf(eindgetal);
            tekstvak1.setText(eindgetal2);
            tekstvak2.setText("");
            repaint();
        }
    }

    //gedeeld door
    class slash implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            as = tekstvak1.getText();
            bs = tekstvak2.getText();
            a = Double.parseDouble(as);
            b = Double.parseDouble(bs);
            eindgetal = a / b;
            eindgetal2 = String.valueOf(eindgetal);
            tekstvak1.setText(eindgetal2);
            tekstvak2.setText("");
            repaint();
        }
    }

    //min
    class min implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            as = tekstvak1.getText();
            bs = tekstvak2.getText();
            a = Double.parseDouble(as);
            b = Double.parseDouble(bs);
            eindgetal = a - b;
            eindgetal2 = String.valueOf(eindgetal);
            tekstvak1.setText(eindgetal2);
            tekstvak2.setText("");
            repaint();
        }
    }

    //keer
    class keer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            as = tekstvak1.getText();
            bs = tekstvak2.getText();
            a = Double.parseDouble(as);
            b = Double.parseDouble(bs);
            eindgetal = a * b;
            eindgetal2 = String.valueOf(eindgetal);
            tekstvak1.setText(eindgetal2);
            tekstvak2.setText("");
            repaint();
        }
    }
}
