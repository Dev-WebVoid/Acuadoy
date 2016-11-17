package tk.webvoid.Acuadoy.gfx;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import tk.webvoid.Acuadoy.Var;

@SuppressWarnings("serial")
public class Draw extends JLabel{

	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
		
		g.setColor(Color.WHITE);

		g.setColor(Color.CYAN);
		g.drawRect(Var.x, Var.y, 25, 150);
		g.drawRect(Var.ex, Var.ey, 25, 150);
		g.setColor(Color.WHITE);
		Font font = new Font("Arial",Font.PLAIN,70);
		g.setFont(font);
		g.drawString("" + Var.PP, Var.screenwidth/2 - 19, 75);
		
		g.setColor(Color.CYAN);
		g.drawRect(Var.BX, Var.BY, 20, 20);

	
		
		repaint();
	}
	


}
