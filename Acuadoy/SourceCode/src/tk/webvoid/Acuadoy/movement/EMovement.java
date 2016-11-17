package tk.webvoid.Acuadoy.movement;

import java.util.Timer;
import java.util.TimerTask;

import tk.webvoid.Acuadoy.Var;

public class EMovement {
	Timer move;
	
	public EMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask(){

			
			public void run() {
				Var.ey = Var.y;
				
			}
			
		}, 0, 6);
	}

}
