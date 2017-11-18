package leagueinvaders;

import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;

	GameObject(int x, int y, int width, int height) {
		final int MENU_STATE = 0;
		final int GAME_STATE = 1;
		final int END_STATE = 2;
		int currentState;
		
	}

	void update() {
		y++;
	}

	void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
	}
	
}
