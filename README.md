# Java Practical Exercises

A collection of Java programs covering star patterns and number operations.

## Programs Overview

### Star Pattern Programs

| File | Description |
|------|-------------|
| `Full_Pyramid.java` | Prints a full pyramid pattern of stars (5 rows) |
| `Pyramid.java` | Prints an inverted pyramid pattern (6 rows) |
| `Star.java` | Prints a simple triangle of stars (6 rows) |

### Number Programs

| File | Description |
|------|-------------|
| `OddNumbers.java` | Finds all odd numbers between 1-100, displays min, max, and sum |
| `EvenNumbers.java` | Finds all even numbers between 1-100, displays min, max, and sum |

## How to Run

### Compile all programs:
```
bash
javac *.java
javac mujju/Practical_3_B_053/*.java
```

### Run individual programs:

**Star Patterns:**
```
bash
java Full_Pyramid
java Pyramid
java Star
```

**Number Programs:**
```
bash
java OddNumbers
java EvenNumbers
```

## Expected Outputs

### Full_Pyramid
```
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
```

### Pyramid
```
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
```

### Star
```
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
```

### OddNumbers
```
List of odd numbers between 1 and 100:
[1, 3, 5, 7, ..., 99]
Minimum Odd Number: 1
Maximum Odd Number: 99
Sum of Odd Numbers: 2500
```

### EvenNumbers
```
Even numbers 1-100: [2, 4, 6, 8, ..., 100]
Minimum even number: 2
Maximum even number: 100
Total (sum): 2550
```

## Project Structure

```
.
├── Full_Pyramid.java
├── Full_Pyramid.class
├── Pyramid.java
├── Pyramid.class
├── OddNumbers.java
├── OddNumbers.class
├── OddNumbers.java
├── Star.class
├── mujju/
│   └── Practical_3_B_053/
│       ├── Full_Pyramid.java
│       ├── Full_Pyramid.class
│       ├── EvenNumbers.java
│       ├── EvenNumbers.class
│       ├── Star.java
│       └── Star.class
```

## Requirements

- Java Development Kit (JDK) 8 or higher
