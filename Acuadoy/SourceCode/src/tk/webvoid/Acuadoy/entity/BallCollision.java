package tk.webvoid.Acuadoy.entity;

import java.util.Timer;
import java.util.TimerTask;

import tk.webvoid.Acuadoy.Var;

public class BallCollision {
	Timer collision;
	public BallCollision() {
		collision = new Timer();
		collision.scheduleAtFixedRate(new TimerTask() {



		public void run() {
			
			if(Var.BY +50 >=Var.screenheight){
				Var.bdy = -1;
			}
			if(Var.BY <= 0){
				Var.bdy = 1;
			}
			if(Var.BX + 20 >= Var.screenwidth){
				Var.BX = Var.screenwidth/2 -10;
				Var.BY = Var.screenheight/2 -10;
			
				
				
				Var.bdx = -1;
//				Var.PP -= 2;
				if(Var.PP <= 0){
					Var.PP = 0;
				}else if( Var.PP<=1){
					Var.PP -= 1;
				}else if( Var.PP>=2){
					Var.PP -= 2;
				}
			}
			if(Var.BX <= 0){
				Var.BX = Var.screenwidth/2 -10;
				Var.BY = Var.screenheight/2 -10;
			
				
				Var.bdx = 1;
//				Var.PP -= 2;
				if(Var.PP <= 0){
					Var.PP += 0;
				}else if( Var.PP<=1){
					Var.PP -= 1;
				}else if( Var.PP>=2){
					Var.PP -= 2;
				}
			}
			if(Var.BX < Var.x + 25 && Var.BY >Var.y && Var.BY < Var.y+150){
				Var.bdx = 1;
				Var.PP += 1;
				try {
					Thread.sleep(25);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(Var.BX > Var.ex -25 && Var.BY >Var.ey && Var.BY < Var.ey+150){
				Var.bdx = -1;
				Var.PP += 1;
				try {
					Thread.sleep(25);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}, 0, 4);
	}
	}


