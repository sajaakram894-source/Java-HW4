# Workshop Registration – Custom Exception Handling

This Java project demonstrates Custom Checked Exceptions using `throw`, `throws`, `try`, and `catch`.

The program is designed to register participants in a workshop. If the participant's age is less than 18, it throws a custom exception called `InvalidAgeException`. Otherwise, it displays a successful registration message.

**Classes:**
- `WorkshopRegistration`: Checks the participant's age and handles registration.
- `InvalidAgeException`: A custom checked exception that extends the `Exception` class.
- `WorkshopApp`: Contains the main method and tests the program using a try-catch block.

**Example:**
- Name: Ali
- Age: 16
- Result: Registration denied because the participant is under 18.

**Concepts Used:**
- Custom Checked Exceptions
- Inheritance
- throw and throws
- try-catch
- Constructors and super()

**Language:** Java
