package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        JLabel label = new JLabel("Hello, world!");
        label.setForeground(Color.GREEN);
        label.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        frame.add(label);
    }
}
