package leagueinvaders;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	int x;
	int y;
	int width;
	int height;
	Rocketship rocket;
	ArrayList<Projectile> projectile = new ArrayList<Projectile>();

	void addProjectile(Projectile p) {
		projectile.add(p);
	}

	ObjectManager(Rocketship rocket) {
		this.rocket = rocket;
	}

	void update() {
		rocket.update();

		for (Projectile p : projectile) {
			p.update();
		}
	}

	void draw(Graphics g) {
		rocket.draw(g);
		for (Projectile p : projectile) {
			p.draw(g);
		}
	}

}
