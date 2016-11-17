package tk.webvoid.Acuadoy.gfx.states;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import tk.webvoid.Acuadoy.Var;

public class MainMenu extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static void Start() {
		
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				
	}

	
	public MainMenu() {
		setTitle("Acuadoy");
		Image icon = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(icon);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Var.screenwidth,Var.screenheight);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlayGame = new JLabel("Play Game");
		lblPlayGame.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				GameState.Start();
				hide();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPlayGame.setFont(new Font("Arial Black", Font.PLAIN, 32));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPlayGame.setFont(new Font("Arial Black", Font.PLAIN, 27));
			}
		});
		lblPlayGame.setFont(new Font("Arial Black", Font.PLAIN, 27));
		lblPlayGame.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlayGame.setForeground(Color.WHITE);
		lblPlayGame.setBounds(5, 108, 204, 52);
		contentPane.add(lblPlayGame);
		//****CONTROLES BUTTON*******
		JLabel lblControls = new JLabel("Controls");
		lblControls.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
			ControlState.Start();
			hide();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblControls.setFont(new Font("Arial Black", Font.PLAIN, 32));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblControls.setFont(new Font("Arial Black", Font.PLAIN, 27));
			}
		});
		lblControls.setFont(new Font("Arial Black", Font.PLAIN, 27));
		lblControls.setHorizontalAlignment(SwingConstants.LEFT);
		lblControls.setForeground(Color.WHITE);
		lblControls.setBounds(5, 160, 204, 52);
		contentPane.add(lblControls);
		//*******OPTIONS BUTTON*********
		JLabel lblOptions = new JLabel("Options");
		lblOptions.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				OptionsState.Start();
				hide();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblOptions.setFont(new Font("Arial Black", Font.PLAIN, 32));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblOptions.setFont(new Font("Arial Black", Font.PLAIN, 27));
			}
		});
		lblOptions.setFont(new Font("Arial Black", Font.PLAIN, 27));
		lblOptions.setHorizontalAlignment(SwingConstants.LEFT);
		lblOptions.setForeground(Color.WHITE);
		lblOptions.setBounds(5, 212, 204, 63);
		contentPane.add(lblOptions);
		
		//******EXIT BUTTON**********
		JLabel lblExit = new JLabel("Exit");
		lblExit.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
			System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setFont(new Font("Arial Black", Font.PLAIN, 32));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setFont(new Font("Arial Black", Font.PLAIN, 27));
			}
		});
		lblExit.setFont(new Font("Arial Black", Font.PLAIN, 27));
		lblExit.setHorizontalAlignment(SwingConstants.LEFT);
		lblExit.setForeground(Color.WHITE);
		lblExit.setBounds(5, 265, 204, 52);
		contentPane.add(lblExit);
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1000, 600);
		Image img = new ImageIcon(this.getClass().getResource("/MainMenu.png")).getImage();
		label.setIcon(new ImageIcon(img));
		contentPane.add(label);
	}
}

