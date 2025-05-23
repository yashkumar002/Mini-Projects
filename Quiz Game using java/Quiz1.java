import java.awt.*;
import java.awt.event.*;

class Quiz1 extends Frame implements ActionListener {
    int i;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    Label l1, l2, ans1;
    Checkbox c1, c2, c3, c4; //Created by Yash Kumar Banjare.....
    CheckboxGroup cbg;
    Button b11, b12, b13, b14, b15;

    String[] a = {"Q1. Prime Minister of India", "Q2. 2+7=?", "Q3. Who invented Java Programming?", "Q4. 8*4=?", "Q5. Which component is used to compile,debug and execute the java programs?", "Q6. Which one of the following is not a java feature?", "Q7. What is the extension of java code files?", "Q8. How much is a byte equal to?", "Q9. What is the full form of E-mail?", "Q10. Who is the Father of Computer?"};
    
    String[] opt1 = {"Mr. Narendra Modi", "10", "Guido van Rossum", "40", "JRE", "Object Oriented", ".js", "8 bit", "Electic Mail", "Charles Babbage"};
    String[] opt2 = {"Arvind Kejriwal", "9", "James Gosling", "84", "JIT", "Use of Pointers", ".txt", "16 bit", "Exchange Mail", "Thomas Edition"};
    String[] opt3 = {"Rahul Gandhi", "27", "Dennis Ritchie", "32", "JDK", "Portable", ".class", "32 bit", "Electronic Mail", "Albert Einstein"};
    String[] opt4 = {"Mamta Banerjee", "14", "Bjarne Stroustrup", "12", "JVM", "Dynamic and Extensible", ".java", "64 bit", "Engagement Mail", "Isaac Newton"};
    
    String[] ans = {"1", "2", "2", "3", "3", "2", "4", "1", "3", "1"};

    Quiz1() {
        // Set frame properties//Created by Yash Kumar Banjare.....
        setTitle("Quiz Game");
        setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        // Create and position components
        l1 = new Label("QUIZ GAME");
        l1.setFont(new Font("Arial", Font.BOLD, 15));
        l1.setForeground(Color.BLUE);
        l2 = new Label("Questions: ");
        l2.setForeground(Color.MAGENTA);
        ans1 = new Label();//Created by Yash Kumar Banjare.....
        
        cbg = new CheckboxGroup();
        c1 = new Checkbox("Option 1", cbg, false);
        c2 = new Checkbox("Option 2", cbg, false);
        c3 = new Checkbox("Option 3", cbg, false);
        c4 = new Checkbox("Option 4", cbg, false);

        c1.setBackground(Color.CYAN);//Created by Yash Kumar Banjare.....
        c2.setBackground(Color.CYAN);
        c3.setBackground(Color.CYAN);
        c4.setBackground(Color.CYAN);

        b1 = new Button("Que1");  b2 = new Button("Que2");  b3 = new Button("Que3"); 
        b4 = new Button("Que4");  b5 = new Button("Que5");  b6 = new Button("Que6");
        b7 = new Button("Que7");  b8 = new Button("Que8");  b9 = new Button("Que9");  
        b10 = new Button("Que10");
//Created by Yash Kumar Banjare.....
        b11 = new Button("Exit"); b12 = new Button("Previous"); b13 = new Button("Next");
        b14 = new Button("Start"); b15 = new Button("Ans");

        // Add buttons and labels to frame
        add(b14); add(b15); add(l1); add(b1); add(b2); add(b3); add(b4); add(b5); add(b6);
        add(b7); add(b8); add(b9); add(b10); add(l2); add(c1); add(c2); add(c3); add(c4);
        add(b11); add(b12); add(b13); add(ans1);

        // Set positions of components//Created by Yash Kumar Banjare.....
        b14.setBounds(240, 250, 80, 40);  l1.setBounds(220, 80, 100, 40);  b1.setBounds(100, 150, 40, 25);
        b2.setBounds(150, 150, 40, 25);  b3.setBounds(200, 150, 40, 25);  b4.setBounds(250, 150, 40, 25);
        b5.setBounds(300, 150, 40, 25);  b6.setBounds(350, 150, 40, 25);  b7.setBounds(400, 150, 40, 25);
        b8.setBounds(450, 150, 40, 25);  b9.setBounds(500, 150, 40, 25);  b10.setBounds(550, 150, 40, 25);
        l2.setBounds(100, 200, 250, 30);  c1.setBounds(110, 250, 150, 30);  c2.setBounds(110, 280, 150, 30);
        c3.setBounds(110, 310, 150, 30);  c4.setBounds(110, 340, 150, 30);  b11.setBounds(500, 440, 40, 25);
        b12.setBounds(130, 400, 55, 25);  b13.setBounds(200, 400, 50, 25);  b15.setBounds(130, 440, 50, 25);
        ans1.setBounds(200, 440, 80, 25);
//Created by Yash Kumar Banjare.....
        // Add action listeners to buttons
        b14.addActionListener(this); b1.addActionListener(this); b2.addActionListener(this);
        b3.addActionListener(this); b4.addActionListener(this); b5.addActionListener(this);
        b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this);
        b9.addActionListener(this); b10.addActionListener(this); b11.addActionListener(this);
        b12.addActionListener(this); b13.addActionListener(this); b15.addActionListener(this);//Created by Yash Kumar Banjare.....

