package quest3_package2.copy;

public class CharacterLListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterLList cl = new CharacterLList();
		Sorcerer gandalf = new Sorcerer("Galdalf");
		Warrior conan = new Warrior("Conan");
		Rogue shiek = new Rogue("Shiek");
		cl.add(conan);
		cl.add(gandalf);
		cl.add(shiek);
		cl.printAll(System.out);
		cl.kill(gandalf);
		System.out.println("");
		cl.printAll(System.out);
		System.out.println("");
		cl.deleteHead();
		cl.printAll(System.out);
		System.out.println("");

		
	}

}
