package intro_to_array_lists;

public class GamePanel {

}
//1. Create a new class called GamePanel. This class will draw our game onto our window.
//2. Add extends JPanel to the end of your class declaration (see below).
        public class GamePanel extends JPanel{  }
//This turns your GamePanel class into a JPanel. However, by creating our own class instead of using the JPanel class, we can customize the JPanel code to better suit our game.
//3. Add a member variable of a Timer object. This is a new class that we haven't used yet. When importing the Timer code, make sure you import the package that reads javax.swing.Timer. This timer will control the frame rate (or speed) of our game.
//4. The timer is going to use the ActionListener interface to make stuff happen when it expires. Make your class implement the ActionListener interface.
//public class GamePanel extends JPanel implements ActionListener
{  }
//Add the unimplemented method. You should now have an ActionPerformed method in your class.
//5. Inside the ActionPerformed method, add a line of code to print a message to the console.
6.  In your constructor, initialize the timer object. The constructor of the timer object takes two parameters. The first parameter is an int for how fast your want the timer to repeat. This is in milliseconds so 1000 is equal to 1 second. We want our game to run at 60 frames per second. So in the first parameter, put 1000 / 60. The second parameter takes a reference to an ActionListener. Since we implemented it in our class, we can put this.
7. Create a void method called startGame.
8. In the startGame method use your timer object to call the start method.
        timer.start();
9. Go back to your LeagueInvaders class.
10. Create an object of the GamePanel class in your field variables. Initialize it in your constructor.
11. At the top of your setup method, add the GamePanel to your JFrame
12. Add these lines of code to resize your window and game panel:
window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        window.pack();
Make sure to use YOUR variables names. You will also need to import the Dimension class.
        
13. At the bottom of your setup method, use your GamePanel object to call the startGame method.
14. Run your program. Does your message show up repeatedly in the console?
