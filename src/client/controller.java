package client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class controller {
    private model c;
    private view v;
    public controller(model m, view v) {


        JFrame frame = new JFrame("view");
        frame.setContentPane(v.getJpanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        v.getYoButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = v.getInput().getText();
                v.getChat().append("CLIENT: " + msg);
            }
        });
    }
}
