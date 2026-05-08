# 🎯 Guessing App — Java Number Guessing Game

> A console-based Java application developed to master core Java programming concepts through an interactive number guessing game.  
This project combines problem-solving, user interaction, validation, exception handling, file handling, and database integration into a real-world learning application.

---

# 📋 Table of Contents

- [Project Overview](#project-overview)
- [Problem Statement](#problem-statement)
- [Core Features](#core-features)
- [Use Case Scenarios](#use-case-scenarios)
- [Object-Oriented Concepts](#object-oriented-concepts)
- [Core Java Concepts Applied](#core-java-concepts-applied)
- [Application Architecture](#application-architecture)
- [Project Structure](#project-structure)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Sample Console Flow](#sample-console-flow)
- [Educational Goals](#educational-goals)
- [Future Enhancements](#future-enhancements)
- [License](#license)

---

# 📌 Project Overview

The **Guessing App** is a Java-based interactive console game where the player tries to guess a randomly generated number within limited attempts.

The project is designed as a practical learning system to understand:

- Core Java Syntax
- Data Types
- Control Flow
- Loops
- Functions & Methods
- Exception Handling
- File Handling
- JDBC Integration
- Object-Oriented Programming
- Modular Application Design

The application focuses heavily on logical thinking, user interaction, validation mechanisms, and clean architecture while simulating a real-world mini gaming system.

---

# 🌍 Problem Statement

Traditional beginner programs often teach Java concepts independently without connecting them into a complete working system.

This project solves that issue by integrating multiple Java concepts into one cohesive application where:

- Users interact with the system
- Inputs are validated
- Errors are handled safely
- Results are stored permanently
- Game logic is modular and reusable

The project provides a strong foundation for understanding how real-world Java applications are built.

---

# ✨ Core Features

| Module | Features |
|---|---|
| 🎮 Game Engine | Random number generation |
| 👤 Player Interaction | Guess submission and feedback |
| 💡 Hint System | Dynamic hint generation |
| ⚠️ Validation | Error handling and input safety |
| 💾 Persistence | File and database storage |
| 🔄 Restart Support | Replay game functionality |
| 🚪 Exit Management | Graceful shutdown |
| 📊 Result Tracking | Store and display previous scores |

---

# 🧩 Use Case Scenarios

---

# 🎮 Use Case 1 — Game Initialization

## Objective

Initialize the game with required configurations and generate the target number.

---

## Key Concepts

- Primitive Data Types
- Random Number Generation
- Constructor Initialization
- Encapsulation
- Constants (`final` keyword)

---

## Key Requirements

- Generate random target number
- Initialize maximum attempts
- Initialize hint counter
- Store game configuration
- Display game rules

---

## Benefits

- Controlled game setup
- Reusable initialization logic
- Predictable game behavior
- Easy difficulty modification
- Clean separation of concerns

---

## Flow

```text
Start Application
       ↓
Initialize Variables
       ↓
Generate Random Number
       ↓
Display Rules
       ↓
Game Ready
```

---

## Output

```text
===== GUESSING GAME =====
Guess a number between 1 and 100
Maximum Attempts: 10
Hints Available: 3
```

---

# 🎯 Use Case 2 — User Guess Submission

## Objective

Allow users to submit guesses and receive immediate feedback.

---

## Key Concepts

- Scanner Input Handling
- if-else Decision Making
- Loops (`while`, `do-while`)
- Method Invocation
- Input Validation

---

## Key Requirements

- Accept user input
- Validate numeric input
- Compare guess with target
- Track attempts
- Display Higher/Lower feedback

---

## Benefits

- Interactive gameplay
- Structured decision making
- Better logical thinking
- Safe execution
- Continuous feedback loop

---

## Flow

```text
Enter Guess
      ↓
Validate Input
      ↓
Compare with Target
      ↓
Display Feedback
```

---

## Output

```text
Enter your guess: 45
Too Low!

Enter your guess: 78
Too High!

Enter your guess: 63
Correct Guess!
```

---

## Previous Drawback

```text
No validation → Application crashes on invalid input
```

---

# 💡 Use Case 3 — Hint Generation

## Objective

Provide hints after incorrect guesses to guide the player.

---

## Key Concepts

- Conditional Logic
- Arithmetic Operators
- Method Abstraction
- Encapsulation

---

## Key Requirements

- Generate hints after wrong guesses
- Limit number of hints
- Provide meaningful hints
- Increase difficulty gradually
- Avoid revealing exact answer

---

## Example Hints

```text
The number is EVEN
The number is divisible by 5
The number lies between 40 and 60
```

---

## Benefits

- Better engagement
- Encourages analytical thinking
- Progressive learning
- Reusable hint engine
- Improved user experience

---

## Flow

```text
Wrong Guess
     ↓
Increment Hint Counter
     ↓
Generate Hint
     ↓
Display Hint
```

---

## Previous Drawback

```text
No hints → Frustrating user experience
```

---

# ⚠️ Use Case 4 — Error Handling & Validation

## Objective

Ensure safe and validated user input throughout the application.

---

## Key Concepts

- Exception Handling
- try-catch
- Custom Exceptions
- Input Sanitization
- Fail-Fast Principle

---

## Key Requirements

- Handle non-numeric input
- Prevent invalid ranges
- Display user-friendly messages
- Prevent crashes
- Log invalid attempts

---

## Benefits

- Robust execution
- Crash-free behavior
- Cleaner code
- Easier debugging
- Production-level stability

---

## Flow

```text
Input
  ↓
Validation
  ↓
Valid / Exception
  ↓
Continue Game
```

---

## Example

```text
Enter your guess: abc

Invalid Input!
Please enter a numeric value.
```

---

## Previous Drawback

```text
Unhandled input → Runtime exceptions
```

---

# 💾 Use Case 5 — Game Result Storage

## Objective

Store and retrieve game results using files or databases.

---

## Key Concepts

- File I/O
- BufferedWriter
- BufferedReader
- JDBC
- Object Persistence
- Serialization

---

## Key Requirements

- Store player name
- Store attempts count
- Store win/loss status
- Retrieve past records
- Maintain data integrity

---

## Benefits

- Persistent game history
- JDBC understanding
- File handling mastery
- Real-world storage concepts
- Analytical tracking

---

## Flow

```text
Game Ends
    ↓
Save Result
    ↓
Store in File/Database
    ↓
Display Confirmation
```

---

## Example Output

```text
Game Result Saved Successfully!
```

---

## Previous Drawback

```text
No persistence → Data lost after exit
```

---

# 🔄 Use Case 6 — Game Restart & Exit

## Objective

Allow users to restart or exit the game safely.

---

## Key Concepts

- Loop Control
- Boolean Flags
- Resource Cleanup
- Application Lifecycle Management

---

## Key Requirements

- Restart support
- Reset game variables
- Close resources properly
- Graceful shutdown
- Display summary

---

## Benefits

- Replay support
- Better usability
- Safe resource handling
- Improved UX
- Clean application lifecycle

---

## Flow

```text
Game End
    ↓
Restart?
  ↙     ↘
Yes      No
 ↓        ↓
Reset    Exit
```

---

## Example Output

```text
Do you want to play again? (Y/N)
```

---

## Previous Drawback

```text
Forced termination → Poor user experience
```

---

# 🧠 Object-Oriented Concepts

---

# 1️⃣ Encapsulation

Private fields protect internal game data.

```java
private int targetNumber;
private int maxAttempts;
private int hintCounter;
```

---

# 2️⃣ Abstraction

Game logic is separated into services and interfaces.

```java
GameService
HintService
ValidationService
StorageService
```

---

# 3️⃣ Inheritance

Specialized components extend base functionality.

```text
StorageService
 ├── FileStorageService
 └── DatabaseStorageService
```

---

# 4️⃣ Polymorphism

Different storage or validation mechanisms can be used dynamically.

```java
StorageService storage = new FileStorageService();
```

---

# ☕ Core Java Concepts Applied

---

# 🎲 Random Number Generation

```java
Random random = new Random();
int number = random.nextInt(100) + 1;
```

---

# 🔁 Loops

```java
while()
do-while()
for()
```

Used for gameplay repetition and restart logic.

---

# ⚡ Conditional Statements

```java
if-else
switch
```

Used for game decisions and feedback generation.

---

# ⚠️ Exception Handling

```java
try-catch
throw
Custom Exceptions
```

---

# 📦 Collections Framework

```java
List<GameResult>
Map<String, Integer>
```

Used for storing game history and player scores.

---

# 💾 File Handling

```java
BufferedWriter
BufferedReader
FileWriter
FileReader
```

Used for result persistence.

---

# 🗄️ JDBC Integration

```java
Connection
PreparedStatement
ResultSet
```

Used for database storage and retrieval.

---

# 🕒 Date & Time API

```java
LocalDateTime
```

Used for timestamps.

---

# 🏛️ Application Architecture

```text
Presentation Layer
       ↓
Game Controller
       ↓
Game Services
       ↓
Validation / Hint / Storage
       ↓
File / Database
```

---

# 📁 Project Structure

```text
GuessingApp/
│
├── src/
│   ├── controller/
│   │   └── GameController.java
│   │
│   ├── model/
│   │   ├── Player.java
│   │   ├── GameConfig.java
│   │   └── GameResult.java
│   │
│   ├── service/
│   │   ├── GameService.java
│   │   ├── HintService.java
│   │   ├── ValidationService.java
│   │   └── StorageService.java
│   │
│   ├── storage/
│   │   ├── FileStorageService.java
│   │   └── DatabaseStorageService.java
│   │
│   ├── util/
│   │   ├── Constants.java
│   │   ├── RandomGenerator.java
│   │   └── InputValidator.java
│   │
│   ├── exception/
│   │   └── InvalidGuessException.java
│   │
│   └── main/
│       └── Main.java
│
├── output/
│   └── game_results.txt
│
├── README.md
└── requirements.txt
```

---

# 💻 Tech Stack

| Technology | Purpose |
|---|---|
| ☕ Java | Core application development |
| 🎲 Random API | Number generation |
| 📦 Collections Framework | Data handling |
| 💾 File I/O | Result storage |
| 🗄️ JDBC | Database integration |
| ⚠️ Exception Handling | Safe execution |
| 🕒 LocalDateTime | Timestamp management |

---

# 🚀 Getting Started

---

# Prerequisites

```bash
Java 17+
IDE (IntelliJ / Eclipse / VS Code)
```

---

# Compile Project

```bash
javac Main.java
```

---

# Run Application

```bash
java Main
```

---

# 🖥️ Sample Console Flow

```text
===== NUMBER GUESSING GAME =====

1. Start Game
2. View Previous Scores
3. Exit

Enter Choice:
```

---

# 🎯 Educational Goals

| Module | Learning Outcome |
|---|---|
| Core Java | Syntax, loops, functions |
| OOP | Encapsulation, abstraction, polymorphism |
| Exception Handling | Safe execution |
| File Handling | Persistent storage |
| JDBC | Database operations |
| Validation | Input sanitization |
| Architecture | Modular application design |

---

# 🔮 Future Enhancements

- GUI using JavaFX or Swing
- Multiplayer mode
- Difficulty levels
- Online leaderboard
- Timer-based gameplay
- REST API integration
- Cloud database support
- AI-generated hints

---

# 📜 License

This project is created for educational and learning purposes.

---

> 🎯 *"Every correct guess is a combination of logic, patience, and smart programming."*
