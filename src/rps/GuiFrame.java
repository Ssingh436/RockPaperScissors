package rps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GuiFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rock Paper Scissors");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton rockButton = new JButton("Rock");
        JButton paperButton = new JButton("Paper");
        JButton scissorsButton = new JButton("Scissors");
        panel.add(rockButton);
        panel.add(paperButton);
        panel.add(scissorsButton);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
