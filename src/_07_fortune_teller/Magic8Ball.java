package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random r = new Random();
int are = r.nextInt(4);
	// 3. Print out this variable
System.out.println(r);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Anything, really anything. \n It's all random.");
	// 5. If the random number is 0
if(are==0) {
	JOptionPane.showMessageDialog(null, "Yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
else if(are==1) {
	JOptionPane.showMessageDialog(null, "No");
}
	// -- tell the user "No"

	// 7. If the random number is 2
else if(are==2) {
	JOptionPane.showMessageDialog(null, "Google is the answer to life and all of it's difficult questions");
}
	
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
else {
	JOptionPane.showMessageDialog(null, "What are the odds you are reading this \n you have 75% of real answers. I'm all out of ideas.");
}
	// -- write your own answer
}
}
