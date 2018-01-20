package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe extends JFrame implements ActionListener {

    private List<JButton> buttons = new ArrayList<>();
    private int counter;

    public TicTacToe(String title, int width) {
        super(title);
        setSize(width, width);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        counter = 0;
        for (int i = 1; i <= 9; i++) {
            JButton jButton = new JButton("");
            buttons.add(jButton);
            jButton.addActionListener(this);
            add(jButton);
        }
        setLayout(new GridLayout(3, 3));
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicTacToe("Tic Tac Toe", 500);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (counter % 2 == 0) {
            clickedButton.setText("X");
            clickedButton.setBackground(Color.green);
        } else {
            clickedButton.setText("O");
            clickedButton.setBackground(Color.blue);
        }
        counter++;
        clickedButton.setEnabled(false);
    }

}

