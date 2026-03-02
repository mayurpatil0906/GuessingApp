UC-02: User Guess Submission

Actor: Player, GuessValidator

Description: Player inputs a number guess. The system validates and compares it with the target number. Feedback is provided (higher/lower/correct).

Key Concepts:

Scanner input handling (Scanner)

Control flow (if-else, switch)

Looping (while / do-while)

Method invocation

Input validation

Requirements:

Accept user input

Validate numeric input

Compare guessed number with target

Track number of attempts

Provide feedback (higher/lower/correct)

Benefits:

Interactive user experience

Structured decision making

Reduced runtime errors

Clear feedback loop

Flow:

Prompt player for guess

Validate input

Compare guess to target

Increment attempt counter

Display feedback

Output Example:

Enter your guess: 45
Too low! Try a higher number.
Attempts left: 9

Drawbacks of previous approaches:

No validation → application crashes on invalid input
