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
import javax.swing.border.EmptyBorder;

public class OptionsState extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void Start() {
		
					OptionsState frame = new OptionsState();
					frame.setVisible(true);
				
	}

	
	public OptionsState() {
		Image icon = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(icon);
		setTitle("Acuadoy");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//**************BACK**************
		JLabel lblBack = new JLabel("Back");
		lblBack.setForeground(Color.WHITE);
		lblBack.setBounds(887, 516, 97, 35);
		lblBack.setFont(new Font("Arial Black", Font.PLAIN, 27));
		lblBack.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				hide();
				MainMenu.Start();
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblBack.setFont(new Font("Arial Black", Font.PLAIN, 32));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblBack.setFont(new Font("Arial Black", Font.PLAIN, 27));
			}
		});
		contentPane.add(lblBack);
		
		
	}
}
