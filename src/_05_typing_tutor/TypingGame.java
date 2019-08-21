package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingGame implements KeyListener {
	
	 char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	 char currentLetter;
	 JFrame f = new JFrame();
		JLabel l = new JLabel();
		JPanel p = new JPanel();
void buttonSetup(){
	
	currentLetter = generateRandomLetter();
	f.add(p);
	p.add(l);
	f.setVisible(true);
	l.setText(currentLetter+"");
	l.setFont(l.getFont().deriveFont(28.0f));
	l.setHorizontalAlignment(JLabel.CENTER);
	f.setSize(200, 200);
	f.addKeyListener(this);
}
	public static void main(String[] args) {
		TypingGame a = new TypingGame();
		a.buttonSetup();
}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyChar()==currentLetter) {
			
			currentLetter = generateRandomLetter();
			System.out.println("Correct");
		p.setBackground(new Color(0, 255, 0));	
		l.setText(currentLetter + "");
		}
		else {
			System.out.println("Incorrect");
			p.setBackground(new Color(255, 0, 0));	
		}
	}	
}
