package leagueinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer = new Timer(1000 / 60, this);
	GameObject gameobject = new GameObject(65, 86, 76, 98);
	Rocketship rocketship= new Rocketship(250,70,50,50);
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font title;
	
	GamePanel(String titleOfFont, int plain, int size) {
		Font titleFont = new Font("Arial", Font.PLAIN, 48);
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		gameobject.update();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
	}

	void startGame() {
		timer.start();
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
		gameobject.draw(g);
	}

	public void keyTyped(KeyEvent e) {
		System.out.println("Hello");

	}

	public void keyPressed(KeyEvent e) {
		System.out.println("Yes");
		
		
		if (currentState > END_STATE) {
			currentState = MENU_STATE;
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == MENU_STATE) {
				currentState = GAME_STATE;
			} else if (currentState == GAME_STATE) {
				currentState = END_STATE;
			} else if (currentState == END_STATE) {
				currentState = MENU_STATE;
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
		rocketship.y+=13;	
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
		rocketship.x-=13;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
		rocketship.y-=13;	
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
		rocketship.x+=13;	
		}
	}
		

	public void keyReleased(KeyEvent e) {
		System.out.println("destitute");

	}

	void updateMenuState() {

	}

	void updateGameState() {
		rocketship.update();
	}

	void updateEndState() {
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.CYAN);
		g.drawString("Text", 100, 100);

	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0,0,LeagueInvaders.width, LeagueInvaders.height);
		rocketship.draw(g);
		
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
	}
}
