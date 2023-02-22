import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanels extends JPanel {

	private String title;

	public MyPanels(String title) {
		super();
		this.title = title;
		setLayout(new BorderLayout());
		JPanel center = new JPanel(new GridLayout(0,2));
		MySection section1 = new MySection("Entrées", 4);
		MySection section2 = new MySection("Plats", 3);
		MySection section3 = new MySection("Desserts", 4);
		center.add(section1);
		center.add(section2);
		center.add(section3);
		

		this.setLayout(new BorderLayout());
		this.add(center, BorderLayout.CENTER);
		this.add(new JLabel(title), BorderLayout.NORTH); // mettre un JLabel

	}

}
