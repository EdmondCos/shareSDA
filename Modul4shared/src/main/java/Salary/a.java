package Salary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class a {
    private JPanel Main;
    private JPanel Brut;
    private JPanel Net;
    private JTextField brut;
    private JTextField net;
    private JTextField zileCM;
    private JPanel CM;
    private JPanel OT;
    private JPanel Saptamana;
    private JTextField oreSaptamana;
    private JPanel Weekend;
    private JTextField oreWeekend;
    private JPanel Sarbatori;
    private JTextField oreSarbatori;
    private JPanel Salariu;
    private JTextField procentCM;
    private JTextField procentWeek;
    private JTextField procentSarbatori;
    private JCheckBox impozit;
    private JTextField procentWeekend;

    private String sNet;
    private String sBrut;

    public a() {
        brut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sNet = brut.getText();
                double brut = Integer.valueOf(sNet)*0.585;
                sNet = String.valueOf(Math.round(brut));
                net.setText(sNet);
            }
        });

        net.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBrut = net.getText();
                double net = Integer.valueOf(sBrut)/0.585;
                sBrut = String.valueOf(Math.round(net));
                brut.setText(sBrut);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Salary Calculator");
        frame.setContentPane(new a().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
