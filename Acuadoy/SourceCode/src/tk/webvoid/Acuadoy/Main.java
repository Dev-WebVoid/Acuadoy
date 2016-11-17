package tk.webvoid.Acuadoy;

import tk.webvoid.Acuadoy.gfx.Gui;
import tk.webvoid.Acuadoy.gfx.states.MainMenu;
import tk.webvoid.Acuadoy.gfx.states.StartScreen;

public class Main {

	public static void main(String[] args) {
		Gui.setTitle("Acaudoy");
		StartScreen.Start();
		MainMenu.Start();

	}

}
