/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mp4;

/**
 *
 * @author jm
 */
    import java.awt.Font;
    import javax.swing.*;
    import java.awt.event.*;
    import java.awt.event.ActionListener;
public class Mp4 {
    JTextField unitsField, yearField, codeField;
    JTextField rateField, miscField, tuitionField, discountField, classificationField, totalMatricField;
    JButton computeBtn, clearBtn, exitBtn;
    static JFrame frame = new JFrame("Tuition Fee Computation");
    public static void main(String[] args) {
        JPanel panel = new JPanel ();
        panel.setLayout(null);
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.add(panel);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    JLabel header1 = new JLabel("Saint Vincent Ferrer College", JLabel.CENTER);
    header1.setFont(new Font("Sans-serif", Font.BOLD, 18));
    header1.setBounds(200,10,200,30);
    panel.add(header1);


    JLabel header2 = new JLabel("<<< Tuition Fee Computation >>>", JLabel.CENTER);
    header2.setFont(new Font("Sans-serif", Font.BOLD, 16));
    header2.setBounds(200,50,200,30);
    panel.add(header2);


    JLabel lbl1 = new JLabel("No. of units enrolled ...");
    lbl1.setBounds(10,100,200,30);
    panel.add(lbl1);

    JTextField unitsField = new JTextField();
    unitsField.setBounds(150, 100 , 130 ,20);
    panel.add(unitsField);

    JLabel lbl2 = new JLabel("Rate per unit");
    lbl2.setBounds(300,100,200,30);
    panel.add(lbl2);

   JTextField rateField = new JTextField();
    rateField.setBounds(440, 100 , 130 ,20);
    rateField.setEditable(false);
    panel.add(rateField);

    JLabel lbl3 = new JLabel("Year Level");
    lbl3.setBounds(10,150,200,30);
    panel.add(lbl3);

    JTextField yearField = new JTextField();
    yearField.setBounds(150, 150 , 130 ,20);
    panel.add(yearField);
    
    JLabel lbl4 = new JLabel("Miscellaneous fee");
    lbl4.setBounds(300,150,200,30);
    panel.add(lbl4);

    JTextField miscField = new JTextField();
    miscField.setBounds(440, 150 , 130 ,20);
    miscField.setEditable(false);
    panel.add(miscField);

    JLabel lbl5 = new JLabel("Student code");
    lbl5.setBounds(10,200,200,30);
    panel.add(lbl5);

    JTextField codeField = new JTextField();
    codeField.setBounds(150, 200 , 130 ,20);
    panel.add(codeField);

    JLabel lbl6 = new JLabel("Total Tuition fee");
    lbl6.setBounds(300,200,200,30);
    panel.add(lbl6);

    JTextField tuitionField = new JTextField();
    tuitionField.setBounds(440, 200 , 130 ,20);
    tuitionField.setEditable(false);
    panel.add(tuitionField);

    JLabel lbl7 = new JLabel("Student discount");
    lbl7.setBounds(10,250,200,30);
    panel.add(lbl7);

    JTextField discountField = new JTextField();
    discountField.setBounds(150, 250 , 130 ,20);
    discountField.setEditable(false);
    panel.add(discountField);

    JLabel lbl8 = new JLabel("Student classification");
    lbl8.setBounds(10,350,200,30);
    panel.add(lbl8);

    JTextField classificationField = new JTextField();
    classificationField.setBounds(155, 350 , 130 ,20);
    panel.add(classificationField);

    JLabel lbl9 = new JLabel("Total Matriculation fee");
    lbl9.setBounds(300,350,200,30);
    panel.add(lbl9);

    JTextField totalMatricField = new JTextField();
    totalMatricField.setBounds(440, 350 , 130 ,20);
    panel.add(totalMatricField);

    JButton computeBtn = new JButton("Compute");
    computeBtn.setBounds(150,450,100,40);
    computeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                int units = Integer.parseInt(unitsField.getText());
                int year = Integer.parseInt(yearField.getText());
                int code = Integer.parseInt(codeField.getText());
                
                int rate = 0, misc = 0;
                double discountRate = 0.0;
                String classification ="";
                
                switch (year){
                    case 1:
                        rate = 500; 
                        misc = 4000; 
                        break;
                    case 2:
                        rate = 600; 
                        misc = 5000; 
                        break;
                    case 3:
                        rate = 700; 
                        misc = 6000; 
                        break;
                    case 4:
                        rate = 800; 
                        misc = 7000; 
                        break;
                    default:
                    JOptionPane.showMessageDialog(null,"Invalid year level");
                    
                }
                switch(code){
                    case 1: 
                        classification ="Ordinary student"; 
                        discountRate = 0.0;
                        break;
                    case 2: 
                        classification ="Student Scholar"; 
                        discountRate = 0.5;
                        break;
                    case 3: 
                        classification ="Student Athlete"; 
                        discountRate = 1.0;
                        break;
                    default:
                    JOptionPane.showMessageDialog(null,"Invalid student code");
                }
                int tuition = units * rate;
                double discount = tuition * discountRate;
                double totalMatric = tuition - discount + misc;
                
                rateField.setText(String.valueOf(rate));
                miscField.setText(String.valueOf(misc));
                tuitionField.setText(String.format("%.2f",(double)tuition));
                discountField.setText(String.format("%.2f",discount));
                classificationField.setText(classification);
                totalMatricField.setText(String.format("%.2f",totalMatric));
            }
            catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Please inpute valid numbers");
            }
                
            }
    });
    panel.add(computeBtn);

    JButton clearBtn = new JButton("Clear");
    clearBtn.setBounds(250,450,100,40);
    clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unitsField.setText("");
            yearField.setText("");
            codeField.setText("");
            rateField.setText("");
            miscField.setText("");
            tuitionField.setText("");
            discountField.setText("");
            classificationField.setText("");
            totalMatricField.setText("");
            }
    });
    panel.add(clearBtn);

    JButton exitBtn = new JButton("Exit");
    exitBtn.setBounds(350,450,100,40);
    exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
    } );
    panel.add(exitBtn);

    panel.setVisible(true);
}
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==computeBtn){
            
                
        }
        else if(e.getSource()== clearBtn){
            
            
        } else if (e.getSource()==exitBtn){
            
        }
    }
    
    }

