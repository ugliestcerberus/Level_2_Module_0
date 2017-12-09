package leagueinvaders;

import java.awt.Graphics;

public class ObjectManager {
	int x;
	int y;
	int width;
	int height;
	Rocketship rocket;

	ObjectManager(Rocketship rocket) {
		this.rocket = rocket;
	}

	void update() {
		rocket.update();
	}

	void draw(Graphics g) {
		rocket.draw(g);
	}

}
