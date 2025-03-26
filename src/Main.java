
public class Main {
	public static void main(String[] args) {
		byte age = Entrance.readByte("Enter your age:");
		int number = Entrance.readInt("Enter an integer:");
		float height = Entrance.readFloat("Enter your height:");
		double weight = Entrance.readDouble("Enter your weight:");
		try {
			char letter = Entrance.readChar("Enter a character:");
			System.out.println("Character entered: " + letter);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String name = Entrance.readString("Enter your name:");
		boolean confirm = Entrance.readYesNo("Do you want to continue?");

		System.out.println("Summary:");
		System.out.println("Age: " + age);
		System.out.println("Number: " + number);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Name: " + name);
		System.out.println("Continue: " + (confirm ? "Yes" : "No"));
	}
}
		
		
		
