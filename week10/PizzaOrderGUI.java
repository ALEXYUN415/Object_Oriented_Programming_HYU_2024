package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class pizzaOrderGUI extends JFrame {
    private int comboPizza;
    private int potatoPizza;
    private int bulgogiPizza;
    private int order;

    private final int comboPizzaPrice = 15000;
    private final int potatoPizzaPrice = 12000;
    private final int bulgogiPizzaPrice = 16000;

    private JButton[] pizzaButton;
    private JButton resetButton;

    private JLabel[] pizzaLabel;
    private JLabel orderLabel;
    private JLabel priceLabel;

    public pizzaOrderGUI() { // 기본 구성
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Pizza restaurant order board");

        JPanel Panel = new JPanel();

        String[] pizzas = {"Combo Pizza", "Potato Pizza", "Bulgogi Pizza"};
        JPanel topPanel = new JPanel(new GridLayout(3, 3, 70, 10));

        pizzaButton = new JButton[3];
        for (int i = 0; i < pizzaButton.length; i++) {
            pizzaButton[i] = new JButton(pizzas[i]);
            topPanel.add(pizzaButton[i]);

            // 배열의 초기화를 위해 새로운 지역변수 생성
            int parameter = i + 1;
            pizzaButton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int price = 0;
                    switch (parameter) {
                        case 1:
                            price = comboPizzaPrice;
                            break;
                        case 2:
                            price = potatoPizzaPrice;
                            break;
                        case 3:
                            price = bulgogiPizzaPrice;
                            break;
                    }
                    updateOrder(parameter, price);
                }
            });
        }

        // 가격 라벨
        topPanel.add(new JLabel("Price: " + comboPizzaPrice + " WON", JLabel.CENTER));
        topPanel.add(new JLabel("Price: " + potatoPizzaPrice + " WON", JLabel.CENTER));
        topPanel.add(new JLabel("Price: " + bulgogiPizzaPrice + " WON", JLabel.CENTER));

        // 주문 라벨
        int[] pizzaOrder = {comboPizza, potatoPizza, bulgogiPizza};
        pizzaLabel = new JLabel[3];
        for (int i = 0; i < 3; i++) {
            pizzaLabel[i] = new JLabel("Order: " + pizzaOrder[i], JLabel.CENTER);
            topPanel.add(pizzaLabel[i]);
        }

        // 빈 공간
        JPanel emptyPanel = new JPanel();
        emptyPanel.add(new JLabel(" "));

        // 총 주문과 가격
        orderLabel = new JLabel("Total Order: " + 0);
        priceLabel = new JLabel("Total Price: " + 0 + " WON");
        JPanel statusPanel = new JPanel();
        statusPanel.add(orderLabel);
        statusPanel.add(new JLabel("      "));
        statusPanel.add(priceLabel);

        // 리셋 버튼
        JPanel resetPanel = new JPanel();
        resetButton = new JButton("Resetting Orders");
        resetPanel.add(resetButton);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetOrder();
            }
        });

        Panel.setLayout(new BoxLayout(Panel, BoxLayout.Y_AXIS));
        Panel.add(topPanel);
        Panel.add(emptyPanel);
        Panel.add(statusPanel);
        Panel.add(resetPanel);
        add(Panel);
        setVisible(true);
    }

    private void updateOrder(int pizzaType, int price) { // 주문 메서드
        switch (pizzaType) {
            case 1:
                pizzaLabel[0].setText("Order: " + ++comboPizza);
                break;
            case 2:
                pizzaLabel[1].setText("Order: " + ++potatoPizza);
                break;
            case 3:
                pizzaLabel[2].setText("Order: " + ++bulgogiPizza);
                break;
        }
        order++;
        orderLabel.setText("Total Order: " + order);
        price = comboPizzaPrice * comboPizza + potatoPizzaPrice * potatoPizza + bulgogiPizzaPrice * bulgogiPizza;
        priceLabel.setText("Total Price: " + price + " WON");
    }

    private void resetOrder() { // 리셋 메서드
        comboPizza = 0;
        potatoPizza = 0;
        bulgogiPizza = 0;
        order = 0;
        int price = 0;

        pizzaLabel[0].setText("Order: " + comboPizza);
        pizzaLabel[1].setText("Order: " + potatoPizza);
        pizzaLabel[2].setText("Order: " + bulgogiPizza);
        orderLabel.setText("Total Order: " + order);
        priceLabel.setText("Total Price: " + price + " WON");
    }
}
