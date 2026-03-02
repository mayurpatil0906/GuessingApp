UC-03: Hint Generation

Actor: Player, HintService

Description: After incorrect guesses, provide hints to guide the player. Hints are limited and should not reveal the exact number.

Key Concepts:

Conditional logic

Arithmetic operators (%, <, >)

Method abstraction

Encapsulation of hint logic

Requirements:

Provide hints after wrong guesses

Limit number of hints

Hints include even/odd, range, divisibility

Increase difficulty gradually

Hints do not reveal exact number

Benefits:

Enhances player engagement

Progressive difficulty

Encourages analytical thinking

Reusable hint engine

Flow:

Wrong guess → increment hint counter

Generate hint based on current guess and target

Display hint

Output Example:

Hint: The number is odd.
Hint: The number is between 40 and 60.

Drawbacks of previous approaches:

No hints → frustrating user experience
