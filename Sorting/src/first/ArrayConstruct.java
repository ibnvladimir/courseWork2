package first;

import javax.swing.JOptionPane;

class ArrayConstruct {

	private int quantity; // кол-во элементов в массиве
	private double[] originArray; // сам массив, его и будем сортировать

	private double[] duplicateonArray; // дубликат массива

	private int i = 0; // счетчик массива, чтоб можно было
						// после Exception спокойно заполнить с того места
						// где прервались

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

	// заполнение массива при "демонстрации"
	void fillAtRandom() {
		setQuantity(10);
		setOriginArray(new double[quantity]);
		for (int i = 0; i < quantity; i++) {
			int tempVar = (int) (Math.random() * 10000);
			double tempVar2 = (double) tempVar / 100;
			originArray[i] = tempVar2;
		}
	}

	// заполнение массива пользователем
	void inputByUser() {
		tempString = JOptionPane.showInputDialog(null, "—колько элементов будет в массиве",
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
			JOptionPane.showMessageDialog(null, "¬ведите число");
			inputByUser();
		}

		if (inputQuantity < 2) {
			JOptionPane.showMessageDialog(null, "¬ведите целое число большее 1");
			inputByUser();
		}
	}

	private void fillByUser() {
		for (; i < quantity; i++) {
			tempString = JOptionPane.showInputDialog(null, "¬ведите " + (i + 1) + " элемент массива",
					JOptionPane.QUESTION_MESSAGE);
			if (tempString != null) {
				try {
					inputElement = Double.valueOf(tempString);
					getOriginArray()[i] = inputElement;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "¬ведите число");
					fillByUser();
				}
			}
		}
	}

	// создание копии массива
	void createDuplicate() {
		duplicateonArray = originArray.clone();
	}

	// сортировка изначального массива
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
