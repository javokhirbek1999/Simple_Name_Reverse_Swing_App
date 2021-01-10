package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Name_Reverse_Swing_App implements ActionListener {

    JFrame jFrame;
    JLabel promptLabel;
    JLabel contentLabel;
    JTextField textField;
    JButton reverseButton;

    public Name_Reverse_Swing_App() {

        jFrame = new JFrame("Name Reverse");

        jFrame.setLayout(new FlowLayout());

        promptLabel = new JLabel("Enter name: ");
        contentLabel = new JLabel("");

        jFrame.setVisible(true);
        jFrame.setSize(250,120);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(10);
        reverseButton = new JButton("Reverse");

        jFrame.add(promptLabel);
        jFrame.add(textField);
        jFrame.add(reverseButton);
        jFrame.add(contentLabel);

        textField.setActionCommand("textField");
        reverseButton.setActionCommand("reverse_btn");

        textField.addActionListener(this);
        reverseButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("reverse_btn")) {

            String original = textField.getText();
            String result = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                result += original.charAt(i);
                contentLabel.setText(result);
            }

        }else{
                contentLabel.setText("Result: " + textField.getText());
            }
        }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Name_Reverse_Swing_App();
            }
        });
    }
}
