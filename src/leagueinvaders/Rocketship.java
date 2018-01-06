package leagueinvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height, true);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	void update() {
		super.update();
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawImage(GamePanel.rocketImg,x,y,width,height,null);
	}

	public void add(ObjectManager manager) {
		// TODO Auto-generated method stub
		
	}
}
