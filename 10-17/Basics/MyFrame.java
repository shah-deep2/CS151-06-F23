import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setSize(700, 700);
        this.setTitle("CS 151");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setResizable(false);
        this.getContentPane().setBackground(Color.CYAN);  //.setBackground(new Color(0, 255, 255));
        this.setLayout(null);

        JLabel label = new JLabel();
        label.setText("CS 151");

        label.setOpaque(true);  
        
        // label.setBackground(Color.RED);
        // label.setBounds(0, 0, 170, 170);

        ImageIcon image = new ImageIcon("assets\\CSLogo.jpg");

        // label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        // this.add(label);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(120, 170, 250));
        panel.setBounds(0, 0, 200, 200);
        this.add(panel);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(170, 120, 250));
        panel2.setBounds(200, 0, 200, 200);
        this.add(panel2);
        panel2.add(label);
        
        // this.pack();
        this.setVisible(true);

    }
}
