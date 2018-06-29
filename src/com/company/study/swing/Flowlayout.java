package com.company.study.swing;

import javax.swing.*;
import java.awt.*;

public class Flowlayout {
    public static void main(String args[]) {
        JFrame frame = new JFrame("流式布局-示例");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new FlowLayout());

        JButton bt1 = new JButton("按钮1");
        JButton bt2 = new JButton("按钮2");
        JButton bt3 = new JButton("按钮3");
        JButton bt4 = new JButton("按钮4");
        JButton bt5 = new JButton("按钮5");

        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        panel.add(bt4);
        panel.add(bt5);

        frame.setContentPane(panel);

        frame.setVisible(true);
    }
}
