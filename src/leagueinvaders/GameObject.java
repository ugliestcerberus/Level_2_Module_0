package leagueinvaders;

import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive = true;

	public GameObject(int x, int y, int width, int height, boolean isAlive) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.isAlive = isAlive;
	}

	void update() {

	}

	void draw(Graphics g) {

	}

}