import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame2 extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    MyFrame2() {
        this.setSize(500, 500);
        this.setTitle("CS 151");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        this.add(textField);

        button = new JButton("Click Me!");
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        

        this.add(button);
        
        this.setVisible(true);
        
    }

    public static void main(String[] args) {
        new MyFrame2();
    }

    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == button){
        // System.out.println("Hi");
        String txt = textField.getText();

        if(txt.equals("A")){
            textField.setEditable(false);
            button.setEnabled(false);
            System.out.println("Hi");
        } else {
            this.dispose();
        }

       }
    }
}
