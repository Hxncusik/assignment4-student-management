# Student & Course Management (Java)

## Project Overview

This project is a Java application demonstrating Object-Oriented Programming concepts.
It models students and a course that contains multiple students.

The program focuses on:
- Encapsulation (private fields, public methods)
- Constructors
- Class interaction
- Composition
- Array processing and basic statistics

## Classes

### Student
Represents a student with academic information.

**Fields:** name, id, major, gpa, credits  
**Constructor:** Creates a student with default GPA 0 and 0 credits.

**Main methods:**

- Getters and setters
- `updateGPA(double)`
- `addCredits(int)`
- `isHonors()` returns true if GPA >= 3.5
- `toString()` for formatted output

### Course
Represents a course that contains students.

**Fields:** courseName, instructor, Student[] students  
**Relationship:** Course has Student objects (composition).  

**Main methods:**
- `addStudent(Student, int)`
- `courseAverageGPA()`
- `highestCreditStudent()`
- `toString()`

## Compile and Run
```bash
javac *.java
java Main
```

## Program Output
Screenshot in the repository shows:

- Student information
- Course summary
- Average GPA
- Student with the highest credits
- Top GPA student
- Honors count
- Total credits

![Application output](/docs/screenshots/output.png)

## Reflection
This project helped me understand how to design classes that represent real entities and interact using OOP principles. Encapsulation made the code cleaner and safer by controlling access to data.
The main challenge was structuring logic across classes without duplication. Overall, the project demonstrates how OOP improves readability, maintainability, and allows easy future expansion.
