package leagueinvaders;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class GamePanel  extends JPanel implements ActionListener, KeyListener {
Timer timer= new Timer(1000/60,this);
 
GamePanel(){
	
}
public void actionPerformed(ActionEvent e) {
repaint();
	
}
void startGame() {
	timer.start();
}
@Override
public void paintComponent(Graphics g){
	g.fillRect(10, 10, 100, 100);           
        }
@Override
public void keyTyped(KeyEvent e) {
System.out.println("Hello");
	
}
@Override
public void keyPressed(KeyEvent e) {
System.out.println("Yes");
	
}
@Override
public void keyReleased(KeyEvent e) {
System.out.println("destitute");
	
}
}
