package main;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class main extends JFrame {
   private Image background=new ImageIcon(main.class.getResource("../image/bg.png")).getImage();
   
   public main() {
      setSize(600, 900);
      setResizable(false);
      setLocationRelativeTo(null);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
   
   public void paint(Graphics g) {
	      g.drawImage(background, 0, 0, null);
	   }
	   
	   public static void main(String[] args) {
	      new main();
	   }
}
