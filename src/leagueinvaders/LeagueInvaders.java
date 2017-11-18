package leagueinvaders;
import java.awt.Container;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class LeagueInvaders{
JFrame frame;
JPanel has;
static int height= 800;
static int width=500;
GamePanel gamepanel;
public static void main(String[]args) {
LeagueInvaders leagueinvaders= new LeagueInvaders();	
}
LeagueInvaders(){
frame= new JFrame();
gamepanel= new GamePanel();
frame.setVisible(true);
frame.setSize(500, 800);
setup();
}
void setup(){
	frame.add(gamepanel);
	frame.addKeyListener(gamepanel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gamepanel.startGame();
}
}