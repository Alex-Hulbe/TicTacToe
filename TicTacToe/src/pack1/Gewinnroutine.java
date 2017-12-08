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
					// Reihe 1 für X - Horizontal
					if (Gui.state[0] == 1 && Gui.state[1] == 1 && Gui.state[2] == 1) {
						Gui.gewinner = 1;
						Draw.möglichkeit = 1;
					}
					// Reihe 2 für X - Horizontal
					if (Gui.state[3] == 1 && Gui.state[4] == 1 && Gui.state[5] == 1) {
						Gui.gewinner = 1;
						Draw.möglichkeit = 2;
					}
					// Reihe 3 für X - Horizontal
					if (Gui.state[6] == 1 && Gui.state[7] == 1 && Gui.state[8] == 1) {
						Gui.gewinner = 1;
						Draw.möglichkeit = 3;
					}
					// Reihe 1 für X - Vertikal
					if (Gui.state[0] == 1 && Gui.state[3] == 1 && Gui.state[6] == 1) {
						Gui.gewinner = 1;
						Draw.möglichkeit = 4;
					}
					// Reihe 2 für X - Vertikal
					if (Gui.state[1] == 1 && Gui.state[4] == 1 && Gui.state[7] == 1) {
						Gui.gewinner = 1;
						Draw.möglichkeit = 5;
					}
					// Reihe 3 für X - Horizontal
					if (Gui.state[2] == 1 && Gui.state[5] == 1 && Gui.state[8] == 1) {
						Gui.gewinner = 1;
						Draw.möglichkeit = 6;
					}
					// links oben nach rechts unten für X - Kreuz
					if (Gui.state[0] == 1 && Gui.state[4] == 1 && Gui.state[8] == 1) {
						Gui.gewinner = 1;
						Draw.möglichkeit = 7;
					}
					// links unten nach rechts oben für X - Kreuz
					if (Gui.state[6] == 1 && Gui.state[4] == 1 && Gui.state[2] == 1) {
						Gui.gewinner = 1;
						Draw.möglichkeit = 8;
					}

					//////////////////////////////////////////////////////////////////

					// Reihe 1 für O - Horizontal
					if (Gui.state[0] == 2 && Gui.state[1] == 2 && Gui.state[2] == 2) {
						Gui.gewinner = 2;
						Draw.möglichkeit = 1;
					}
					// Reihe 2 für O - Horizontal
					if (Gui.state[3] == 2 && Gui.state[4] == 2 && Gui.state[5] == 2) {
						Gui.gewinner = 2;
						Draw.möglichkeit = 2;
					}
					// Reihe 3 für O - Horizontal
					if (Gui.state[6] == 2 && Gui.state[7] == 2 && Gui.state[8] == 2) {
						Gui.gewinner = 2;
						Draw.möglichkeit = 3;
					}
					// Reihe 1 für O - Vertikal
					if (Gui.state[0] == 2 && Gui.state[3] == 2 && Gui.state[6] == 2) {
						Gui.gewinner = 2;
						Draw.möglichkeit = 4;
					}
					// Reihe 2 für O - Vertikal
					if (Gui.state[1] == 2 && Gui.state[4] == 2 && Gui.state[7] == 2) {
						Gui.gewinner = 2;
						Draw.möglichkeit = 5;
					}
					// Reihe 3 für O - Horizontal
					if (Gui.state[2] == 2 && Gui.state[5] == 2 && Gui.state[8] == 2) {
						Gui.gewinner = 2;
						Draw.möglichkeit = 6;
					}
					// links oben nach rechts unten für O - Kreuz
					if (Gui.state[0] == 2 && Gui.state[4] == 2 && Gui.state[8] == 2) {
						Gui.gewinner = 2;
						Draw.möglichkeit = 7;
					}
					// links unten nach rechts oben für O - Kreuz
					if (Gui.state[6] == 2 && Gui.state[4] == 2 && Gui.state[2] == 2) {
						Gui.gewinner = 2;
						Draw.möglichkeit = 8;
					}

				}
			}
		}, 0, 150);
	}

}