        // Hide components initially
        setComponentsVisible(false);
    }
//Created by Yash Kumar Banjare.....
    private void setComponentsVisible(boolean visible) {
        l1.setVisible(visible); l2.setVisible(visible); c1.setVisible(visible);
        c2.setVisible(visible); c3.setVisible(visible); c4.setVisible(visible);
        b1.setVisible(visible); b2.setVisible(visible); b3.setVisible(visible); b4.setVisible(visible);
        b5.setVisible(visible); b6.setVisible(visible); b7.setVisible(visible); b8.setVisible(visible);//Created by Yash Kumar Banjare.....
        b9.setVisible(visible); b10.setVisible(visible); b11.setVisible(visible);
        b12.setVisible(visible); b13.setVisible(visible); b15.setVisible(visible);
    }

    public static void main(String[] args) {
        System.out.println("QUIZ GAME");//Created by Yash Kumar Banjare.....
        Quiz1 x = new Quiz1();
        x.setSize(700, 800);
        x.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b14) {
            setComponentsVisible(true);
            b14.setVisible(false);//Created by Yash Kumar Banjare.....
        }

        ans1.setText("");
        if (e.getSource() == b1) { setQuestion(0); }
        if (e.getSource() == b2) { setQuestion(1); }//Created by Yash Kumar Banjare.....
        if (e.getSource() == b3) { setQuestion(2); }
        if (e.getSource() == b4) { setQuestion(3); }
        if (e.getSource() == b5) { setQuestion(4); }
        if (e.getSource() == b6) { setQuestion(5); }
        if (e.getSource() == b7) { setQuestion(6); }//Created by Yash Kumar Banjare.....
        if (e.getSource() == b8) { setQuestion(7); }
        if (e.getSource() == b9) { setQuestion(8); }
        if (e.getSource() == b10) { setQuestion(9); }
//Created by Yash Kumar Banjare.....
        if (e.getSource() == b12) { previousQuestion(); }
        if (e.getSource() == b13) { nextQuestion(); }

        if (e.getSource() == b15) { checkAnswer(); }

        if (e.getSource() == b11) { System.exit(0); }
    }
//Created by Yash Kumar Banjare.....
    private void setQuestion(int index) {
        i = index;
        l2.setText(a[i]);
        c1.setLabel(opt1[i]);
        c2.setLabel(opt2[i]);
        c3.setLabel(opt3[i]);//Created by Yash Kumar Banjare.....
        c4.setLabel(opt4[i]);
    }

    private void previousQuestion() {
        i = (i > 0) ? --i : a.length - 1;//Created by Yash Kumar Banjare.....
        setQuestion(i);
    }//Created by Yash Kumar Banjare.....
    private void nextQuestion() {
        i = (i < a.length - 1) ? ++i : 0;
        setQuestion(i);
    }

    private void checkAnswer() {
        String selectedOption;
        //Created by Yash Kumar Banjare.....
        // Determine which checkbox is selected
        if (c1.getState()) {
            selectedOption = "1";
        } else if (c2.getState()) {
            selectedOption = "2";
        } else if (c3.getState()) {//Created by Yash Kumar Banjare.....
            selectedOption = "3";
        } else {
            selectedOption = "4";
        }

        // Check if selected answer matches the correct answer
        if (selectedOption.equals(ans[i])) {
            ans1.setText("Right");
            ans1.setForeground(Color.GREEN);
        } else {//Created by Yash Kumar Banjare.....
            ans1.setText("Wrong");
            ans1.setForeground(Color.RED);
        }
    }
}//Created by Yash Kumar Banjare.....




//Created by Yash Kumar Banjare.....