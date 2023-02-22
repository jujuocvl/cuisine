import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MySection extends JPanel {

	private int nbplat;
	private String titre;
	
	public MySection(String titre, int nbplat) { // on créer une classe qui va récupérer les infos de la méthode infos
		this.titre=titre;
		this.nbplat = nbplat;
		this.infos();
	}

	private void infos() { //on créer la méthode
		JPanel section = new JPanel(); // on créer le panel section
		section.setLayout(new GridLayout(1, 0)); // 1 ligne 2 colonnes //borderlayout plus pertinent pour avoir des colonnes de différentes tailles
		section.add(new JTextField(titre));
		section.add(new JTextField(nbplat));

	}
}

