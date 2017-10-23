/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fakingbank.swing;

import com.fakingbank.entity.Transaction;
import com.fakingbank.model.AccountModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lan
 */
public class History {
    
    private JFrame frame;
    private JPanel panel;
    private JTable table;
    private DefaultTableModel tableModel;
    private JScrollPane scrollPane;
private  JButton exit;
    
    private ArrayList<Transaction> list;
    AccountModel model = new AccountModel();
    
    public History(String number) {
        
        frame = new JFrame("History");
        table = new JTable();
        tableModel = new DefaultTableModel();
        
   exit = new JButton("Exit");
        
        frame.setLayout(null);
        frame.setSize(1000, 700);
        
        panel = new JPanel();
        panel.setBounds(0, 0, 1000, 700);
        panel = new ImagePanel(new ImageIcon("C:\\Users\\Lan\\Desktop\\fakingbank\\img\\qqqqqqq.png").getImage());
 
        
        tableModel.addColumn("Id");
        tableModel.addColumn("Type");
        tableModel.addColumn("Number");
        tableModel.addColumn("Number");
        tableModel.addColumn("Amount");
        tableModel.addColumn("Message");
        tableModel.addColumn("Status");
        
        list = model.getListTransaction(number, number);
        for (Transaction transaction : list) {
            Object[] str = new Object[]{transaction.getId(), transaction.getType(), transaction.getSenderAccountNumber(), transaction.getReceiverAccountNumber(), transaction.getAmount(), transaction.getMessage(), transaction.getStatus()};
            tableModel.addRow(str);
        }
        scrollPane = new JScrollPane(table);
        
        table.setRowHeight(40);
        scrollPane.setBounds(0, 35, 1000, 480);
        
        exit.setBounds(800, 530, 80, 30);
        exit.setForeground(Color.decode("#7CB342"));
        exit.setBackground(Color.white);
        
        exit.addActionListener(new Exit());
        
        
      //  table.getColumnModel().getColumn(3).setPreferredWidth(100);
      // table.getColumnModel().getColumn(4).setPreferredWidth(100);
        panel.add(exit);
        table.setModel(tableModel);
       

        panel.add(scrollPane);
        frame.add(panel);
        panel.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    class Exit implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
         System.exit(0);
        }
    }
 
}
