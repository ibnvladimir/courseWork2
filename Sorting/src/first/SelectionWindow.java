<<<<<<< HEAD
package first;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class SelectionWindow {

	int choice;

	void show() {
		ImageIcon icon = new ImageIcon("src/first/1.png");
		String[] options = { "������ �����", "������������", };
		choice = JOptionPane.showOptionDialog(null, "��������� ��� ���������� ����� \n ������� ������� ����������",
				"���������� ����-17", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

}
=======
package first;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class SelectionWindow {

	int choice;

	void show() {
		ImageIcon icon = new ImageIcon("src/first/1.png");
		String[] options = { "������ �����", "������������", };
		choice = JOptionPane.showOptionDialog(null, "��������� ��� ���������� ����� \n ������� ������� ����������",
				"���������� ����-17", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

}
>>>>>>> branch 'master' of https://github.com/ibnvladimir/courseWork2.git
