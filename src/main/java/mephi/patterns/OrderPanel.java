package mephi.patterns;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class OrderPanel extends JPanel{
    private JCheckBox[] boxes=new JCheckBox[4];
    private BuyHistory history;
    private JTextArea historyArea;

    public OrderPanel(BuyHistory history, JTextArea historyArea) {
        this.history=history;
        this.historyArea=historyArea;
        setLayout(new BorderLayout());

        JPanel allPanel=new JPanel(new GridLayout(4, 1));
        boxes[0] = new JCheckBox("Огненный соус -10 септимов");
        boxes[1] = new JCheckBox("Двойная порция оленины -20 септимов");
        boxes[2] = new JCheckBox("Снежные ягоды -5 септимов");
        boxes[3] = new JCheckBox("Нордская лепёшка -7 септимов");

        for (JCheckBox box : boxes){
            allPanel.add(box);
        }

        JButton orderButton=new JButton("Оформить заказ");
        orderButton.addActionListener(new OrderListener());

        add(allPanel, BorderLayout.NORTH);
        add(orderButton, BorderLayout.CENTER);
    }

    private void makeOrder(){
        int count = 0;
        for (JCheckBox box : boxes){
            if (box.isSelected()){
                count++;
            }
        }

        if (count > 3){
            JOptionPane.showMessageDialog(this, "Нельзя выбрать более 3 добавок");
            return;
        }

        Eat order = new Ragu();
        if (boxes[0].isSelected()){
            order=new FireSouse(order);
        }
        if (boxes[1].isSelected()){
            order=new DoubleOlenina(order);
        }
        if (boxes[2].isSelected()){
            order=new Berries(order);
        }
        if (boxes[3].isSelected()){
            order=new NordBread(order);
        }

        String time=LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String record=time + " " + order.getDesc() + "    ИТОГО:" + order.getPrice() + " спитимов\n";
        history.add(record);
        historyArea.setText(history.getText());

        for (JCheckBox box : boxes){
            box.setSelected(false);
        }
    }

    private class OrderListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            makeOrder();
        }
    }
}