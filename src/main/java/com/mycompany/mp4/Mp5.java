package com.mycompany.mp4;


import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Mp5 {

    JTextField unitsField, yearField, codeField;
    JTextField rateField, miscField, tuitionField, discountField, classificationField, totalMatricField;
    JButton computeBtn, clearBtn, exitBtn;
    static JFrame frame = new JFrame("mp5");

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        frame.setSize(800, 600);

        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel header1 = new JLabel("ABC University", JLabel.CENTER);
        header1.setFont(new Font("Sans-serif", Font.BOLD, 18));
        header1.setBounds(200, 10, 200, 30);
        panel.add(header1);


        JLabel header2 = new JLabel("<<< Grade Computation >>>", JLabel.CENTER);
        header2.setFont(new Font("Sans-serif", Font.BOLD, 16));
        header2.setBounds(200, 50, 200, 30);
        panel.add(header2);


        JLabel lbl1 = new JLabel("Quiz #1");
        lbl1.setBounds(10, 100, 200, 30);
        panel.add(lbl1);

        JTextField quiz1 = new JTextField();
        quiz1.setBounds(150, 100, 130, 20);
        panel.add(quiz1);

        JLabel lbl2 = new JLabel("Midterm Exam");
        lbl2.setBounds(300, 100, 200, 30);
        panel.add(lbl2);

        JTextField midTermExam = new JTextField();
        midTermExam.setBounds(440, 100, 130, 20);
        midTermExam.setEditable(true);
        panel.add(midTermExam);

        JLabel lbl3 = new JLabel("Quiz#2");
        lbl3.setBounds(10, 150, 200, 30);
        panel.add(lbl3);

        JTextField quiz2 = new JTextField();
        quiz2.setBounds(150, 150, 130, 20);
        panel.add(quiz2);

        JLabel lbl4 = new JLabel("Attendance");
        lbl4.setBounds(300, 150, 200, 30);
        panel.add(lbl4);

        JTextField attendance = new JTextField();
        attendance.setBounds(440, 150, 130, 20);
        attendance.setEditable(true);
        panel.add(attendance);

        JLabel lbl5 = new JLabel("Quiz #3");
        lbl5.setBounds(10, 200, 200, 30);
        panel.add(lbl5);

        JTextField quiz3 = new JTextField();
        quiz3.setBounds(150, 200, 130, 20);
        panel.add(quiz3);

        JLabel lbl6 = new JLabel("Recitation");
        lbl6.setBounds(300, 200, 200, 30);
        panel.add(lbl6);

        JTextField recitaion = new JTextField();
        recitaion.setBounds(440, 200, 130, 20);
        recitaion.setEditable(true);
        panel.add(recitaion);

        JLabel lbl7 = new JLabel("Average");
        lbl7.setBounds(10, 250, 200, 30);
        panel.add(lbl7);

        JTextField average = new JTextField();
        average.setBounds(150, 250, 130, 20);
        average.setEditable(false);
        panel.add(average);

        JLabel lbll0 = new JLabel("Class Standing");
        lbll0.setBounds(300, 250, 200, 30);
        panel.add(lbll0);

        JTextField classStanding = new JTextField();
        classStanding.setBounds(440, 250, 130, 20);
        classStanding.setEditable(false);
        panel.add(classStanding);


        JLabel lbl8 = new JLabel("Midterm Grade");
        lbl8.setBounds(10, 350, 200, 30);
        panel.add(lbl8);

        JTextField midTermFields = new JTextField();
        midTermFields.setBounds(155, 350, 130, 20);
        panel.add(midTermFields);

        JLabel lbl9 = new JLabel("transmutted grade");
        lbl9.setBounds(300, 350, 200, 30);
        panel.add(lbl9);

        JTextField transmuttedFields = new JTextField();
        transmuttedFields.setBounds(440, 350, 130, 20);
        panel.add(transmuttedFields);

        JLabel lbl11 = new JLabel("Remark: ");
        lbl11.setBounds(150, 400, 200, 30);
        panel.add(lbl11);

        JTextField remarkFields = new JTextField();
        remarkFields.setBounds(200, 400, 130, 20);
        panel.add(remarkFields);


        JButton computeBtn = new JButton("Compute");
        computeBtn.setBounds(150, 450, 100, 40);
        computeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double averageQuiz = ((Double.parseDouble(quiz1.getText()) + Integer.parseInt(quiz2.getText()) + Integer.parseInt(quiz3.getText()))/3);
                    average.setText(String.valueOf(averageQuiz));
                    double recitation = Double.parseDouble(recitaion.getText());
                    double attndance = Double.parseDouble(attendance.getText());
                    double clazzStanding = ((averageQuiz*0.2) + (recitation*0.6) + (attndance * 0.2));
                    classStanding.setText(String.valueOf(clazzStanding));
                    double midtermExam = Double.parseDouble(midTermExam.getText());
                    double midtermGrade = ((midtermExam*0.5) + (clazzStanding*0.5));
                    midTermFields.setText(String.valueOf(midtermGrade));
                    long roundedMidtermGrade = Math.round(midtermGrade);
                    if(roundedMidtermGrade <= 74){
                        transmuttedFields.setText(String.valueOf(5.0));
                        remarkFields.setText("Failed");

                    }else if(roundedMidtermGrade >= 75 && roundedMidtermGrade <= 77){
                        transmuttedFields.setText(String.valueOf(3.0));
                        remarkFields.setText("Passed");
                    }else if(roundedMidtermGrade >= 78 && roundedMidtermGrade <= 80){
                        transmuttedFields.setText(String.valueOf(2.75));
                        remarkFields.setText("High Passed");
                    }else if(roundedMidtermGrade >= 81 && roundedMidtermGrade <= 83){
                        transmuttedFields.setText(String.valueOf(2.50));
                        remarkFields.setText("Good");
                    }else if(roundedMidtermGrade >= 84 && roundedMidtermGrade <= 86){
                        transmuttedFields.setText(String.valueOf(2.25));
                        remarkFields.setText("Very Good");
                    }else if(roundedMidtermGrade >= 87 && roundedMidtermGrade <= 89){
                        transmuttedFields.setText(String.valueOf(2.0));
                        remarkFields.setText("Satisfactory");
                    }else if(roundedMidtermGrade >= 90 && roundedMidtermGrade <= 92){
                        transmuttedFields.setText(String.valueOf(1.75));
                        remarkFields.setText("Very Satisfactory");
                    }else if(roundedMidtermGrade >= 93 && roundedMidtermGrade <= 95){
                        transmuttedFields.setText(String.valueOf(1.50));
                        remarkFields.setText("Excellent");
                    }else if(roundedMidtermGrade >= 96 && roundedMidtermGrade <= 98){
                        transmuttedFields.setText(String.valueOf(3.0));
                        remarkFields.setText("Very Excellent");
                    }else if(roundedMidtermGrade >= 99 && roundedMidtermGrade <= 100){
                        transmuttedFields.setText(String.valueOf(1.0));
                        remarkFields.setText("Superior");
                    }





                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please inpute valid numbers");
                }

            }
        });
        panel.add(computeBtn);

        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(250, 450, 100, 40);
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quiz1.setText("");
                quiz2.setText("");
                quiz3.setText("");
                average.setText("");
                midTermExam.setText("");
                attendance.setText("");
                recitaion.setText("");
                classStanding.setText("");
                midTermFields.setText("");
                transmuttedFields.setText("");
                remarkFields.setText("");
            }
        });
        panel.add(clearBtn);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(350, 450, 100, 40);
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        panel.add(exitBtn);

        panel.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == computeBtn) {


        } else if (e.getSource() == clearBtn) {


        } else if (e.getSource() == exitBtn) {

        }
    }
}
