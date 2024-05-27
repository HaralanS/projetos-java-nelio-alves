import com.sun.jdi.BooleanType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame {

    Image image;
    Graphics graphics;
    Box player;
    Box enemy;
    Boolean gameOver;
    MyFrame() {
        player = new Box(100, 300, 50, 50, Color.blue);
        enemy = new Box(400, 300, 50, 50, Color.red);
        gameOver = false;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setVisible(true);
        this.addKeyListener(new AL());
    }

    public void paint(Graphics g) {
        image = createImage(this.getWidth(), this.getHeight());
        graphics = image.getGraphics();
        g.drawImage(image, 0, 0, this);

        player.draw(g);
        enemy.draw(g);

        if (gameOver) {
            g.setColor(Color.red);
            g.setFont(new Font("MV Boli", Font.PLAIN, 45));
            g.drawString("GAME OVER", 150, 100);
        }
    }
    public void checkCollision() {
        if (player.intersects(enemy)) {
            gameOver = true;
            System.out.println("Game Over Bro");
        }
    }
    public class AL extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
            checkCollision();
            repaint();
        }
    }
}
