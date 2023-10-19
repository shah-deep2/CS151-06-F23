import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLDemo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        frame.setLayout(new BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.red);
        panel1.setPreferredSize(new Dimension(100, 100));
        frame.add(panel1, BorderLayout.NORTH);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.green);
        panel2.setPreferredSize(new Dimension(100, 100));
        frame.add(panel2, BorderLayout.WEST);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.yellow);
        panel3.setPreferredSize(new Dimension(100, 100));
        frame.add(panel3, BorderLayout.EAST);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.magenta);
        panel4.setPreferredSize(new Dimension(100, 100));
        frame.add(panel4, BorderLayout.SOUTH);

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.blue);
        panel5.setPreferredSize(new Dimension(100, 100));
        frame.add(panel5, BorderLayout.CENTER);


    }
}
