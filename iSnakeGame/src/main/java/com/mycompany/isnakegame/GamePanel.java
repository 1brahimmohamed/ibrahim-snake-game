package com.mycompany.isnakegame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{
    int highscore = 55;
    static final int screenWidth = 650;
    static final int screenHight = 650;
    static final int unitSize = 25;
    static final int gameUnits = (screenWidth * screenHight)/(unitSize * unitSize);
    static final int delayTime = 75;
    final int x[] = new int[gameUnits];
    final int y[] = new int[gameUnits];
    int bodyParts = 6;
    int thingsEaten;
    int thingsX;
    int thingsY;
    char direction = 'R';
    boolean gameRunning = false;
    Timer timer;
    Random random;
    JLabel mainBackgroundImageLabel;
    ImageIcon mainBackgroundImage = new ImageIcon("iSnakeGame\\src\\main\\java\\com\\mycompany\\Stokes\\mainPanelBackground.png");
    ImageIcon mainRLogo = new ImageIcon("iSnakeGame\\src\\main\\java\\com\\mycompany\\Stokes\\mainPanelLogo.png");
    ImageIcon GameOverImageBack = new ImageIcon("iSnakeGame\\src\\main\\java\\com\\mycompany\\Stokes\\GameOverBack.png");


    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(screenWidth, screenHight));
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    public void startGame() {
        newThing();
        gameRunning = true;
        timer = new Timer(delayTime,this);
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g) {

        if(gameRunning) {
            g.drawImage(mainBackgroundImage.getImage(),0,0,null);
            g.drawImage(mainRLogo.getImage(),550,29,null);
            g.setColor(Color.BLACK);
            g.fillOval(thingsX, thingsY, unitSize, unitSize);

            for(int i = 0; i< bodyParts;i++) {
                if(i == 0) {
                    g.setColor(new Color(0x9b8034));
                    g.fillRect(x[i], y[i], unitSize, unitSize);
                }
                else {
                    g.setColor(new Color(0xffd255));
                    g.fillRect(x[i], y[i], unitSize, unitSize);
                }
            }
            g.setColor(Color.WHITE);
            g.setFont( new Font("New Sans",Font.BOLD, 27));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: "+ thingsEaten, 35, 45);
            g.drawString("Highscore: " + highscore, 35, 75);
        }
        else {
            gameOver(g);
        }

    }
    public void newThing(){
        thingsX = random.nextInt((int)(screenWidth / unitSize))* unitSize;
        thingsY = random.nextInt((int)(screenHight / unitSize))* unitSize;
    }
    public void move(){
        for(int i = bodyParts;i>0;i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        switch(direction) {
            case 'U':
                y[0] = y[0] - unitSize;
                break;
            case 'D':
                y[0] = y[0] + unitSize;
                break;
            case 'L':
                x[0] = x[0] - unitSize;
                break;
            case 'R':
                x[0] = x[0] + unitSize;
                break;
        }

    }
    public void checkEaten() {
        if((x[0] == thingsX) && (y[0] == thingsY)) {
            bodyParts++;
            thingsEaten++;
            newThing();
        }
    }
    public void checkCollisions() {
        //checks if head collides with body
        for(int i = bodyParts;i>0;i--) {
            if((x[0] == x[i])&& (y[0] == y[i])) {
                gameRunning = false;
            }
        }
        //check if head touches left border
        if(x[0] < 0) {
            gameRunning = false;
        }
        //check if head touches right border
        if(x[0] > screenWidth) {
            gameRunning = false;
        }
        //check if head touches top border
        if(y[0] < 0) {
            gameRunning = false;
        }
        //check if head touches bottom border
        if(y[0] > screenHight) {
            gameRunning = false;
        }

        if(!gameRunning) {
            timer.stop();
        }
    }
    public void gameOver(Graphics g) {
        //Score
        g.drawImage(GameOverImageBack.getImage(),0,0,null);
        g.setColor(new Color(0xFFFFFF));
        g.setFont( new Font("Poppins",Font.BOLD, 30));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Your Score: "+ thingsEaten, 226, 320);

        //Game Over text
        g.setColor(new Color(0xffd255));
        g.setFont( new Font("Poppins",Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", 97, 260);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(gameRunning) {
            move();
            checkEaten();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if(direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}

