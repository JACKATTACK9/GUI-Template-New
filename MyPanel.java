import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class MyPanel {
  MyPanel() { // All of your code today goes below this line!
    ImageIcon image = new ImageIcon("Soggy_Cat.jpeg");
    Border border = BorderFactory.createLineBorder(Color.pink, 5); // this makes a border around the label
    JLabel label = new JLabel();
    label.setIcon(image);
    label.setText("meeeeeeeerrrrrroooooooowwwwwwwww");
    label.setBorder(border); // apply the border to the label
    label.setHorizontalTextPosition(JLabel.CENTER); // this puts the text in the center of the label
    label.setVerticalTextPosition(JLabel.TOP); // this puts the text on top of the label
    label.setForeground(Color.pink); // this changes the color of the text
    

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.add(label);
    frame.pack(); // this makes the frame the size of the label
    //Always remember to set the frame to visible at the end of your code!  


// You should have not code below this line!
   }
}