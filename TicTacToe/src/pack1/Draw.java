package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Draw extends JLabel {
	static int möglichkeit = 0;
	@SuppressWarnings("unused")
	private static final long serialVerionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// draw//
		g.setColor(new Color(255, 230, 204));
		g.fillRect(0, 0, 800, 600);

		g.setColor(Color.BLACK);

		// Vertikal
		g.drawLine(175, 50, 175, 500);
		g.drawLine(325, 50, 325, 500);
		g.drawLine(475, 50, 475, 500);
		g.drawLine(625, 50, 625, 500);

		// Horizontal
		g.drawLine(175, 50, 625, 50);
		g.drawLine(175, 200, 625, 200);
		g.drawLine(175, 350, 625, 350);
		g.drawLine(175, 500, 625, 500);

		// Draw Player
		g.setColor(Color.BLACK);
		if (Gui.player == 0) {
			g.drawString("Spieler: "+Main.spieler1, 25, 50);
			g.drawString("Zeichen: X", 25, 75);
		} else if (Gui.player == 1) {
			g.drawString("Spieler: "+Main.spieler2, 25, 50);
			g.drawString("Zeichen: O", 25, 75);
		}

		// Draw gewinner
		if (Gui.gewinner == 1) {
			g.drawString("Gewinner: "+Main.spieler1, 25, 125);
		} else if (Gui.gewinner == 2) {
			g.drawString("Gewinner: "+Main.spieler2, 25, 125);
		}

		// Reihe 1
		if (Gui.state[0] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 50, 150, 150, null);
		} else if (Gui.state[0] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 50, 150, 150, null);
		}

		if (Gui.state[1] == 1) {
			g.drawImage(ImageLoader.imgX, 175 + 150, 50, 150, 150, null);
		} else if (Gui.state[1] == 2) {
			g.drawImage(ImageLoader.imgO, 175 + 150, 50, 150, 150, null);
		}

		if (Gui.state[2] == 1) {
			g.drawImage(ImageLoader.imgX, 175 + 150 * 2, 50, 150, 150, null);
		} else if (Gui.state[2] == 2) {
			g.drawImage(ImageLoader.imgO, 175 + 150 * 2, 50, 150, 150, null);
		}

		// Reihe 2
		if (Gui.state[3] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 200, 150, 150, null);
		} else if (Gui.state[3] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 200, 150, 150, null);
		}

		if (Gui.state[4] == 1) {
			g.drawImage(ImageLoader.imgX, 175 + 150, 200, 150, 150, null);
		} else if (Gui.state[4] == 2) {
			g.drawImage(ImageLoader.imgO, 175 + 150, 200, 150, 150, null);
		}

		if (Gui.state[5] == 1) {
			g.drawImage(ImageLoader.imgX, 175 + 150 * 2, 200, 150, 150, null);
		} else if (Gui.state[5] == 2) {
			g.drawImage(ImageLoader.imgO, 175 + 150 * 2, 200, 150, 150, null);
		}

		// Reihe 3
		if (Gui.state[6] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 350, 150, 150, null);
		} else if (Gui.state[6] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 350, 150, 150, null);
		}

		if (Gui.state[7] == 1) {
			g.drawImage(ImageLoader.imgX, 175 + 150, 350, 150, 150, null);
		} else if (Gui.state[7] == 2) {
			g.drawImage(ImageLoader.imgO, 175 + 150, 350, 150, 150, null);
		}

		if (Gui.state[8] == 1) {
			g.drawImage(ImageLoader.imgX, 175 + 150 * 2, 350, 150, 150, null);
		} else if (Gui.state[8] == 2) {
			g.drawImage(ImageLoader.imgO, 175 + 150 * 2, 350, 150, 150, null);
		}
		if (möglichkeit == 1) {
			g.drawLine(175, 125, 625, 125);
		}
		if (möglichkeit == 2) {
			g.drawLine(175, 275, 625, 275);
		}
		if (möglichkeit == 3) {
			g.drawLine(175, 425, 625, 425);
		}
		if (möglichkeit == 4) {
			g.drawLine(250, 50, 250, 500);
		}
		if (möglichkeit == 5) {
			g.drawLine(400, 50, 400, 500);
		}
		if (möglichkeit == 6) {
			g.drawLine(550, 50, 550, 500);
		}
		if (möglichkeit == 7) {
			g.drawLine(175, 50, 625, 500);
		}
		if (möglichkeit == 8) {
			g.drawLine(175, 500, 625, 50);
		}

		repaint();
	}
}
