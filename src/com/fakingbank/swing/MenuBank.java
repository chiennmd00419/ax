/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fakingbank.swing;

import com.fakingbank.entity.Account;
import com.fakingbank.image.ImageLabel;
import com.fakingbank.model.AccountModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lan
 */
public class MenuBank {

    private JFrame frame;
    private JPanel panel;

    private JLabel btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, lblNumber, lblNumber1;

    AccountModel ac = new AccountModel();
    private String strIdentifyCard;
    private String strAccount;
    private String strNumber;

    public MenuBank(String account) {
        Account acc = ac.getAccount(account);
        strIdentifyCard = acc.getUserIdentifyCard();
        strAccount = acc.getAccount();
        strNumber = acc.getNumber();

        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(622, 900);
        frame.setLocationRelativeTo(null);

        panel.setBounds(0, 0, 622, 900);
        panel = new ImagePanel(new ImageIcon("C:\\Users\\Lan\\Desktop\\fakingbank\\img\\panel11.png").getImage());

        btn1 = new JLabel();
        btn2 = new JLabel();
        btn3 = new JLabel();
        btn4 = new JLabel();
        btn5 = new JLabel();
        btn6 = new JLabel();
        btn7 = new JLabel();
        btn8 = new JLabel();

        lblNumber = new JLabel("Bank number:");
        lblNumber.setBounds(15, 15, 100, 30);
        lblNumber.setFont(new Font("Arial", 2, 15));
        lblNumber.setForeground(Color.white);

        lblNumber1 = new JLabel(acc.getNumber());
        lblNumber1.setBounds(115, 15, 300, 30);
        lblNumber1.setForeground(Color.white);

        btn1 = new ImageLabel(new ImageIcon("C:\\Users\\Lan\\Desktop\\fakingbank\\img\\btn1.png").getImage());
        btn2 = new ImageLabel(new ImageIcon("C:\\Users\\Lan\\Desktop\\fakingbank\\img\\btn2.png").getImage());
        btn3 = new ImageLabel(new ImageIcon("C:\\Users\\Lan\\Desktop\\fakingbank\\img\\btn3.png").getImage());
        btn4 = new ImageLabel(new ImageIcon("C:\\Users\\Lan\\Desktop\\fakingbank\\img\\btn4.png").getImage());
        btn5 = new ImageLabel(new ImageIcon("C:\\Users\\Lan\\Desktop\\fakingbank\\img\\btn5.png").getImage());
        btn6 = new ImageLabel(new ImageIcon("C:\\Users\\Lan\\Desktop\\fakingbank\\img\\btn6.png").getImage());
        btn7 = new ImageLabel(new ImageIcon("C:\\Users\\Lan\\Desktop\\fakingbank\\img\\btn7.png").getImage());
        btn8 = new ImageLabel(new ImageIcon("C:\\Users\\Lan\\Desktop\\fakingbank\\img\\btn8.png").getImage());

        btn1.setBounds(0, 600, 160, 50);
        btn2.setBounds(0, 660, 160, 50);
        btn3.setBounds(0, 720, 160, 50);
        btn4.setBounds(0, 780, 160, 50);
        btn5.setBounds(448, 600, 160, 50);
        btn6.setBounds(448, 660, 160, 50);
        btn7.setBounds(448, 720, 160, 50);
        btn8.setBounds(448, 782, 160, 50);

        btn1.addMouseListener(new Bt1());
        btn2.addMouseListener(new Bt2());
        btn3.addMouseListener(new Bt3());
        btn4.addMouseListener(new Bt4());
        btn5.addMouseListener(new Bt5());
        btn6.addMouseListener(new Bt6());
        btn7.addMouseListener(new Bt7());
        btn8.addMouseListener(new Bt8());

        panel.add(lblNumber);
        panel.add(lblNumber1);

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);

        frame.add(panel);
        panel.setLayout(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class Bt1 implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            Deposit nn = new Deposit(strAccount);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            btn1.setBounds(5, 600, 160, 50);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btn1.setBounds(0, 600, 160, 50);
        }
    }

    class Bt2 implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            Withdraw bb = new Withdraw(strAccount);

        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            btn2.setBounds(5, 660, 160, 50);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btn2.setBounds(0, 660, 160, 50);
        }
    }

    class Bt3 implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            Transfer cc = new Transfer(strAccount);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            btn3.setBounds(5, 720, 160, 50);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btn3.setBounds(0, 720, 160, 50);
        }
    }

    class Bt4 implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            History history = new History(strNumber);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            btn4.setBounds(5, 780, 160, 50);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btn4.setBounds(0, 780, 160, 50);
        }
    }

    class Bt5 implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            Information information = new Information(strIdentifyCard);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            btn5.setBounds(443, 600, 160, 50);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btn5.setBounds(448, 600, 160, 50);
        }
    }

    class Bt6 implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            Password password = new Password(strAccount);

        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            btn6.setBounds(443, 660, 160, 50);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btn6.setBounds(448, 660, 160, 50);
        }
    }

    class Bt7 implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            CreateAccount createAccount = new CreateAccount();
            frame.setVisible(false);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            btn7.setBounds(443, 720, 160, 50);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btn7.setBounds(448, 720, 160, 50);
        }
    }

    class Bt8 implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
           System.exit(0);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            btn8.setBounds(443, 782, 160, 50);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btn8.setBounds(448, 782, 160, 50);
        }
    }

}
