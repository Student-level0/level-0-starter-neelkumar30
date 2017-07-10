package day1;

import javax.swing.JOptionPane;

public class KnockKnock {
public static void main(String[] args) {
JOptionPane.showInputDialog("Knock Knock");
JOptionPane.showInputDialog("Clear");
JOptionPane.showInputDialog("Clear this hallway");
JOptionPane.showInputDialog("Knock Knock");
JOptionPane.showInputDialog("Atch");
JOptionPane.showInputDialog("I am sorry, I didn't know you had a cold");
String joke = JOptionPane.showInputDialog("What has four wheels and flies?");
if( joke.equalsIgnoreCase("A garbage truck")){
	JOptionPane.showMessageDialog(null,"Good job");
}
else{
	JOptionPane.showMessageDialog(null, "The correct answer was a garbage truck. You are bad");
	String joke2 = JOptionPane.showInputDialog("A jar has one jelly bean in it. Every minute, the amount of jelly beans in the jar doubles. One hour later, the jar is full. After how many minutes is the jar half full?");
	if( joke2.equals("59 minutes")){
		JOptionPane.showMessageDialog(null,"Good job");
	}
	else{
		JOptionPane.showMessageDialog(null, "The correct answer was 59 minutes. Go back to first grade. Get smarter");
}

}
}
}
