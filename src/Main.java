import javax.swing.JFrame;

//taken from https://coderspacket.com/brick-breaker-game-using-java

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        // Gameplay game = new Gameplay();
        window.setBounds(10, 10, 800, 800);
        window.setTitle("Brick Breaker");
        window.setResizable(false);
        window.setVisible(true);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // window.add(game);
    }
}