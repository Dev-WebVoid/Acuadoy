package tk.webvoid.Acuadoy.gfx.states;

import tk.webvoid.Acuadoy.Var;
import tk.webvoid.Acuadoy.entity.BallCollision;
import tk.webvoid.Acuadoy.entity.BallMovement;
import tk.webvoid.Acuadoy.gfx.Gui;
import tk.webvoid.Acuadoy.movement.EMovement;
import tk.webvoid.Acuadoy.movement.Movement;

public class GameState {
	
	public static  void Start() {
		new Gui();
		new Var();
		new Movement();
		new EMovement();
		new BallMovement();
		new BallCollision();
	}
	
}
