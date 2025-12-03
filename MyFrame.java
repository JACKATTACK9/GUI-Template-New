import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;

public class MyFrame extends JFrame {

    MyFrame() {
        // Window
        this.setSize(450, 450);
        this.setTitle("woof");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new FlowLayout()); 

        ImageIcon image = new ImageIcon("Soggy_Cat.jpeg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.MAGENTA);
        // we didnt do this but this is how you do fonts.
        JLabel myLabel = new JLabel("hi hello");
        myLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        this.add(myLabel);

        // Button
        JButton dangerButton = new JButton("DONT CLICK ME");
        dangerButton.setFocusable(false);
        dangerButton.setBackground(Color.RED);
        dangerButton.setForeground(Color.WHITE);

        // Popups
        dangerButton.addActionListener(e -> {
            while (true) {
            
            for(int i = 0; i < 20; i++) {
                JOptionPane.showMessageDialog(null, "VIRUS DETECTED, COMPUTER DELETION IN PROGRESS ", "INFINITE LOOP", JOptionPane.ERROR_MESSAGE);

                                              this.add(dangerButton);

                                              this.setvisible(true);
            }
        });

        
    }
}
