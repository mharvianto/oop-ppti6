package ppti.oop.menu;

public class MainClass {

	public static void main(String[] args) {
		new Menu("Main menu", new String[] { "Teacher menu", "Student menu", "exit" }) {
			@Override
			protected void initOperation() {
				addOperation(() -> {
					new TeacherMenu();
				});
				addOperation(() -> {
					new StudentMenu();
				});
				addOperation(() -> {
				});
			}
		};
	}

}
