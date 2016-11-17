package tk.webvoid.Acuadoy.gfx;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import tk.webvoid.Acuadoy.Var;
import tk.webvoid.Acuadoy.input.KeyHandler;

public class Gui {
	private static String title;
	public Gui(){


		Var.frame = new JFrame();
		Image icon = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		Var.frame.setIconImage(icon);
		Var.frame.setSize(Var.screenwidth, Var.screenheight);
		Var.frame.setTitle(title);
		Var.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.frame.setLayout(null);
		Var.frame.setResizable(false);
		Var.frame.setVisible(true);
		Var.frame.setLocationRelativeTo(null);
		Var.frame.addKeyListener(new KeyHandler());
		Var.frame.requestFocus();
		
		Draw lblDraw = new Draw();
		lblDraw.setBounds(0, 0, Var.screenwidth, Var.screenheight);
		lblDraw.setVisible(true);
		Var.frame.add(lblDraw);
		
	}
	public static void setTitle(String title) {
		Gui.title = title;
	}
	
}
