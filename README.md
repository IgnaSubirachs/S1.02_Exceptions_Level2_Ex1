📄 Description - Exercise Statement

Create a class called "Entrance". This class should handle different exceptions that may occur in Java when entering data via the keyboard using the Scanner class.

The first step is to instantiate an object of the Scanner class and then create static methods to read different types of data from the keyboard.

**Important**

It is crucial to handle exceptions in each method and prompt the user to enter the data again until it is correctly formatted. For example, if a float is entered with a dot instead of a comma, the program should display "Format error" and continue prompting the user until the correct format is provided.

All methods receive a String with a message to be displayed to the user, such as "Enter your age," and return the appropriate user input in each case, e.g., a byte representing the user's age.

Methods that capture the `InputMismatchException` exception:

```java
public static byte readByte(String missatge);
public static int readInt(String missatge);
public static float readFloat(String missatge);
public static double readDouble(String missatge);
```

Methods that capture a custom exception of the `Exception` class:

```java
public static char readChar(String missatge);
public static String readString(String missatge);
public static boolean readYesNo(String missatge); // If the user enters "s", it returns `true`; if "n", it returns `false`.
```

💻 Technologies Used

- Java
- Scanner Class
- Exception Handling (InputMismatchException, Custom Exceptions)

📋 Requirements

- Java Development Kit (JDK) version 8 or higher
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)
- Basic understanding of Java programming and exception handling

🛠️ Installation

1. Ensure you have Java installed on your system. You can verify this by running:
   ```sh
   java -version
   ```
2. Clone this repository or download the project files.
3. Open the project in your preferred Java IDE.
4. Compile the Java files using:
   ```sh
   javac Entrance.java
   ```

▶️ Execution

1. Run the compiled Java program with:
   ```sh
   java Entrance
   ```
2. Follow the on-screen instructions to enter various data types.
3. Handle any errors prompted by incorrect input formatting.

