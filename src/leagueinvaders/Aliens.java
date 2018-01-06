package leagueinvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Aliens extends GameObject {

	Aliens(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);

	}

	void update() {
		super.update();
		y += 10;
	}

	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawImage(GamePanel.alienImg,x,y,width,height,null);
	}

}
