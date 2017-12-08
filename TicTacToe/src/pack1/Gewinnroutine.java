package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Gewinnroutine {
	Timer time;

	public Gewinnroutine() {
		time = new Timer();
		time.schedule(new TimerTask() {
			@Override
			public void run() {
				if (Gui.gewinner == 0) {
					// Reihe 1 f�r X - Horizontal
					if (Gui.state[0] == 1 && Gui.state[1] == 1 && Gui.state[2] == 1) {
						Gui.gewinner = 1;
						Draw.m�glichkeit = 1;
					}
					// Reihe 2 f�r X - Horizontal
					if (Gui.state[3] == 1 && Gui.state[4] == 1 && Gui.state[5] == 1) {
						Gui.gewinner = 1;
						Draw.m�glichkeit = 2;
					}
					// Reihe 3 f�r X - Horizontal
					if (Gui.state[6] == 1 && Gui.state[7] == 1 && Gui.state[8] == 1) {
						Gui.gewinner = 1;
						Draw.m�glichkeit = 3;
					}
					// Reihe 1 f�r X - Vertikal
					if (Gui.state[0] == 1 && Gui.state[3] == 1 && Gui.state[6] == 1) {
						Gui.gewinner = 1;
						Draw.m�glichkeit = 4;
					}
					// Reihe 2 f�r X - Vertikal
					if (Gui.state[1] == 1 && Gui.state[4] == 1 && Gui.state[7] == 1) {
						Gui.gewinner = 1;
						Draw.m�glichkeit = 5;
					}
					// Reihe 3 f�r X - Horizontal
					if (Gui.state[2] == 1 && Gui.state[5] == 1 && Gui.state[8] == 1) {
						Gui.gewinner = 1;
						Draw.m�glichkeit = 6;
					}
					// links oben nach rechts unten f�r X - Kreuz
					if (Gui.state[0] == 1 && Gui.state[4] == 1 && Gui.state[8] == 1) {
						Gui.gewinner = 1;
						Draw.m�glichkeit = 7;
					}
					// links unten nach rechts oben f�r X - Kreuz
					if (Gui.state[6] == 1 && Gui.state[4] == 1 && Gui.state[2] == 1) {
						Gui.gewinner = 1;
						Draw.m�glichkeit = 8;
					}

					//////////////////////////////////////////////////////////////////

					// Reihe 1 f�r O - Horizontal
					if (Gui.state[0] == 2 && Gui.state[1] == 2 && Gui.state[2] == 2) {
						Gui.gewinner = 2;
						Draw.m�glichkeit = 1;
					}
					// Reihe 2 f�r O - Horizontal
					if (Gui.state[3] == 2 && Gui.state[4] == 2 && Gui.state[5] == 2) {
						Gui.gewinner = 2;
						Draw.m�glichkeit = 2;
					}
					// Reihe 3 f�r O - Horizontal
					if (Gui.state[6] == 2 && Gui.state[7] == 2 && Gui.state[8] == 2) {
						Gui.gewinner = 2;
						Draw.m�glichkeit = 3;
					}
					// Reihe 1 f�r O - Vertikal
					if (Gui.state[0] == 2 && Gui.state[3] == 2 && Gui.state[6] == 2) {
						Gui.gewinner = 2;
						Draw.m�glichkeit = 4;
					}
					// Reihe 2 f�r O - Vertikal
					if (Gui.state[1] == 2 && Gui.state[4] == 2 && Gui.state[7] == 2) {
						Gui.gewinner = 2;
						Draw.m�glichkeit = 5;
					}
					// Reihe 3 f�r O - Horizontal
					if (Gui.state[2] == 2 && Gui.state[5] == 2 && Gui.state[8] == 2) {
						Gui.gewinner = 2;
						Draw.m�glichkeit = 6;
					}
					// links oben nach rechts unten f�r O - Kreuz
					if (Gui.state[0] == 2 && Gui.state[4] == 2 && Gui.state[8] == 2) {
						Gui.gewinner = 2;
						Draw.m�glichkeit = 7;
					}
					// links unten nach rechts oben f�r O - Kreuz
					if (Gui.state[6] == 2 && Gui.state[4] == 2 && Gui.state[2] == 2) {
						Gui.gewinner = 2;
						Draw.m�glichkeit = 8;
					}

				}
			}
		}, 0, 150);
	}

}
