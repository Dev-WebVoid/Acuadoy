package tk.webvoid.Acuadoy.entity;

import java.util.Timer;
import java.util.TimerTask;

import tk.webvoid.Acuadoy.Var;

public class BallMovement {

	Timer move;
	public BallMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask(){

			
			public void run() {
				Var.BX += Var.bdx;
				Var.BY += Var.bdy;
			}
			
		}, 0, 4);
	}

}
