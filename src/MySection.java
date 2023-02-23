import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MySection extends JPanel {

	private static final long serialVersionUID = 1L;
	private String titre;
	private int qte;
	
	public MySection(String titre, int qte) {
		super();// on créer une classe qui va récupérer les infos de la méthode infos
		setLayout(new GridLayout(1, 0));
		this.titre=titre;
		this.qte = qte;
		setUp();
	}

	public void setUp() {
		JTextField title=new JTextField(titre);
		JTextField qty=new JTextField(Integer.toString(qte));
		add(title);
		add(qty);
		if(titre.equals("Entrées")) {
			title.setBackground(Color.green);
			qty.setBackground(Color.green);
		}
		if(titre.equals("Plats")) {
			title.setBackground(Color.red);
			qty.setBackground(Color.red);
		}
		if(titre.equals("Desserts")) {
			title.setBackground(Color.pink);
			qty.setBackground(Color.pink);
		}
	}
}

