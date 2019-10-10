package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	JButton mole = new JButton();
	int h = 0;
	int rando;
	Date d = new Date();
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
	mole.setText("");
	 rando = rand.nextInt(15);;
	if (rando == 0){
		
		b1.setText("Mole!");
		mole=b1;
	}
	else if (rando == 1){
		b2.setText("Mole!");
		mole=b2;
	}
	else if (rando == 2){
		
		b3.setText("Mole!");
		mole=b3;
	}
	else if (rando == 3){
		b4.setText("Mole!");
		mole=b4;
	}
	else if (rando == 4){
		b5.setText("Mole!");
		mole=b5;
	}
	else if (rando == 5){
		b6.setText("Mole!");
		mole=b6;
	}
	else if (rando == 6){
		b7.setText("Mole!");
		mole=b7;
	}
	else if (rando == 7){
		b8.setText("Mole!");
		mole=b8;
	}
	else if (rando == 8){
		b9.setText("Mole!");
		mole=b9;
	}
	else if (rando == 9){
		b10.setText("Mole!");
		mole=b10;
	}
	else if (rando == 10){
		b11.setText("Mole!");
		mole=b11;
	}
	else if (rando == 11){
		b12.setText("Mole!");
		mole=b12;
	}
	else if (rando == 12){
		b13.setText("Mole!");
		mole=b13;
	}
	else if (rando == 13){
		b14.setText("Mole!");
		mole=b14;
	}
	else if (rando == 14){
		b15.setText("Mole!");
		mole=b15;
	}
	else if (rando == 15){
		b16.setText("Mole!");
		mole=b16;
	}
	else if (rando == 16){
		b17.setText("Mole!");
		mole=b17;
	}
	else {
		b18.setText("Mole!");
		mole=b18;
	}
}
public void hit() {
	h++;
	Setup();
	if(h==10) {
		endGame(d,10);
	}
}
public void miss() {
	speak("That's not a mole!");
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton button = (JButton)arg0.getSource();
if(button.getText().equals("Mole!")){
	speak("That's a mole!");
	hit();
	}
else if(button.getText().equals("")){
	miss();
}
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}