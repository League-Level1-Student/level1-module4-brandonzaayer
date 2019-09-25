package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MoleSlapper implements ActionListener {
	static JFrame f = new JFrame();
	static JPanel p = new JPanel();
	static JButton b1 = new JButton();
	static JButton b2 = new JButton();
	static JButton b3 = new JButton();
	static JButton b4 = new JButton();
	static JButton b5 = new JButton();
	static JButton b6 = new JButton();
	static JButton b7 = new JButton();
	static JButton b8 = new JButton();
	static JButton b9 = new JButton();
	static JButton b10 = new JButton();
	static JButton b11 = new JButton();
	static JButton b12 = new JButton();
	static JButton b13 = new JButton();
	static JButton b14 = new JButton();
	static JButton b15 = new JButton();
	static JButton b16 = new JButton();
	static JButton b17 = new JButton();
	static JButton b18 = new JButton();
	
	public static void main(String[] args) {
		MoleSlapper slap = new MoleSlapper();
		slap.Setup();
	}

void Setup() {
	f.add(p);
	f.setVisible(true);
	p.add(b1);
	b1.addActionListener(this);
	p.add(b2);
	b2.addActionListener(this);
	p.add(b3);
	b3.addActionListener(this);
	p.add(b4);
	b4.addActionListener(this);
	p.add(b5);
	b5.addActionListener(this);
	p.add(b6);
	b6.addActionListener(this);
	p.add(b7);
	b7.addActionListener(this);
	p.add(b8);
	b8.addActionListener(this);
	p.add(b9);
	b9.addActionListener(this);
	p.add(b10);
	b10.addActionListener(this);
	p.add(b11);
	b11.addActionListener(this);
	p.add(b12);
	b12.addActionListener(this);
	p.add(b13);
	b13.addActionListener(this);
	p.add(b14);
	b14.addActionListener(this);
	p.add(b15);
	b15.addActionListener(this);
	p.add(b16);
	b16.addActionListener(this);
	p.add(b17);
	b17.addActionListener(this);
	p.add(b18);
	b18.addActionListener(this);
	f.setPreferredSize(new Dimension(250, 25));
	Random rand = new Random();
	int rando = rand.nextInt(15);;
	if (rando == 0){
		b1.setText("Mole!");
	}
	else if (rando == 1){
		b2.setText("Mole!");
	}
	else if (rando == 2){
		b3.setText("Mole!");
	}
	else if (rando == 3){
		b4.setText("Mole!");
	}
	else if (rando == 4){
		b5.setText("Mole!");
	}
	else if (rando == 5){
		b6.setText("Mole!");
	}
	else if (rando == 6){
		b7.setText("Mole!");
	}
	else if (rando == 7){
		b8.setText("Mole!");
	}
	else if (rando == 8){
		b9.setText("Mole!");
	}
	else if (rando == 9){
		b10.setText("Mole!");
	}
	else if (rando == 10){
		b11.setText("Mole!");
	}
	else if (rando == 11){
		b12.setText("Mole!");
	}
	else if (rando == 12){
		b13.setText("Mole!");
	}
	else if (rando == 13){
		b14.setText("Mole!");
	}
	else if (rando == 14){
		b15.setText("Mole!");
	}
	else if (rando == 15){
		b16.setText("Mole!");
	}
	else if (rando == 16){
		b17.setText("Mole!");
	}
	else {
		b18.setText("Mole!");
	}
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
if(arg0.getSource().equals(b1) && b1.getText() == "Mole!") {
		
	}
else if(arg0.getSource().equals(b2) && b2.getText() == "Mole!") {
		
	}
else if(arg0.getSource().equals(b3) && b3.getText() == "Mole!") {
		
	}
else if(arg0.getSource().equals(b4) && b4.getText() == "Mole!") {
	
}
else if(arg0.getSource().equals(b5) && b5.getText() == "Mole!") {
	
}
else if(arg0.getSource().equals(b6) && b6.getText() == "Mole!") {
	
}
else if(arg0.getSource().equals(b7) && b7.getText() == "Mole!") {
	
}
else if(arg0.getSource().equals(b8) && b8.getText() == "Mole!") {

}
else if(arg0.getSource().equals(b9) && b9.getText() == "Mole!") {

}
else if(arg0.getSource().equals(b2) && b10.getText() == "Mole!") {
	
}
else if(arg0.getSource().equals(b11) && b11.getText() == "Mole!") {
	
}
else if(arg0.getSource().equals(b12) && b12.getText() == "Mole!") {

}
else if(arg0.getSource().equals(b13) && b13.getText() == "Mole!") {

}
else if(arg0.getSource().equals(b14) && b14.getText() == "Mole!") {

}
else if(arg0.getSource().equals(b15) && b15.getText() == "Mole!") {

}
else if(arg0.getSource().equals(b16) && b16.getText() == "Mole!") {

}
else if(arg0.getSource().equals(b17) && b17.getText() == "Mole!") {

}
else {
	
}
}
void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}