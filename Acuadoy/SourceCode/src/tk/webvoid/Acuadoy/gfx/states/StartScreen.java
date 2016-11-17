package tk.webvoid.Acuadoy.gfx.states;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class StartScreen extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	@SuppressWarnings("deprecation")
	public static void Start(){
		
					StartScreen frame = new StartScreen();
					frame.setVisible(true);
					try {
						Thread.sleep(2000);
						frame.hide();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	}

	
	public StartScreen() {
		Image icon = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(icon);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/StartImage.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 600, 350);
		contentPane.add(lblNewLabel);
		
	}

}
