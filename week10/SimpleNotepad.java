package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleNotepad extends JFrame {
    private JTextArea textArea;
    private JButton clearButton;

    public SimpleNotepad() {
        setTitle("Simple NotePad");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createGUI();
        addListeners();

        setVisible(true);
    }

    private void createGUI() {
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        clearButton = new JButton("Clear");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(clearButton);

        setLayout(new BorderLayout());

        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addListeners() {
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");}
        }
        );
    }
}
