import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.Action;
import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    private boolean play = false;
    private int score = 0;
    // originally 21 
    private int totalBricks = 14;
    private Timer time;
    private int delay = 5;
    //play position likely, need to adjust because I changed size of game window
    private int player1 = 310;
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXDir = -1;
    private int ballYDir = -2;

    private BrickMap map;

    

}
