/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp6;

/**
 *
 * @author students
 */
    import javax.swing.*;
    import java.awt.event.*;
    import java.awt.event.ActionListener;
public class Mp6 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("MachineProblem#6");
        JMenuBar menuBar= new JMenuBar();
        
        JMenu operating= new JMenu("Operating");
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
        frame.setSize(500,500);
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
        
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"additionFields");
        }
    
    
});
        subtractionFields.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"subtractionFields");
        }
    
    
});
        multiplicationFields.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"multiplicationFields");
        }
    
    
});
        divisionFields.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"divisionFields");
        }
    
    
});
        ExitFields.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"ExitFields");
        }
    
    
});
                }
}


