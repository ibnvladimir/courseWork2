<<<<<<< HEAD
package first;

public class Begin {

	public void run() {
		SelectionWindow beginWindow = new SelectionWindow();
		beginWindow.show();

		ArrayConstruct arr = new ArrayConstruct();
		arr.whichWay(beginWindow);
		arr.createDuplicate();
		arr.sorting();
		ResultWindow result = new ResultWindow();
		result.show(arr);
	}

	public static void main(String[] args) {
		Begin courseWork = new Begin();
		courseWork.run();
	}

}
=======
package first;

public class Begin {

	public void run() {
		SelectionWindow beginWindow = new SelectionWindow();
		beginWindow.show();

		ArrayConstruct arr = new ArrayConstruct();
		arr.whichWay(beginWindow);
		arr.createDuplicate();
		arr.sorting();
		ResultWindow result = new ResultWindow();
		result.show(arr);
	}

	public static void main(String[] args) {
		Begin courseWork = new Begin();
		courseWork.run();
	}

}
>>>>>>> branch 'master' of https://github.com/ibnvladimir/courseWork2.git
