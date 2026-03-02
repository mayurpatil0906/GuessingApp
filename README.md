UC-05: Game Result Storage (File / Database)

Actor: Player, StorageService

Description: Store game results (player name, attempts, win/loss) for future reference.

Key Concepts:

File I/O (BufferedWriter, BufferedReader)

Database connectivity (JDBC)

Object persistence

Serialization (optional)

Requirements:

Save results in a file or database

Retrieve past game records

Display previous scores

Maintain data integrity

Benefits:

Persistent game history

Real-world data handling practice

Analytical tracking of performance

Flow:

Game ends → store result

Confirm storage → optionally display previous scores

Output Example:

Congratulations! You guessed the number in 6 attempts.
Result saved for player: John
Previous high score: 4 attempts

Drawbacks of previous approaches:

No persistence → data lost after exiting the game
