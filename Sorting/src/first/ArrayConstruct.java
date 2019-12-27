
package first;

import javax.swing.JOptionPane;

class ArrayConstruct {

	private int quantity; // ���-�� ��������� � �������
	private double[] originArray; // ��� ������, ��� � ����� �����������

	private double[] duplicateonArray; // �������� �������

	private int i = 0; // ������� �������, ���� ����� ����
						// ����� Exception �������� ��������� � ���� �����
						// ��� ����������

	private int inputQuantity;
	private String tempString;
	private double inputElement;

	void whichWay(SelectionWindow beginWindow) {
		if (beginWindow.getChoice() == 0) {
			inputByUser();
		} else if (beginWindow.getChoice() == 1) {
			fillAtRandom();
		}
	}

	// ���������� ������� ��� "������������"
	void fillAtRandom() {
		setQuantity(10);
		setOriginArray(new double[quantity]);
		for (int i = 0; i < quantity; i++) {
			int tempVar = (int) (Math.random() * 10000);
			double tempVar2 = (double) tempVar / 100;
			originArray[i] = tempVar2;
		}
	}

	// ���������� ������� �������������
	void inputByUser() {
		tempString = JOptionPane.showInputDialog(null, "������� ��������� ����� � �������",
				JOptionPane.QUESTION_MESSAGE);

		if (tempString != null) {
			validationOfInput();
			setQuantity(inputQuantity);
			setOriginArray(new double[quantity]);
			fillByUser();
		}
	}

	private void validationOfInput() {
		try {
			inputQuantity = Integer.valueOf(tempString);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "������� �����");
			inputByUser();
		}

		if (inputQuantity < 2) {
			JOptionPane.showMessageDialog(null, "������� ����� ����� ������� 1");
			inputByUser();
		}
	}

	private void fillByUser() {
		for (; i < quantity; i++) {
			tempString = JOptionPane.showInputDialog(null, "������� " + (i + 1) + " ������� �������",
					JOptionPane.QUESTION_MESSAGE);
			if (tempString != null) {
				try {
					inputElement = Double.valueOf(tempString);
					getOriginArray()[i] = inputElement;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "������� �����");
					fillByUser();
				}
			}
		}
	}

	// �������� ����� �������
	void createDuplicate() {
		duplicateonArray = originArray.clone();
	}

	// ���������� ������������ �������
	void sorting() {
		for (int j = 1; j < quantity;) {
			if (originArray[j - 1] <= originArray[j]) {
				j++;
			} else {
				double tempVar = originArray[j];
				originArray[j] = originArray[j - 1];
				originArray[j - 1] = tempVar;
				j--;
				if (j == 0) {
					j = 1;
				}
			}
		}
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public double[] getOriginArray() {
		return originArray;
	}

	public void setOriginArray(double[] oroginArray) {
		this.originArray = oroginArray;
	}

	public double[] getDuplicateonArray() {
		return duplicateonArray;
	}

}
