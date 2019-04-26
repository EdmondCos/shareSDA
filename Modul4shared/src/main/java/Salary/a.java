package Salary;

import javax.swing.*;

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


    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new a().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
