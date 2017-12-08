package pack1;

public class ButtonPlacement {

	public static void place(){
		int g = 150;
		int x = 175;
		int y = 50;
		//1.Reihe
		Gui.btn[0].setBounds(x,y,g,g);
		Gui.btn[1].setBounds(x+g,y,g,g);
		Gui.btn[2].setBounds(x+g*2,y,g,g);
		//2.Reihe
		Gui.btn[3].setBounds(x,y+g,g,g);
		Gui.btn[4].setBounds(x+g, y+g, g, g);
		Gui.btn[5].setBounds(x+g*2, y+g, g, g);
		//3.Reihe
		Gui.btn[6].setBounds(x, y+g*2, g, g);
		Gui.btn[7].setBounds(x+g, y+g*2, g, g);
		Gui.btn[8].setBounds(x+g*2, y+g*2, g, g);
	}

}
