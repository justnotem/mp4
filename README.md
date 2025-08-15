/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mp5;

/**
 *
 * @author jm
 */
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
        JPanel panel = new JPanel ();
        panel.setLayout(null);
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.add(panel);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    JLabel header1 = new JLabel("ABC University", JLabel.CENTER);
    header1.setFont(new Font("Sans-serif", Font.BOLD, 18));
    header1.setBounds(200,10,200,30);
    panel.add(header1);


    JLabel header2 = new JLabel("<<< Grade Computation >>>", JLabel.CENTER);
    header2.setFont(new Font("Sans-serif", Font.BOLD, 16));
    header2.setBounds(200,50,200,30);
    panel.add(header2);


    JLabel lbl1 = new JLabel("Quiz #1");
    lbl1.setBounds(10,100,200,30);
    panel.add(lbl1);

    JTextField quiz1 = new JTextField();
    quiz1.setBounds(150, 100 , 130 ,20);
    panel.add(quiz1);

    JLabel lbl2 = new JLabel("Midterm Exam");
    lbl2.setBounds(300,100,200,30);
    panel.add(lbl2);

   JTextField midTerm = new JTextField();
    midTerm.setBounds(440, 100 , 130 ,20);
    midTerm.setEditable(false);
    panel.add(midTerm);

    JLabel lbl3 = new JLabel("Quiz#2");
    lbl3.setBounds(10,150,200,30);
    panel.add(lbl3);

    JTextField quiz2 = new JTextField();
    quiz2.setBounds(150, 150 , 130 ,20);
    panel.add(quiz2);
    
    JLabel lbl4 = new JLabel("Attendance");
    lbl4.setBounds(300,150,200,30);
    panel.add(lbl4);

    JTextField attendance = new JTextField();
    attendance.setBounds(440, 150 , 130 ,20);
    attendance.setEditable(false);
    panel.add(attendance);

    JLabel lbl5 = new JLabel("Quiz #3");
    lbl5.setBounds(10,200,200,30);
    panel.add(lbl5);

    JTextField quiz3 = new JTextField();
    quiz3.setBounds(150, 200 , 130 ,20);
    panel.add(quiz3);

    JLabel lbl6 = new JLabel("Recitation");
    lbl6.setBounds(300,200,200,30);
    panel.add(lbl6);

    JTextField recitaion = new JTextField();
    recitaion.setBounds(440, 200 , 130 ,20);
    recitaion.setEditable(false);
    panel.add(recitaion);

    JLabel lbl7 = new JLabel("Average");
    lbl7.setBounds(10,250,200,30);
    panel.add(lbl7);

    JTextField average = new JTextField();
    average.setBounds(150, 250 , 130 ,20);
    average.setEditable(false);
    panel.add(average);
    
    JLabel lbll0 = new JLabel("Class Standing");
    lbll0.setBounds(300,250,200,30);
    panel.add(lbll0);

    JTextField classStanding = new JTextField();
    classStanding.setBounds(440, 250 , 130 ,20);
    classStanding.setEditable(false);
    panel.add(classStanding);


    
    
    JLabel lbl8 = new JLabel("Midterm Grade");
    lbl8.setBounds(10,350,200,30);
    panel.add(lbl8);

    JTextField midTermFields = new JTextField();
    midTermFields.setBounds(155, 350 , 130 ,20);
    panel.add(midTermFields);

    JLabel lbl9 = new JLabel("transmutted grade");
    lbl9.setBounds(300,350,200,30);
    panel.add(lbl9);

    JTextField transmuttedFields = new JTextField();
    transmuttedFields.setBounds(440, 350 , 130 ,20);
    panel.add(transmuttedFields);
    
    JLabel lbl11 = new JLabel("Remark: ");
    lbl11.setBounds(150,400,200,30);
    panel.add(lbl11);

    JTextField remarkFields = new JTextField();
    remarkFields.setBounds(200, 400 , 130 ,20);
    panel.add(remarkFields);
    
    

    JButton computeBtn = new JButton("Compute");
    computeBtn.setBounds(150,450,100,40);
    computeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                int transmutted = Integer.parseInt(transmuttedFields.getText());
                int grade = Integer.parseInt(midTermFields.getText());
                int remark = Integer.parseInt(remarkFields.getText());
                
               
                String classification ="";
                String transmuttedGrade = "";
                
                switch (grade){
                    case 1:
                        grade = 74; 
                        
                        break;
                    case 2:
                        grade = 75; 
                        grade = 76; 
                        grade = 77; 
                        
                        break;
                    case 3:
                        grade = 78;
                        grade = 79; 
                        grade = 80; 
                        
                        break;
                    case 4:
                        grade = 81;
                        grade = 82;
                        grade = 83;
                        
                        break;
                    case 5:
                        grade = 84;
                        grade = 85;
                        grade = 86;
                        
                        break;
                    case 6:
                        grade = 87;
                        grade = 88;
                        grade = 89;
                        
                        break;
                    case 7:
                        grade = 90;
                        grade = 91;
                        grade = 92;
                        
                        break;
                    case 8:
                        grade = 93;
                        grade = 94;
                        grade = 95;
                        
                        break;
                    case 9:
                        grade = 96;
                        grade = 97;
                        grade = 98;
                        
                        break;
                    case 10:
                        grade = 99;
                        grade = 100;
                        
                        break;
                    default:
                    JOptionPane.showMessageDialog(null,"Invalid Grade");
                    
                }
                switch(remark){
                    case 1: 
                        classification ="Failed"; 
                        
                        break;
                    case 2: 
                        classification ="Passed"; 
                        
                        break;
                    case 3: 
                        classification ="High Passed"; 
                        
                        break;
                    case 4:
                        classification="Good";
                        break;
                    case 5:
                        classification="Very Good";
                        break;
                    case 6:
                        classification="Satisfactory";
                        break;
                    case 7:
                        classification="Very Satisfactory";
                        break;
                    case 8:
                        classification="Excellent";
                        break;
                    case 9:
                        classification="Very Excellent";
                        break;
                    case 10:
                        classification="Superior";
                        break;
                   
                        
                    default:
                    JOptionPane.showMessageDialog(null,"Invalid remark");
                }
                    switch(transmutted){
                    case 1: 
                        transmuttedGrade ="5.0"; 
                        
                        break;
                    case 2: 
                        transmuttedGrade ="3.0";
                        
                        break;
                    case 3: 
                        transmuttedGrade ="2.75";
                        
                        break;
                    case 4:
                        transmuttedGrade ="2.50";
                        break;
                    case 5:
                        transmuttedGrade ="2.25";
                        break;
                    case 6:
                        transmuttedGrade ="2.0";
                        break;
                    case 7:
                        transmuttedGrade ="1.75";
                        break;
                    case 8:
                        transmuttedGrade ="1.50";
                        break;
                    case 9:
                        transmuttedGrade ="1.25";
                        break;
                    case 10:
                        transmuttedGrade ="1.0";
                        break;
                   
                        
                    default:
                    JOptionPane.showMessageDialog(null,"Invalid remark");
}
                
                
                midTermFields.setText(String.valueOf(grade));
                remarkFields.setText(String.valueOf(remark));
                transmuttedFields.setText(String.format(transmuttedGrade));

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
