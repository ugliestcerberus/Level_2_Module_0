package intro_to_array_lists;
import java.awt.Window;

import javax.swing.JFrame;
//1. Create a new class called LeagueInvaders. This will be the class that controls the entire program using the classes that you will later create. This is sometimes called a RUNNER class.
//2. Add a main method to this class. THIS SHOULD BE THE ONLY MAIN METHOD IN YOUR PROGRAM!
//3. First we need a window to display our game. Create member variable in your class for a JFrame.
//4. We need to keep track of the size of our window. Create two final int variables for the width and the height of your game. Set the width to 500 and the height to 800.
//5. In your constructor, initialize the JFrame.
//6. Create a void method called setup().
//7. In the setup method, add the code necessary to make your game window show up. Do not forget to use setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//8. Create a LeagueInvaders object in your main method and use your object to call the setup method. Does your window show up?
public class LeagueInvaders{
JFrame jask;
int height= 800;
int width=500;	
public static void main(String[]args) {
LeagueInvaders leagueinvaders= new LeagueInvaders();	
}
LeagueInvaders(){
JFrame jask= new JFrame();
jask.setVisible(true);
jask.setSize(500, 800);
}
void setup(){
	jask.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}