package client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class view {
    private JButton YoButton;
    private JPanel Jpanel;
    private JTextArea Chat;
    private JTextField Input;

    public JTextArea getChat() {
        return Chat;
    }

    public JTextField getInput() {
        return Input;
    }

    public JButton getYoButton() {
        return YoButton;
    }

    public JPanel getJpanel() {
        return Jpanel;
    }
}
