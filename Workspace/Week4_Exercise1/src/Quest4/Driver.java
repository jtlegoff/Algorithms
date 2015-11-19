package Quest4;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sound sound = new Sound();
		sound.setSoundName("Bang");
		sound.setSoundLength("00:00:01");
		Sound sound2 = new Sound();
		sound2.setSoundName("Boom");
		sound2.setSoundLength("00:00:02");
		Sound sound3 = new Sound();
		sound3.setSoundName("Bonk");
		sound3.setSoundLength("00:00:03");
		
		SoundStack soundStack = new SoundStack();
		soundStack.push(sound);
		soundStack.push(sound2);
		soundStack.push(sound3);
		System.out.println(((Sound)soundStack.topEl()).getSoundName().toString() + " is "
							+ ((Sound)soundStack.topEl()).getSoundLength().toString() + " long.");
		soundStack.pop();
		System.out.println(((Sound)soundStack.topEl()).getSoundName().toString() + " is "
				+ ((Sound)soundStack.topEl()).getSoundLength().toString() + " long.");
	}

}
