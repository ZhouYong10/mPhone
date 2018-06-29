package com.company.study.swing;

import javax.swing.*;

public class SimpleWin {
    public static void main(String args[]) {
        JFrame frame = new JFrame("测试窗口");
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("测试按钮");

        panel.add(button);
        frame.setContentPane(panel);

        frame.setVisible(true);
    }
}
