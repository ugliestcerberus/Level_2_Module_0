package leagueinvaders;

import javax.swing.Timer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer = new Timer(1000 / 60, this);
	GameObject gameobject= new GameObject(65,86,76,98);
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE= 2;
	int currentState = MENU_STATE;

	GamePanel() {

	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		gameobject.update();
		if(currentState==MENU_STATE) {
			updateMenuState();
		}
		else if(currentState==GAME_STATE) {
			updateGameState();
		}
		else if(currentState==END_STATE) {
			updateEndState();
		}

	}

	void startGame() {
		timer.start();
	}

	public void paintComponent(Graphics g) {
		gameobject.draw(g);
	}

	public void keyTyped(KeyEvent e) {
		System.out.println("Hello");

	}

	public void keyPressed(KeyEvent e) {
		System.out.println("Yes");
		gameobject.x++;
		if(currentState > END_STATE){
            currentState = MENU_STATE;
		}
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
		if(currentState==MENU_STATE) {
			currentState=GAME_STATE;
		}
		else if(currentState==GAME_STATE) {
			currentState=END_STATE;
		}
		else if(currentState==END_STATE) {
			currentState=MENU_STATE;
		}
		}
		
	}

	public void keyReleased(KeyEvent e) {
		System.out.println("destitute");

	}
	void updateMenuState() {
		
	}
	void updateGameState() {
		
	}
	void updateEndState() {
		
	}
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    	
	}
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
	}
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0,0, LeagueInvaders.width, LeagueInvaders.height);
	}
}
