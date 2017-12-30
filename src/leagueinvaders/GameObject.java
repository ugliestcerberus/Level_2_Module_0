package leagueinvaders;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive = true;
	public Rectangle collisionbox = new Rectangle(x, y, width, height);

	public GameObject(int x, int y, int width, int height, boolean isAlive) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.isAlive = isAlive;
	}

	void update() {
		collisionbox.setBounds(x, y, width, height);
	}

	void draw(Graphics g) {

	}

}