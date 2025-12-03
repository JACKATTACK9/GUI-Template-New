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
            
            // remember when we learnt loops? try to edit this piece of code to make however many popups you want!
            for(int i = 0; i < 20; i++) {
                JOptionPane.showMessageDialog(null, "YOU CANNOT ESCAPE! MUHAHAHAHHAH!!!!!", "ALERT!!!!!", JOptionPane.WARNING_MESSAGE);
            }
        });

        // how can i make this loop forever till the computer crashes????

        // change the above code to:

        // dangerButton.addActionListener(e -> {
        //     while (true) {
        //         JOptionPane.showMessageDialog(null, "YOU CANNOT ESCAPE!", "INFINITE LOOP", JOptionPane.ERROR_MESSAGE);
        //     }
        // });

        // a bit of a warning here... i dont know if this will work well... especially if you're on a chromebook... 
            
        this.add(dangerButton);

        this.setVisible(true);
    }
}
