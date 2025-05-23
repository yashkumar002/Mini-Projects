

import java.awt.*;
import java.awt.event.*;

class Calculator3 extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    Button b13, b14, b15, b16, b17, b18, b19, b20;
    Label l1;
    TextField t1; // Created by Yash Kumar Banjare....
    String operator = "";
    double num1 = 0, num2 = 0, result = 0;

    Calculator3() {
        // Set frame background color
        setBackground(Color.LIGHT_GRAY);

        // Label setup with color and font
        l1 = new Label("CALCULATOR GAME");
        l1.setBounds(130, 50, 130, 20);
        l1.setForeground(Color.BLUE);

        // TextField setup with larger font, right alignment, and text color
        t1 = new TextField();
        t1.setFont(new Font("Arial", Font.PLAIN, 24));
     //   t1.setAlignment(TextField.RIGHT);
        t1.setBounds(100, 100, 200, 35);
        t1.setForeground(Color.BLACK); // Created by Yash Kumar Banjare....
        t1.setBackground(Color.WHITE);

        // Initialize buttons and set their colors
        b1 = createButton("AC", Color.RED, Color.WHITE);
        b2 = createButton("%", Color.PINK, Color.BLACK);
        b3 = createButton("DEL", Color.ORANGE, Color.BLACK);
        b4 = createButton("/", Color.CYAN, Color.BLACK);
        b5 = createButton("7", Color.GRAY, Color.BLACK);
        b6 = createButton("8", Color.GRAY, Color.BLACK); // Created by Yash Kumar Banjare....
        b7 = createButton("9", Color.GRAY, Color.BLACK);
        b8 = createButton("*", Color.CYAN, Color.BLACK);
        b9 = createButton("4", Color.GRAY, Color.BLACK);
        b10 = createButton("5", Color.GRAY, Color.BLACK);
        b11 = createButton("6", Color.GRAY, Color.BLACK);
        b12 = createButton("-", Color.CYAN, Color.BLACK);
        b13 = createButton("1", Color.GRAY, Color.BLACK); // Created by Yash Kumar Banjare....
        b14 = createButton("2", Color.GRAY, Color.BLACK);
        b15 = createButton("3", Color.GRAY, Color.BLACK);
        b16 = createButton("+", Color.CYAN, Color.BLACK);
        b17 = createButton("00", Color.GRAY, Color.BLACK);
        b18 = createButton("0", Color.GRAY, Color.BLACK);
        b19 = createButton(".", Color.GRAY, Color.BLACK);
        b20 = createButton("=", Color.GREEN, Color.BLACK);
 // Created by Yash Kumar Banjare....
        // Set layout and add components
        setLayout(null);
        add(t1);
        add(l1);
        
        // Adding buttons with specific positions
        addButtons();

        setSize(400, 500);
        setVisible(true); // Created by Yash Kumar Banjare....
    }

    // Helper function to create a button with specified background and text colors
    private Button createButton(String label, Color bgColor, Color textColor) {
        Button button = new Button(label);
        button.setBackground(bgColor);
        button.setForeground(textColor);
        button.addActionListener(this); // Created by Yash Kumar Banjare....
        return button;
    }

    // Position buttons on the calculator
    private void addButtons() {
        b1.setBounds(100, 150, 40, 30); // Created by Yash Kumar Banjare....
        b2.setBounds(150, 150, 40, 30);
        b3.setBounds(200, 150, 40, 30);
        b4.setBounds(250, 150, 40, 30);
        b5.setBounds(100, 190, 40, 30);
        b6.setBounds(150, 190, 40, 30);
        b7.setBounds(200, 190, 40, 30);
        b8.setBounds(250, 190, 40, 30);
        b9.setBounds(100, 230, 40, 30);
        b10.setBounds(150, 230, 40, 30);
        b11.setBounds(200, 230, 40, 30);
        b12.setBounds(250, 230, 40, 30);
        b13.setBounds(100, 270, 40, 30);
        b14.setBounds(150, 270, 40, 30);
        b15.setBounds(200, 270, 40, 30);
        b16.setBounds(250, 270, 40, 30); // Created by Yash Kumar Banjare....
        b17.setBounds(100, 310, 40, 30);
        b18.setBounds(150, 310, 40, 30);
        b19.setBounds(200, 310, 40, 30);
        b20.setBounds(250, 310, 40, 30);

        add(b1); add(b2); add(b3); add(b4);
        add(b5); add(b6); add(b7); add(b8);
        add(b9); add(b10); add(b11); add(b12);
        add(b13); add(b14); add(b15); add(b16); // Created by Yash Kumar Banjare....
        add(b17); add(b18); add(b19); add(b20);
    }

    public static void main(String[] args) {
        System.out.println("CALCULATOR GAME");
        new Calculator3();
    } // Created by Yash Kumar Banjare....

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("AC")) {
            t1.setText("");
            num1 = num2 = result = 0;
            operator = ""; // Created by Yash Kumar Banjare....
        } else if (cmd.equals("DEL")) {
            String text = t1.getText();
            if (!text.isEmpty()) {
                t1.setText(text.substring(0, text.length() - 1));
            }
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(t1.getText());
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2; // Created by Yash Kumar Banjare....
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                case "%" -> result = num1 % num2;
            }
            t1.setText("" + result);
            operator = "";
        } else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/") || cmd.equals("%")) {
            operator = cmd;
            num1 = Double.parseDouble(t1.getText()); // Created by Yash Kumar Banjare....
            t1.setText("");
        } else {
            t1.setText(t1.getText() + cmd);
        } // Created by Yash Kumar Banjare....




         // Created by Yash Kumar Banjare....
    }
}