UC-04: Error Handling & Validation

Actor: Player, ValidationService

Description: Ensure all user inputs are safe, numeric, and within range. Handle invalid input gracefully.

Key Concepts:

Exception handling (try-catch)

Custom exceptions (optional)

Input sanitization

Fail-fast approach

Requirements:

Reject non-numeric input

Prevent out-of-range guesses

Display user-friendly error messages

Prevent application crash

Log invalid attempts (optional)

Benefits:

Robust, crash-free execution

Improved user guidance

Clean code flow

Production-ready behavior

Flow:

Input → validate → accept/reject

Display error or confirmation

Output Example:

Invalid input! Please enter a number between 1 and 100.

Drawbacks of previous approaches:

Unhandled input → runtime exceptions
