package com.company.study.swing;

import javax.swing.*;
import java.awt.*;

public class Springlayout {
    public static void main(String args[]) {
        JFrame frame = new JFrame("弹性布局-示例");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        SpringLayout springLayout = new SpringLayout();
        JPanel panel = new JPanel(springLayout);
        panel.setBorder(BorderFactory.createLineBorder(Color.red, 2));

        frame.setContentPane(panel);

        JLabel label = new JLabel("测试 JLabel");
        JButton button = new JButton("这是按钮");
        JTextField textField = new JTextField("这是一个文本域 JTextField");

        panel.add(label);
        panel.add(button);
        panel.add(textField);

        //设置标签组件JLabel的约束
        SpringLayout.Constraints labelCons = springLayout.getConstraints(label);
        labelCons.setX(Spring.constant(5));
        labelCons.setY(Spring.constant(5));

        //设置按钮组件JButton的约束
        SpringLayout.Constraints btnCons = springLayout.getConstraints(button);
        btnCons.setX(Spring.constant(5));
        btnCons.setY(labelCons.getConstraint(SpringLayout.SOUTH));
        btnCons.setConstraint(SpringLayout.EAST, labelCons.getConstraint(SpringLayout.EAST));

        //设置文本框JTextField的约束
        SpringLayout.Constraints textFieldCons = springLayout.getConstraints(textField);
        textFieldCons.setX(Spring.sum(labelCons.getConstraint(SpringLayout.EAST), Spring.constant(5)));
        textFieldCons.setY(Spring.constant(5));

        //设置内容面板JPanel的约束
        SpringLayout.Constraints panelCons = springLayout.getConstraints(panel);
        panelCons.setConstraint(SpringLayout.EAST, Spring.sum(textFieldCons.getConstraint(SpringLayout.EAST), Spring.constant(5)));
        panelCons.setConstraint(SpringLayout.SOUTH,
                Spring.sum(Spring.max(btnCons.getConstraint(SpringLayout.SOUTH), textFieldCons.getConstraint(SpringLayout.SOUTH)),
                        Spring.constant(5)
                )
        );

        frame.setVisible(true);
    }
}
