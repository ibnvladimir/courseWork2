package first;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class SelectionWindow {

	int choice;

	void show() {
		ImageIcon icon = new ImageIcon("src/first/1.png");
		String[] options = { "Ввести числа", "Демонстрация", };
		choice = JOptionPane.showOptionDialog(null, "Программа для сортировка чисел \n методом ГНОМЬЕЙ СОРТИРОВКИ",
				"Введенский БИоз-17", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

}
