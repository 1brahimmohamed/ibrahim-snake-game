/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isnakegame;

import java.awt.*;

/**
 *
 * @author Ibrahim
 */
public class Credits extends javax.swing.JPanel {

    /**
     * Creates new form Credits
     */
    public Credits() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goBackText = new javax.swing.JLabel();
        underLogo = new javax.swing.JLabel();
        goBackBtn = new javax.swing.JLabel();
        names = new javax.swing.JLabel();
        imiStd = new javax.swing.JLabel();
        made = new javax.swing.JLabel();
        Develped = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBackText.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        goBackText.setForeground(new java.awt.Color(255, 255, 255));
        goBackText.setText("GO BACK");
        add(goBackText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, 50));

        underLogo.setIcon(new javax.swing.ImageIcon("D:\\My PC\\Projects\\Java\\Snake\\iSnakeGame\\src\\main\\java\\com\\mycompany\\Stokes\\underwinlogo.png")); // NOI18N
        add(underLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 610, 40, 30));

        goBackBtn.setIcon(new javax.swing.ImageIcon("D:\\My PC\\Projects\\Java\\Snake\\iSnakeGame\\src\\main\\java\\com\\mycompany\\Stokes\\btn.png")); // NOI18N
        goBackBtn.setText("jLabel1");
        goBackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                goBackBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                goBackBtnMouseExited(evt);
            }
        });
        add(goBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 260, 50));

        names.setFont(new java.awt.Font("Poppins", 1, 22)); // NOI18N
        names.setForeground(new java.awt.Color(255, 210, 85));
        names.setText("<html>\nGame Developer :  Ibrahim Mohamed <br>\nGame Design:  Ibrahim Mohamed <br>\nSpecial Thanks to StackOverFlow</html>");
        add(names, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 440, 130));

        imiStd.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        imiStd.setForeground(new java.awt.Color(255, 255, 255));
        imiStd.setText("By IMI studios");
        add(imiStd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 170, 60));

        made.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        made.setForeground(new java.awt.Color(255, 255, 255));
        made.setText("& MADE IN EGYPT");
        add(made, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 420, 60));

        Develped.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        Develped.setForeground(new java.awt.Color(255, 255, 255));
        Develped.setText("DEVELOPED");
        add(Develped, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 280, 60));

        title.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 210, 85));
        title.setText("C  R  E  D  I  T  S");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 80, 330, 50));

        Background.setIcon(new javax.swing.ImageIcon("D:\\My PC\\Projects\\Java\\Snake\\iSnakeGame\\src\\main\\java\\com\\mycompany\\Stokes\\creditsBackground.png")); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 650));
    }// </editor-fold>//GEN-END:initComponents

    /*
    
    Button hover
    
    */
    
    private void goBackBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackBtnMouseEntered
        goBackText.setForeground(Color.BLACK);
    }//GEN-LAST:event_goBackBtnMouseEntered

    private void goBackBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackBtnMouseExited
        goBackText.setForeground(Color.WHITE);
    }//GEN-LAST:event_goBackBtnMouseExited

    
    /*
    
    Button Action
    
    */
    private void goBackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackBtnMouseClicked
        GameFrame.goBack();
    }//GEN-LAST:event_goBackBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Develped;
    private javax.swing.JLabel goBackBtn;
    private javax.swing.JLabel goBackText;
    private javax.swing.JLabel imiStd;
    private javax.swing.JLabel made;
    private javax.swing.JLabel names;
    private javax.swing.JLabel title;
    private javax.swing.JLabel underLogo;
    // End of variables declaration//GEN-END:variables
}