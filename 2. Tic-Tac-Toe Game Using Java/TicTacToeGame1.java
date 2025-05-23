
// Using AWT(Abstract Window Toolkit) in java.....
// To Create a TIC-TAC-TOE GAME ...


import java.awt.*;
import java.awt.event.*;
class TicTacToeGame1 extends Frame implements ActionListener
{
 int c1=0, c2=0;
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
 Button b10;
 int t=1; 
 Label l1,l2, l3, l4, l5;
 Label l6,l7;  
// Created by Yash Kumar Banjare.....
 TicTacToeGame1()
{
   l1=new Label("TIC-TAC-TOE GAME");
   l2=new Label("Player 1 : ");
   l3=new Label("Player 2 : ");
   l4=new Label("0");
   l5=new Label("0");
   l6=new Label("Player 1 is Winner! ");
   l7=new Label("Player 2 is Winner! ");
   b1=new Button();

b2=new Button();
b3=new Button();
b4=new Button();
b5=new Button();
b6=new Button();
b7=new Button();
b8=new Button();
b9=new Button();
b10=new Button("Exit");
// Created by Yash Kumar Banjare.....
add(l2);
add(l3);
add(l4);
add(l5);
add(l1);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);// Created by Yash Kumar Banjare.....
add(b7);
add(b8);
add(b9);
add(l6);
add(l7);
add(b10);

setLayout(null);

l2.setBounds(50, 50, 50, 30);
l4.setBounds(110, 50, 50, 30);
l3.setBounds(50, 70, 50, 30);
l5.setBounds(110, 70, 50, 30);// Created by Yash Kumar Banjare.....

l1.setBounds(180, 100, 150, 40);
b1.setBounds(100, 170, 80, 80);
b2.setBounds(190, 170, 80, 80);
b3.setBounds(280, 170, 80, 80);
b4.setBounds(100, 260, 80, 80);// Created by Yash Kumar Banjare.....
b5.setBounds(190, 260, 80, 80);
b6.setBounds(280, 260, 80, 80);
b7.setBounds(100, 350, 80, 80);
b8.setBounds(190, 350, 80, 80);
b9.setBounds(280, 350, 80, 80);

l6.setBounds(190, 250, 150, 80);
l7.setBounds(190, 250, 150, 80);
b10.setBounds(180, 460, 110, 30);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);// Created by Yash Kumar Banjare.....
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);

 
l6.setVisible(false);
l7.setVisible(false);

}// Created by Yash Kumar Banjare.....
public static void main(String[]args)
{

 System.out.println("TIC-TAC-TOE GAME");
  TicTacToeGame1 x=new TicTacToeGame1();
  x.setSize(600, 700);
  x.setVisible(true);
 
}// Created by Yash Kumar Banjare.....

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b1)
{  
if(b1.getLabel().length()==0)
{
 if(t%2==0)
{
 b1.setLabel("X");
}
else{
 b1.setLabel("O");
}
t++;// Created by Yash Kumar Banjare.....
}
}

 if(e.getSource()==b2)
{  
if(b2.getLabel().length()==0)
{
 if(t%2==0)// Created by Yash Kumar Banjare.....
{
 b2.setLabel("X");
}
else{
 b2.setLabel("O");
}
t++;
}
}// Created by Yash Kumar Banjare.....
 if(e.getSource()==b3)
{  
if(b3.getLabel().length()==0)
{
 if(t%2==0)
{
 b3.setLabel("X");
}
else{// Created by Yash Kumar Banjare.....
 b3.setLabel("O");
}
t++;
}
}
 if(e.getSource()==b4)
{ 
if(b4.getLabel().length()==0)
{ 
 if(t%2==0)
{// Created by Yash Kumar Banjare.....
 b4.setLabel("X");
}
else{
 b4.setLabel("O");
}// Created by Yash Kumar Banjare.....
t++;
}
}
 if(e.getSource()==b5)
{
if(b5.getLabel().length()==0)
{
 if(t%2==0)
{
 b5.setLabel("X");
}// Created by Yash Kumar Banjare.....
else{
 b5.setLabel("O");
}
t++;
}// Created by Yash Kumar Banjare.....
}
 if(e.getSource()==b6)
{  
if(b6.getLabel().length()==0)
{
 if(t%2==0)
{
 b6.setLabel("X");
}// Created by Yash Kumar Banjare.....
else{
 b6.setLabel("O");
}
t++;
}
}
 if(e.getSource()==b7)
{  
if(b7.getLabel().length()==0)
{// Created by Yash Kumar Banjare.....
 if(t%2==0)
{
 b7.setLabel("X");
}
else{
 b7.setLabel("O");
}
t++;
}
}// Created by Yash Kumar Banjare.....
 if(e.getSource()==b8)
{  
if(b8.getLabel().length()==0)
{
 if(t%2==0)
{
 b8.setLabel("X");
}
else{
 b8.setLabel("O");// Created by Yash Kumar Banjare.....
}
t++;
}
}
 if(e.getSource()==b9)
{  
if(b9.getLabel().length()==0)
{
 if(t%2==0)
{
 b9.setLabel("X");// Created by Yash Kumar Banjare.....
}
else{
 b9.setLabel("O");
}
t++;
}// Created by Yash Kumar Banjare.....
}

