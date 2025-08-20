
package com.mycompany.machineproblem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author students
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class mp6 {

    static JTextField firstNumberr = new JTextField();
    static JTextField secondNumberr = new JTextField();
    static JTextField summ = new JTextField();
    static JFrame frame = new JFrame("Sample Frame");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("MachineProblem#6");
        JMenuBar menuBar = new JMenuBar();

        JMenu operating = new JMenu("Operating");
        JMenuItem additionFields = new JMenuItem("Addition");
        JMenuItem subtractionFields = new JMenuItem("Subtraction");
        JMenuItem multiplicationFields = new JMenuItem("Multiplication");
        JMenuItem divisionFields = new JMenuItem("Division");
        JMenuItem ExitFields = new JMenuItem("Exit");

        JMenu aboutFields = new JMenu("About the developer");
        JMenuItem qualificationFields = new JMenuItem("Qualification");
        JMenuItem personalFields = new JMenuItem("Personal Details");
        JMenuItem jobFields = new JMenuItem("Job Experience");

        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);

        menuBar.add(operating);
        operating.add(additionFields);
        operating.add(subtractionFields);
        operating.add(multiplicationFields);
        operating.add(divisionFields);
        operating.add(ExitFields);

        menuBar.add(aboutFields);
        aboutFields.add(qualificationFields);
        aboutFields.add(personalFields);
        aboutFields.add(jobFields);

        additionFields.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                additionFields();
            }

        });
        subtractionFields.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                subtractionFields();
            }

        });
        multiplicationFields.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "multiplicationFields");
            }

        });
        divisionFields.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "divisionFields");
            }

        });
        ExitFields.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "ExitFields");
            }

        });
    }

    public static void additionFields() {
        JLabel additionOfNumber = new JLabel("<<Addition of Number>>");
        JLabel firstNumber = new JLabel("First number");
        JLabel secondNumber = new JLabel("Second number");
        JLabel sum = new JLabel("Sum");

        JButton btn = new JButton();
        JButton btn2 = new JButton();
        JButton btn3 = new JButton();

        JPanel panel = new JPanel();

        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.add(panel);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.add(additionOfNumber);
        panel.add(firstNumber);
        panel.add(secondNumber);
        panel.add(sum);
        panel.add(firstNumberr);
        panel.add(secondNumberr);
        panel.add(summ);
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);

        additionOfNumber.setBounds(120, 10, 200, 30);
        additionOfNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
        additionOfNumber.setForeground(Color.white);

        firstNumber.setBounds(50, 50, 200, 30);
        firstNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
        firstNumber.setForeground(Color.white);
        firstNumberr.setBounds(170, 50, 200, 25);

        secondNumber.setBounds(50, 100, 200, 30);
        secondNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
        secondNumber.setForeground(Color.white);
        secondNumberr.setBounds(170, 100, 200, 25);

        sum.setBounds(50, 150, 200, 30);
        sum.setFont(new Font("Times New Roman", Font.BOLD, 15));
        sum.setForeground(Color.white);
        summ.setBounds(170, 150, 200, 25);

        btn.setBounds(50, 300, 80, 30);
        btn.setText("Compute");
        btn.setFont(new Font("Times New Roman", Font.BOLD, 10));

        btn2.setBounds(150, 300, 80, 30);
        btn2.setText("Clear");
        btn2.setFont(new Font("Times New Roman", Font.BOLD, 10));

        btn3.setBounds(250, 300, 80, 30);
        btn3.setText("Exit");
        btn3.setFont(new Font("Times New Roman", Font.BOLD, 10));

        btn.setActionCommand("Compute");
        btn2.setActionCommand("Clear");
        btn3.setActionCommand("Exit");

        btn.addActionListener(new ButtonActionListener());
        btn2.addActionListener(new ButtonActionListener());
        btn3.addActionListener(new ButtonActionListener());

    }

    public static class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String command = e.getActionCommand();

            if ("Compute".equals(command)) {
                computeFields();
            } else if ("Clear".equals(command)) {
                clearFields();
            } else {

                frame.dispose();
            }
        }

    }

    public static void computeFields() {
        int num1 = Integer.parseInt(firstNumberr.getText());
        int num2 = Integer.parseInt(secondNumberr.getText());
        int sum = num1 + num2;
        summ.setText(String.valueOf(sum));

    }

    public static void clearFields() {
        firstNumberr.setText("");
        secondNumberr.setText("");
        summ.setText("");
    }

    public static void subtractionFields() {
        JLabel additionOfNumber = new JLabel("<<Subtraction of Number>>");
        JLabel firstNumber = new JLabel("First number");
        JLabel secondNumber = new JLabel("Second number");
        JLabel sum = new JLabel("Difference");

        JButton btn = new JButton();
        JButton btn2 = new JButton();
        JButton btn3 = new JButton();

        JPanel panel = new JPanel();

        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.add(panel);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.add(additionOfNumber);
        panel.add(firstNumber);
        panel.add(secondNumber);
        panel.add(sum);
        panel.add(firstNumberr);
        panel.add(secondNumberr);
        panel.add(summ);
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);

        additionOfNumber.setBounds(120, 10, 200, 30);
        additionOfNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
        additionOfNumber.setForeground(Color.white);

        firstNumber.setBounds(50, 50, 200, 30);
        firstNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
        firstNumber.setForeground(Color.white);
        firstNumberr.setBounds(170, 50, 200, 25);

        secondNumber.setBounds(50, 100, 200, 30);
        secondNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
        secondNumber.setForeground(Color.white);
        secondNumberr.setBounds(170, 100, 200, 25);

        sum.setBounds(50, 150, 200, 30);
        sum.setFont(new Font("Times New Roman", Font.BOLD, 15));
        sum.setForeground(Color.white);
        summ.setBounds(170, 150, 200, 25);

        btn.setBounds(50, 300, 80, 30);
        btn.setText("Compute");
        btn.setFont(new Font("Times New Roman", Font.BOLD, 10));

        btn2.setBounds(150, 300, 80, 30);
        btn2.setText("Clear");
        btn2.setFont(new Font("Times New Roman", Font.BOLD, 10));

        btn3.setBounds(250, 300, 80, 30);
        btn3.setText("Exit");
        btn3.setFont(new Font("Times New Roman", Font.BOLD, 10));

        btn.setActionCommand("Compute");
        btn2.setActionCommand("Clear");
        btn3.setActionCommand("Exit");

        btn.addActionListener(new ButtonActionListenerr());
        btn2.addActionListener(new ButtonActionListenerr());
        btn3.addActionListener(new ButtonActionListenerr());

    }

    public static class ButtonActionListenerr implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String command = e.getActionCommand();

            if ("Compute".equals(command)) {
                computeFieldss();
            } else if ("Clear".equals(command)) {
                clearFieldss();
            } else {

                frame.dispose();
            }
        }

    }

    public static void computeFieldss() {
        int num1 = Integer.parseInt(firstNumberr.getText());
        int num2 = Integer.parseInt(secondNumberr.getText());
        int sum = num1 - num2;
        summ.setText(String.valueOf(sum));

    }

    public static void clearFieldss() {
        firstNumberr.setText("");
        secondNumberr.setText("");
        summ.setText("");
    }
}

