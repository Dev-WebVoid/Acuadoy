package tk.webvoid.Acuadoy.movement;

import java.util.*;

import tk.webvoid.Acuadoy.Var;

public class Movement {

	Timer move;
	
	public Movement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask(){

			
			public void run() {
				
			if(Var.moveup == true){
				if(Var.y >= 20){
					Var.y-= 2;
				}
			}else if(Var.movedown == true){
				if(Var.y <= Var.screenheight -200){
					Var.y += 2;
				}
				
			}
				
			}
			
		}, 0, 6);
	}

}