String a1=b1.getLabel();
String a2=b2.getLabel();
String a3=b3.getLabel();
String a4=b4.getLabel();
String a5=b5.getLabel();
String a6=b6.getLabel();// Created by Yash Kumar Banjare.....
String a7=b7.getLabel();
String a8=b8.getLabel();
String a9=b9.getLabel();

b10.setVisible(false);
if(e.getSource()==b10)
{
System.exit(0);// Created by Yash Kumar Banjare.....
}

if((a1.equals("X") && a2.equals("X") && a3.equals("X")) || (a4.equals("X") && a5.equals("X") && a6.equals("X")) || (a7.equals("X") && a8.equals("X") && a9.equals("X")) || (a1.equals("X") && a4.equals("X") && a7.equals("X")) || (a2.equals("X") && a5.equals("X") && a8.equals("X")) || (a3.equals("X") && a6.equals("X") && a9.equals("X")) || (a1.equals("X") && a5.equals("X") && a9.equals("X")) || (a3.equals("X") && a5.equals("X") && a7.equals("X")) )
{

 System.out.println("Player 2 is Winner!");
  b1.setLabel("");
  b2.setLabel("");// Created by Yash Kumar Banjare.....
  b3.setLabel("");
  b4.setLabel("");
  b5.setLabel("");
  b6.setLabel("");
  b7.setLabel("");
  b8.setLabel("");
  b9.setLabel("");
  t=1;// Created by Yash Kumar Banjare.....
  c2=c2+1;
  l5.setText(c2+"");

if(c2==3)
{// Created by Yash Kumar Banjare.....
 l7.setVisible(true);
 b10.setVisible(true);

 b1.setVisible(false);
 b2.setVisible(false);
 b3.setVisible(false);
 b4.setVisible(false);
 b5.setVisible(false);
 b6.setVisible(false);
 b7.setVisible(false);
 b8.setVisible(false);// Created by Yash Kumar Banjare.....
 b9.setVisible(false);

}
}
// Created by Yash Kumar Banjare.....
 else if((a1.equals("O") && a2.equals("O") && a3.equals("O")) || (a4.equals("O") && a5.equals("O") && a6.equals("O")) || (a7.equals("O") && a8.equals("O") && a9.equals("O")) || (a1.equals("O") && a4.equals("O") && a7.equals("O")) || (a2.equals("O") && a5.equals("O") && a8.equals("O")) || (a3.equals("O") && a6.equals("O") && a9.equals("O")) || (a1.equals("O") && a5.equals("O") && a9.equals("O")) || (a3.equals("O") && a5.equals("O") && a7.equals("O")) )
{
 System.out.println("Player 1 is Winner!");
  b1.setLabel("");
  b2.setLabel("");
  b3.setLabel("");
  b4.setLabel("");// Created by Yash Kumar Banjare.....
  b5.setLabel("");
  b6.setLabel("");
  b7.setLabel("");
  b8.setLabel("");
  b9.setLabel("");
  t=1;
  c1=c1+1;
  l4.setText(c1+"");

  if(c1==3)// Created by Yash Kumar Banjare.....
{
 l6.setVisible(true);
 b10.setVisible(true);

 b1.setVisible(false);
 b2.setVisible(false);// Created by Yash Kumar Banjare.....
 b3.setVisible(false);
 b4.setVisible(false);
 b5.setVisible(false);
 b6.setVisible(false);
 b7.setVisible(false);
 b8.setVisible(false);
 b9.setVisible(false);
// Created by Yash Kumar Banjare.....
}
}

else if(t==10)
{
 System.out.println("Draw The Game!");
b1.setLabel("");
b2.setLabel("");// Created by Yash Kumar Banjare.....
b3.setLabel("");
b4.setLabel("");
b5.setLabel("");
b6.setLabel("");
b7.setLabel("");
b8.setLabel("");
b9.setLabel("");
t=1;

}// Created by Yash Kumar Banjare.....

}
}