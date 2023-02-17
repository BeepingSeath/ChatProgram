package client;

import javax.swing.*;

public class controller {
    private model c;
    private view v;
    public controller(model m, view v) {


        JFrame frame = new JFrame("view");
        frame.setContentPane(v.getJpanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
