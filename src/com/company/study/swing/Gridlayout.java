package com.company.study.swing;

import javax.swing.*;
import java.awt.*;

public class Gridlayout {
    public static void main(String args[]) {
        JFrame frame = new JFrame("网格布局-示例");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        GridLayout gridLayout = new GridLayout(3, 3);
        gridLayout.setHgap(1);
        gridLayout.setVgap(2);
        JPanel panel = new JPanel(gridLayout);

        JButton bt1 = new JButton("按钮1");
        JButton bt2 = new JButton("按钮2");
        JButton bt3 = new JButton("按钮3");
        JButton bt4 = new JButton("按钮4");
        JButton bt5 = new JButton("按钮5");
        JButton bt6 = new JButton("按钮6");
        JButton bt7 = new JButton("按钮7");
        JButton bt8 = new JButton("按钮8");
        JButton bt9 = new JButton("按钮9");
        JButton bt10 = new JButton("按钮10");
        JButton bt11 = new JButton("按钮11");
        JButton bt12 = new JButton("按钮12");
        JButton bt13 = new JButton("按钮13");
        JButton bt14 = new JButton("按钮14");

        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        panel.add(bt4);
        panel.add(bt5);
        panel.add(bt6);
        panel.add(bt7);
        panel.add(bt8);
        panel.add(bt9);
        panel.add(bt10);
        panel.add(bt11);
        panel.add(bt12);
        panel.add(bt13);
        panel.add(bt14);

        frame.setContentPane(panel);

        frame.setVisible(true);

    }
}
