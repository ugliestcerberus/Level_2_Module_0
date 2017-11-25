package leagueinvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	Rocketship rocketship = new Rocketship(45, 45, 50, 50);

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	void update() {

	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
}
