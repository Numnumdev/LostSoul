package JavaCode;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class gamePanel extends JPanel implements Runnable{
    //SCREEN SETTINGS
    final int originalTileSize = 64; //64x64 tile
    final int scale = 1; //scale if needed

    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 1024 pixels
    final int screenHeight = tileSize * maxScreenRow; // 768 pixels

    Thread gameThread;

    public gamePanel() {
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void startGameThread(){

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        
    }
}