# Mini_Projects_Using_JAVA
Mini Projects Using JAVA

1. CHEMISTRY PERIODIC TABLE GENERATOR & THE ELEMENT'S PROPERTIES GENERATOR.
2. RANDAM NUMBER GENERATOR

---------------------------------------------------------------------------------------------------------------------------------------------------------

# Java Console Applications

This repository contains two Java console applications: a Modern Periodic Table and a Random Number Generator. Both applications demonstrate different aspects of Java programming and provide interactive user experiences through the command line interface.

## 1. Modern Periodic Table (`PeriodicTable.java`)

### Overview
The Modern Periodic Table application is a comprehensive program that provides detailed information about chemical elements. It uses object-oriented programming principles to organize and display element data.

### Structure

#### Element Class
```java
class Element {
    String name;
    String symbol;
    int atomicNumber;
    String electronicConfiguration;
    String discoveredBy;
    String charge;
}
```
- The `Element` class serves as a blueprint for chemical elements
- Each element instance stores six key properties: name, symbol, atomic number, electronic configuration, discoverer, and charge
- Contains a `displayDetails()` method to print element information in a formatted manner

#### Main Class (PeriodicTable)
- Contains a database of all 118 elements in the periodic table
- Elements are stored in an array where the index position corresponds to (atomic number - 1)
- Implements an interactive menu system for user interaction

### Features
1. **Element Database**: Contains complete information for all 118 elements
2. **Search Functionality**: Allows users to search for elements by atomic number
3. **Detailed Information Display**: Shows comprehensive details about each element
4. **User-Friendly Interface**: Simple menu system with clear options
5. **Input Validation**: Ensures atomic numbers are within valid range (1-118)

### Program Flow
1. Displays welcome message and menu options
2. User can choose to:
   - Search for an element (Option 1)
   - Exit the application (Option 2)
3. When searching:
   - Enter atomic number
   - View detailed element information
4. When exiting:
   - Confirm exit choice
   - Receive appropriate closing message

## 2. Random Number Generator (`RandomNumberGenerator.java`)

### Overview
A versatile random number generator that allows users to generate multiple random numbers within a specified range. The application demonstrates the use of Java's `Random` class and implements a loop-based menu system.

### Structure
The application is contained in a single class that handles:
- User input processing
- Random number generation
- Result display
- Program flow control

### Features
1. **Customizable Range**: Users can specify minimum and maximum values
2. **Multiple Number Generation**: Generate any quantity of random numbers in one go
3. **Input Validation**: Ensures valid ranges and counts
4. **Continuous Operation**: Users can generate multiple sets without restarting
5. **User-Friendly Interface**: Clear prompts and formatted output

### Program Flow
1. Welcome message displayed
2. Main program loop begins:
   - User inputs minimum value
   - User inputs maximum value
   - Range validation occurs
   - User specifies quantity of numbers
   - Numbers are generated and displayed
3. After generation:
   - Option to generate more numbers
   - Option to exit program
4. Program continues until user chooses to exit

### Error Handling
The application includes validation for:
- Invalid ranges (minimum ≥ maximum)
- Invalid counts (less than or equal to 0)

## Technical Requirements

### Dependencies
- Java Development Kit (JDK) 8 or higher
- Command line interface or terminal

### How to Run

1. Compile the Java files:
```bash
javac PeriodicTable.java
javac RandomNumberGenerator.java
```

2. Run the desired program:
```bash
java PeriodicTable
# or
java RandomNumberGenerator
```

## Implementation Notes

### Modern Periodic Table
- Uses an array-based data structure for element storage
- Implements object-oriented principles through the Element class
- Memory efficient as elements are only created once during initialization

### Random Number Generator
- Utilizes Java's `Random` class for number generation
- Implements a while loop for continuous operation
- Uses Scanner class for user input handling

## Future Enhancements
1. Modern Periodic Table:
   - Add search by element name/symbol
   - Include more element properties
   - Add periodic table visualization

2. Random Number Generator:
   - Add option for different number distributions
   - Include duplicate number checking
   - Add file output capability

## Contributing
Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.
