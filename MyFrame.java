import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame{

//MyFrame is the subclass or child class; JFrame is the parent class or super class

MyFrame(){
// Your code here.
// Jframe is a gui window to add compontents to.
this.setSize(450,450); // x,y window size
this.setTitle("woof"); // this sets the title
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false); // Frame size is locked.
this.setVisible(true);
ImageIcon image = new ImageIcon("Soggy_Cat.jpeg");
this.setIconImage(image.getImage());
this.getContentPane().setBackground(Color.MAGENTA);
JLabel myLabel = new JLabel("hi hello");
this.add(myLabel);
this.
	
}
	}
