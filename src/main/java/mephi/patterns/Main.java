package mephi.patterns;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(700, 500);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BuyHistory history=new BuyHistory();
        JTextArea historyArea=new JTextArea();
        historyArea.setEditable(false);

        OrderPanel orderPanel=new OrderPanel(history, historyArea);

        frame.add(orderPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(historyArea), BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
