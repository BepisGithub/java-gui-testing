package com.company;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        JLabel label = new JLabel("Hello, world!");
        label.setForeground(Color.GREEN);
        label.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        frame.add(label);
    }
}
