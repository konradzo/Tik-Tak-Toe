package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe extends JFrame {

    private List<JButton> buttons = new ArrayList<>();

    public TicTacToe(String title, int width) {
        super(title);
        setSize(width, width);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i = 1; i <= 9; i++) {
            JButton jButton = new JButton("");
            buttons.add(jButton);
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
}
