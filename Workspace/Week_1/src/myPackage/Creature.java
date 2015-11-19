package myPackage;
import javax.swing.*;

public class Creature {
	
	int _legs;
	int _eyes;
	int _hands;
	float _height;
	float _weight;
	String _skinColor;

	public int get_legs() {
		return _legs;
	}

	public void set_legs(int _legs) {
		this._legs = _legs;
	}

	public int get_eyes() {
		return _eyes;
	}

	public void set_eyes(int _eyes) {
		this._eyes = _eyes;
	}

	public int get_hands() {
		return _hands;
	}

	public void set_hands(int _hands) {
		this._hands = _hands;
	}

	public float get_height() {
		return _height;
	}

	public void set_height(float _height) {
		this._height = _height;
	}

	public float get_weight() {
		return _weight;
	}

	public void set_weight(float _weight) {
		this._weight = _weight;
	}

	public String get_skinColor() {
		return _skinColor;
	}

	public void set_skinColor(String _skinColor) {
		this._skinColor = _skinColor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Creature creature = new Creature();
		
		creature.set_legs(Integer.parseInt(JOptionPane.showInputDialog("How many legs does the creature have?")));
		creature.set_eyes(Integer.parseInt(JOptionPane.showInputDialog("How many eyes does the creature have?")));
		creature.set_hands(Integer.parseInt(JOptionPane.showInputDialog("How many hands does the creature have?")));
		creature.set_height(Float.parseFloat(JOptionPane.showInputDialog("How tall is the creature in inches?")));
		creature.set_weight(Float.parseFloat(JOptionPane.showInputDialog("How much does the creature weigh?")));
		
		javax.swing.JOptionPane.showMessageDialog(null,
					"The creature has: " + creature.get_eyes() + " eyes, "
					+ creature.get_legs() + " legs, "
					+ "and " + creature.get_hands() + " hands."
					+ "The weighs " + creature.get_weight() + "lbs and is "
					+ creature.get_height() + "inches tall.");
	}

}
