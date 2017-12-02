package leagueinvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	int x;
	int y;
	int width;
	int height;

	Rocketship(int x, int y, int width, int height) {
	super(x, y, width, height);
	int speed=5; 
	this.x=x;
	this.y=y;
	this.width=width;
	this.height= height;
	}

	void update() {
		
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
}
