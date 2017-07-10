package day1;

import javax.swing.JOptionPane;

public class Ask_Ages {
	public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you");
	int x = Integer.parseInt(age);
	for (int i = 2017 - x; i < 2018; i++) {
		System.out.println(i);
		
	

	}
	}

}
