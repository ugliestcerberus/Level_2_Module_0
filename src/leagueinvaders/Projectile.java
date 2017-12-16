package leagueinvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	int speed = 10;
	int x;
	int y;
	int width;
	int height;

	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height, true);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	void update() {
		y = y - speed;
		if (y < 0) {
			isAlive = false;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);
	}
}
