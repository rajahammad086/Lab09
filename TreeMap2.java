
// Raja Hammad Mehmood.
// This program shows add, find, and remove for a tree Map.
import java.util.TreeMap;
import java.util.Scanner;

public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tree = new TreeMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"0. Quit\n" + "1. Add someone\n" + "2. Find someone\n" + "3. Remove someone\n" + "Enter your choice:");
		int choice = scanner.nextInt();

		while (choice != 0) {
			if (choice == 1) {
				System.out.println("Enter the integer ID:");
				int id = scanner.nextInt();
				System.out.println("Enter the name:");
				scanner.nextLine();
				String name = scanner.nextLine();
				tree.put(id, name);
			} else if (choice == 2) {
				if(tree.isEmpty()==true) {
					System.out.println("There's nothing in the list!");
				}
				else {
				System.out.println("Enter the integer ID:");
				int id = scanner.nextInt();
				System.out.println("That person is " + tree.get(id));
				}
			} else {
				if(tree.isEmpty()==true) {
					System.out.println("There's nothing in the list!");
				}
				else {
				System.out.println("Enter the integer ID:");
				int id = scanner.nextInt();
				tree.remove(id);
				}
			}

			System.out.println("0. Quit\n" + "1. Add someone\n" + "2. Find someone\n" + "3. Remove someone\n"
					+ "Enter your choice:");
			choice = scanner.nextInt();

		}

	}
}

















