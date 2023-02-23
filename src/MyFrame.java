import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel container = new JPanel();
	
	public MyFrame() {
		super();
		setUp();
	}
	
	private void setUp() {
		this.setTitle("Ma Cuisine");
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		//JLabel nom = new JLabel ("Ratatouille", JLabel.CENTER);
		container.setLayout(new GridLayout(3,0));
		container.add(new MyPanels("Selectionnez le menu"));
		
		//container.add(nom, BorderLayout.NORTH);
		this.add(container);
		this.setContentPane(container);
		this.setVisible(true); 
	}
}
