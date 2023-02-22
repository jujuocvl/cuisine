import java.awt.*;
import javax.swing.*;

public class MaCuisine extends JFrame {
	//création des panels pour chaque entrées, plats et desserts
	private JPanel panele1 = new JPanel();
	private JPanel panele2 = new JPanel();
	private JPanel panele3 = new JPanel();
	private JPanel panele4 = new JPanel();
	private JPanel panelp1 = new JPanel();
	private JPanel panelp2 = new JPanel();
	private JPanel panelp3 = new JPanel();
	private JPanel panelp4 = new JPanel();
	private JPanel paneld1 = new JPanel();
	private JPanel paneld2 = new JPanel();
	private JPanel paneld3 = new JPanel();
	private JPanel paneld4 = new JPanel();

	//on def la dimension des panels
	private Dimension dim = new Dimension(175, 40);

	//création des Labels (permettre de faire des titres fixent)
	private JLabel entree = new JLabel();
	private JLabel plat = new JLabel();
	private JLabel dessert = new JLabel();

	//création des textfield pour le nom des plats + qté
	/*
	JTextField nome1 = new JTextField("Entrée 1");
	JTextField qtee1 = new JTextField("qté:");
	JTextField nome2 = new JTextField("Entrée 2");
	JTextField qtee2 = new JTextField("qté:");
	JTextField nome3 = new JTextField("Entrée 3");
	JTextField qtee3 = new JTextField("qté:");
	JTextField nome4 = new JTextField("Entrée 4");
	JTextField qtee4 = new JTextField("qté:");
	/*
	 * 
	 */
//	for (int j=0; j<4;j++) {
//		JTextField nomp = new JTextField("Plat" +j);
//		JTextField qtep = new JTextField("qté:");
//		System.out.println(nomp);
//		}

	JTextField nomp1 = new JTextField("Plat 1");
	JTextField qtep1 = new JTextField("qté:");
	JTextField nomp2 = new JTextField("Plat 2");
	JTextField qtep2 = new JTextField("qté:");
	JTextField nomp3 = new JTextField("Plat 3");
	JTextField qtep3 = new JTextField("qté:");
	JTextField nomp4 = new JTextField("Plat 4");
	JTextField qtep4 = new JTextField("qté:");

	JTextField nomd1 = new JTextField("Dessert 1");
	JTextField qted1 = new JTextField("qté:");
	JTextField nomd2 = new JTextField("Dessert 2");
	JTextField qted2 = new JTextField("qté:");
	JTextField nomd3 = new JTextField("Dessert 3");
	JTextField qted3 = new JTextField("qté:");
	JTextField nomd4 = new JTextField("Dessert 4");
	JTextField qted4 = new JTextField("qté:");


	public MaCuisine() {
		this.setSize(550, 800);
		this.setTitle("Ma Cuisine");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		initComposant();
		this.setContentPane(panele1);
		this.setContentPane(panele2);
		this.setContentPane(panele3);
		this.setContentPane(panele4);
		this.setContentPane(panelp1);
		this.setContentPane(panelp2);
		this.setContentPane(panelp3);
		this.setContentPane(panelp4);
		this.setContentPane(paneld1);
		this.setContentPane(paneld2);
		this.setContentPane(paneld3);
		this.setContentPane(paneld4);
		this.setVisible(true);
	}

	private void initComposant(){
		entree = new JLabel("Entrées");
		entree.setBackground(Color.WHITE);
		plat = new JLabel("Plats");
		plat.setBackground(Color.WHITE);
		dessert = new JLabel("Desserts");
		dessert.setBackground(Color.WHITE);

		//On aligne les informations à gauche dans le JLabel
		entree.setHorizontalAlignment(JLabel.LEFT);
		plat.setHorizontalAlignment(JLabel.LEFT);
		dessert.setHorizontalAlignment(JLabel.LEFT);
		entree.setPreferredSize(new Dimension(530, 40));
		plat.setPreferredSize(new Dimension(530, 40));
		dessert.setPreferredSize(new Dimension(530, 40));

		//panel avec toutes les entrées/plats/desserts
		JPanel entrees = new JPanel();      
		entrees.setPreferredSize(new Dimension(530, 250));
		JPanel plats = new JPanel();
		plats.setPreferredSize(new Dimension(530, 250));
		JPanel desserts = new JPanel();
		dessert.setPreferredSize(new Dimension(530, 250));

		//pour mettre un panel au dessus de l'autre = card layout

	}
}
