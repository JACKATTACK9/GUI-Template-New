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
    ImageIcon image = new ImageIcon("Soggy_cat.jpeg");
    Border border = BorderFactory.createLineBorder(Color.pink, 5); // this makes a border around the label
    JLabel label = new JLabel();
    label.setIcon(image);
    label.setText("meeeeeeeerrrrrroooooooowwwwwwwww");

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





// You should have not code below this line!
   }
}