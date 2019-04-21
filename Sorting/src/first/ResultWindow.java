package first;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ResultWindow {

	String tempString = "";
	String tempString2 = "";

	void show(ArrayConstruct arr) {

		JFrame frame = new JFrame("Результаты сортировки");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		frame.add(p);
		p.setLayout(new GridLayout(7, 0));

		JLabel empty = new JLabel(" ");
		JLabel empty1 = new JLabel(" ");
		JLabel header = new JLabel("Количество элементов в массиве = " + arr.getQuantity());
		JLabel originalArrayLabel = new JLabel("Элементы оригинального массива:");

		for (int i = 0; i < arr.getQuantity(); i++) {
			tempString += arr.getDuplicateonArray()[i];
			tempString += ";  ";
		}
		JLabel originalArray = new JLabel(tempString);
		JLabel sortedArrayLabel = new JLabel("Массив в отсортированном виде:");
		for (int i = 0; i < arr.getQuantity(); i++) {
			tempString2 += arr.getOriginArray()[i];
			tempString2 += ";  ";
		}
		JLabel sortedArray = new JLabel(tempString2);

		p.add(header);
		p.add(empty);
		p.add(originalArrayLabel);
		p.add(originalArray);
		p.add(empty1);
		p.add(sortedArrayLabel);
		p.add(sortedArray);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}
