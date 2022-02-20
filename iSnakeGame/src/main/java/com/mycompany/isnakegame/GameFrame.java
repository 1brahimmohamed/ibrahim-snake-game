package com.mycompany.isnakegame;

import javax.swing.*;

public class GameFrame extends JFrame {
    public static FirstPanel firstFrame;
    public static GamePanel mainGame;
    public static MainMenuPanel mainMenu;
    public static Credits cred;
    public static LeaderBoards leaderBoards;
    ImageIcon frameIcon = new ImageIcon("D:\\My PC\\Projects\\Java\\Snake\\iSnakeGame\\src\\main\\java\\com\\mycompany\\Stokes\\frameIcon.png");

    GameFrame(){
        firstFrame = new FirstPanel();
        mainGame = new GamePanel();
        mainMenu = new MainMenuPanel();
        cred = new Credits();
        leaderBoards = new LeaderBoards();

        this.add(firstFrame);
//        this.add(new GamePanel());
        this.setTitle("iSnake");
        this.setIconImage(frameIcon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.add(mainGame);
        this.setVisible(true);
        this.add(cred);
        cred.hide();
        this.add(leaderBoards);
        leaderBoards.hide();
        
    }
    

    public static void showCredits(){
        cred.show();
        firstFrame.hide();
        mainMenu.hide();
        leaderBoards.hide();

    }
    
    public static void goBack(){
        mainMenu.show();
        leaderBoards.hide();
        cred.hide();
        firstFrame.hide();
    }
    
    public static void showLeaderBoards(){
        leaderBoards.show();
        cred.hide();
        firstFrame.hide();
        mainMenu.hide();

    }

}
