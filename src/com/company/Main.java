package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
//        /* JFrame frame = new JFrame();
//        frame.setTitle("Testing GUI");
//        frame.setResizable(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setVisible(true);
//        frame.getContentPane().setBackground(Color.red); */
//        MyFrame frame = new MyFrame();
//
//        JLabel label = new JLabel();
//        label.setText("Sample text");
//        frame.add(label);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel basic1 = new JLabel("Sample text");
        JLabel basic2 = new JLabel("Sample text");
        JLabel basic3 = new JLabel("Sample text");
        JLabel basic4 = new JLabel("Sample text");

        frame.add(basic1);
        frame.add(basic2);
        frame.add(basic3);
        frame.add(basic4);
    }
}
