📄 Entrane & Questions - User Input Validation System
📄 Description - Exercise Statement
This Java project implements a robust input handling system with two main classes:

Entrance: Handles low-level input reading with exception management

Questions: Provides user-friendly prompts with validation

The system enforces proper data formatting and includes custom exceptions for invalid inputs in:

Character input (readChar)

String input (readString)

Yes/No questions (readSiNo)

Key features:

Automatic retry on invalid input

Locale-aware decimal number handling (forces '.' as decimal separator)

Custom exception classes for specific validation cases

💻 Technologies Used
Java 8+

java.util.Scanner with Locale.US configuration

Custom exception classes:

InvalidCharException

InvalidStringException

InvalidYesNoException

Input validation patterns

📋 Requirements
Java Development Kit (JDK) 8 or later

IDE (IntelliJ, Eclipse, or VS Code with Java extensions)

Basic understanding of:

Exception handling

Scanner class

Locale settings

🛠️ Installation
Verify Java installation:

sh
Copy
java -version
Clone the repository or download source files:

sh
Copy
git clone https://github.com/IgnaSubirachs/S1.02_Exceptions_Level2_Ex1.git
Import project into your IDE

Required files:

Copy
/src
Main.java
Entrada.java
Questions.java
InvalidCharException.java
InvalidStringException.java  
InvalidYesNoException.java
▶️ Execution
Compile all classes:

sh
Copy
javac *.java
Run the main program:

sh
Copy
java MainClass
Example interactions:

Copy
Enter a character: hello
Error: You must enter exactly one character

Enter text (letters only): 123
Error: Only letters and spaces allowed

Continue? (s/n): x
Error: Enter 's' for yes or 'n' for no

Enter a decimal number: 3.14

🛡️ Custom Exception Handling
The system throws these custom exceptions:

Exception Class	Thrown When
InvalidCharException	Input length ≠ 1 character
InvalidStringException	Input contains non-letter characters
InvalidYesNoException	Input ≠ 's' or 'n' (case insensitive)
All exceptions include automatic retry logic until valid input is received.

