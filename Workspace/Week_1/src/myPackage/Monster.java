package myPackage;

import javax.swing.*;
//import javax.swing.JOptionPane;

public class Monster {

	String m_name;
	int m_age;
	
	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getM_age() {
		return m_age;
	}

	public void setM_age(int m_age) {
		this.m_age = m_age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster leviathon = new Monster();
		leviathon.setM_name("Leviathon");
		leviathon.setM_age(150);
		System.out.println("Monster name is " + leviathon.getM_name());
		System.out.println("Monster age is " + leviathon.getM_age());

		String theString = JOptionPane.showInputDialog("Enter number of item:");
		int theNumber = Integer.parseInt(theString);
		System.out.println(theNumber);
	}

}
