package client;

import javax.swing.*;

public class view {
    private JButton YoButton;
    private JButton WoahButton;
    private JPanel Jpanel;


    public static void main(String[] args) {
        JFrame frame = new JFrame("view");
        frame.setContentPane(new view().Jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
