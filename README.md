# Java Basics Examples

A collection of Java examples demonstrating fundamental programming concepts including object-oriented programming, interfaces, references, and exception handling.

## Quick Start

```bash
# Compile the project
mvn clean compile

# run
java -cp target/classes com.hac.Main
java -cp target/classes demoref.MainDemoRef
java -cp target/classes exceptions.Main
```

## Project Structure

This project contains three main packages with different examples:

### 1. `com.hac` - OOP and Interfaces
- **Main.java**: Demonstrates class instantiation, inheritance, and polymorphism
- **Ship.java**: Base class showing encapsulation with getters/setters
- **SuperShip.java**: Extends Ship to demonstrate inheritance
- **Printable.java**: Interface demonstrating polymorphism

### 2. `demoref` - References Explained
- **MainDemoRef.java**: Main class demonstrating how Java passes parameters
- **ReferencesExplained.java**: Shows the difference between pass-by-value and pass-by-reference behavior

### 3. `exceptions` - Exception Handling
- **Main.java**: Demonstrates exception handling
- **Pet.java**: Base class for pets
- **Dog.java**: Subclass showing custom exception usage
- **DogException.java**: Custom exception class

## Prerequisites

- Java 25 or higher
- Maven 3.6+ (recommended) OR Java JDK with javac command

## Building the Project

### Option 1: Using Maven (Recommended)

#### Compile the project
```bash
mvn clean compile
```

#### Package the project
```bash
mvn package
```

### Option 2: Using javac directly

#### Compile all files
```bash
javac -d out src/com/hac/*.java src/demoref/*.java src/exceptions/*.java
```

## Running the Examples


### Using Maven + Java (Recommended)

First, compile the project:
```bash
mvn clean compile
```

Then run the examples using the java command:

#### 1. Run the OOP Example (Ship/SuperShip)
```bash
# Run with default ship size (4)
java -cp target/classes com.hac.Main

# Run with custom ship size (e.g., 10)
java -cp target/classes com.hac.Main 10
```

**Expected Output:**
```
X=0, Y=0
navigating...SuperShip with speed: 4
X=100, Y=100
```

**Key Concepts Demonstrated:**
- Class instantiation and constructors
- Inheritance (SuperShip extends Ship)
- Interfaces (Printable)
- Method overriding (toString, print)
- Exception handling (IllegalArgumentException)

#### 2. Run the References Example
```bash
java -cp target/classes demoref.MainDemoRef
```

**Expected Output:**
```
null
Hello !
hi
hi there!
same code with safe getter:
hi
hi
```

**Key Concepts Demonstrated:**
- How String references are immutable
- How StringBuilder is mutable and can be modified
- Unsafe getter that exposes internal state
- Safe getter that returns a copy
- Pass-by-value vs pass-by-reference behavior in Java

#### 3. Run the Exception Handling Example
```bash
java -cp target/classes exceptions.Main
```

**Expected Output:**
```
bark bark!
Exception caught: Dog specy name cannot be null
```

**Key Concepts Demonstrated:**
- Try-catch blocks
- Custom exceptions (DogException)
- Exception propagation
- Abstract classes (Pet)
- Inheritance

### Alternative: Using Maven Exec Plugin

You can also use Maven's exec plugin, but you need to specify the main class:

```bash
# OOP Example
mvn exec:java@run-oop

# OOP Example with custom ship size (using -D argument)
mvn exec:java@run-oop -Dexec.args="10"

# References Example  
mvn exec:java@run-references

# Exceptions Example
mvn exec:java@run-exceptions
```

### Using javac directly (without Maven)

```bash
# OOP Example
java -cp out com.hac.Main

# References Example
java -cp out demoref.MainDemoRef

# Exceptions Example
java -cp out exceptions.Main
```

## Generating JavaDoc

### Using Maven
```bash
mvn javadoc:javadoc
```

The documentation will be generated in the `doc/` directory. Open `doc/index.html` in a browser to view.

### Using javadoc command directly
```bash
javadoc -d doc -sourcepath src -subpackages com.hac:demoref:exceptions
```

## Cleaning the Project

### Using Maven
```bash
mvn clean
```

This removes the `target/` directory and all compiled files.

### Manually
```bash
rm -rf out/ target/
```

## Learning Resources

Each example demonstrates important Java concepts:

1. **OOP Example**: Learn about classes, objects, inheritance, interfaces, and polymorphism
2. **References Example**: Understand how Java handles object references and why String is immutable
3. **Exceptions Example**: Learn proper exception handling and creating custom exceptions

## Project Configuration

- **Java Version**: 25
- **Build Tool**: Maven 3.x
- **Testing Framework**: JUnit 5.8.0-M1 (configured but tests not yet implemented)
- **Encoding**: UTF-8

## IDE Support

This project includes:
- `01-java-basics.iml` for IntelliJ IDEA
- `pom.xml` for Maven integration

You can import this project into any Java IDE that supports Maven projects.

## Notes for Students

- Each main class can be run independently
- Read the JavaDoc comments in the source files for detailed explanations
- Try modifying the examples to experiment with different behaviors
- Use the debugger to step through the code and observe how references work
- The exceptions example shows why null checking is important

## Common Issues

### Issue: "Command not found: mvn"
**Solution**: Install Maven or use the javac/java commands instead.

### Issue: Compilation errors
**Solution**: Ensure you're using Java 25 or higher:
```bash
java -version
javac -version
```

### Issue: Cannot find main class
**Solution**: Make sure you've compiled the project first and you're using the correct classpath.

## Author

This project is part of the Java-Spring course teaching materials.

## License

Educational use only.

