package pack1;

import javax.swing.JOptionPane;

public class Main {
	public static String spieler1 = "Spieler1";
	public static String spieler2 = "Spieler2";
	static boolean visible;

	public static void main(String[] args) {

		spieler1 = JOptionPane.showInputDialog(null, "Erster Spieler:");
		spieler2 = JOptionPane.showInputDialog(null, "Zweiter Spieler:");
		if (!(spieler1.equalsIgnoreCase(spieler2))) {
			visible = true;
			new Gui();
			new ImageLoader();
			new Gewinnroutine();
		}
		// Object[] possibilities = {"7777", "7778", "7779"};
		// port=(String) JOptionPane.showInputDialog(null,
		// "Port auf dem der Server laufen soll:\n",
		// "Setup",
		// JOptionPane.PLAIN_MESSAGE,
		// null,
		// null,
		// "Spieler1sü");
	}

}
