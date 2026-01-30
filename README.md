# Exception_Handling-
# Exception Handling & Custom Exceptions (Java)

# Project Overview
This project demonstrates **Exception Handling in Java** using both
**built-in exceptions** and a **custom user-defined exception**.
It is created as part of the **Java Developer Internship – Task 10**.

# Objectives
- Understand runtime and checked exceptions
- Handle exceptions using `try-catch-finally`
- Create and use a **custom exception**
- Differentiate between `throw` and `throws`
- Implement meaningful error messages
- Log exceptions properly

#  Project Structure:
* Exception-Handling/ ── src/InvalidAgeException.java ── Main.java

#  Program Description
- Takes user input for age
- Validates age using a **custom checked exception**
- Handles runtime exceptions like invalid input
- Uses `finally` block for cleanup
- Logs errors using Java Logger


# Exception Handling Used
- `InvalidAgeException` (Custom Checked Exception)
- `InputMismatchException` (Runtime Exception)

# How to Run
1. Clone the repository
2. Compile the Java files
3. Run `Main.java`
4. Enter age input when prompted

# Output Example:
Enter your age: 16 Error: Age must be 18 or above. Program execution completed.
