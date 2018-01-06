package leagueinvaders;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	int x;
	int y;
	int width;
	int height;
	int score = 0;
	long enemyTimer = System.currentTimeMillis();
	int enemySpawnTime = 1000;
	Rocketship rocket;
	ArrayList<Projectile> projectile = new ArrayList<Projectile>();
	ArrayList<Aliens> alien = new ArrayList<Aliens>();

	void addProjectile(Projectile p) {
		projectile.add(p);
	}

	void addAlien(Aliens a) {
		alien.add(a);
	}

	ObjectManager(Rocketship rocket) {
		this.rocket = rocket;
	}

	void update() {
		rocket.update();

		for (Projectile p : projectile) {
			p.update();
		}
		for (Aliens a : alien) {
			a.update();
		}
	}

	void draw(Graphics g) {
		rocket.draw(g);
		for (Projectile p : projectile) {
			p.draw(g);
		}
		for (Aliens a : alien) {
			a.draw(g);
		}
	}

	int getScore() {
		return score;
	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Aliens(new Random().nextInt(LeagueInvaders.width), 0, 50, 50, true));
			enemyTimer = System.currentTimeMillis();
		}
	}

	void purgeObjects() {
		for (int i = 0; i < alien.size(); i++) {
			if (alien.get(i).isAlive == false) {
				alien.remove(i);
			}
		}
		for (int i = 0; i < projectile.size(); i++)
			if (projectile.get(i).isAlive == false) {
				projectile.remove(i);
			}
	}

	void checkCollision() {
		for (Aliens a : alien) {
			if (rocket.collisionbox.intersects(a.collisionbox)) {
				rocket.isAlive = false;
			}

			for (Projectile p : projectile) {
				if (a.collisionbox.intersects(p.collisionbox)) {
					a.isAlive = false;
					p.isAlive = false;
					score++;
				}
			}
		}
	}

	public void reset() {
		// TODO Auto-generated method stub

	}

	

}
