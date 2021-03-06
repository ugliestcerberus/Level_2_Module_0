package leagueinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer = new Timer(1000 / 60, this);
	GameObject gameobject = new GameObject(65, 86, 76, 98, true);
	Rocketship rocketship = new Rocketship(250, 70, 50, 50);
	ObjectManager manager = new ObjectManager(rocketship);
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font title;
	public static BufferedImage alienImg;
    public static BufferedImage rocketImg;
    public static BufferedImage bulletImg;
    



	GamePanel(String titleOfFont, int plain, int size) {
		Font titleFont = new Font("Arial", Font.PLAIN, 48);
		try {
        alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
        rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
        bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
} catch (IOException e) {
        e.printStackTrace();

}
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
		System.out.println();

		if (currentState > MENU_STATE) {
			// currentState = END_STATE;
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
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocketship.y += 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocketship.x -= 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocketship.y -= 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocketship.x += 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			manager.addProjectile(new Projectile(rocketship.x, rocketship.y, 50, 50));
		}
	}

	void updateMenuState() {

	}

	void updateGameState() {
		// invader.update();
		manager.update();
		manager.manageEnemies();
		manager.purgeObjects();
		manager.checkCollision();
		System.out.println(manager.getScore());
		if (rocketship.isAlive == false) {
			currentState = END_STATE;
			manager.reset();
			rocketship= new Rocketship(GAME_STATE, GAME_STATE, GAME_STATE, GAME_STATE);
			rocketship.add(manager);
		}
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
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		manager.draw(g);

	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("Your score was " + manager.getScore(), 100, 100);
	}

	public void keyReleased(KeyEvent e) {
		

	}
}
