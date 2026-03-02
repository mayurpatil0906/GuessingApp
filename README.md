UC-06: Game Restart & Exit

Actor: Player, GameController

Description: Allow the player to restart the game or exit gracefully. Ensure resources are cleaned up.

Key Concepts:

Loop control

Boolean flags

Resource cleanup (Scanner.close())

Application lifecycle management

Requirements:

Restart game with fresh variables

Exit application gracefully

Display final summary or goodbye message

Benefits:

Improved usability

Safe resource handling

Replay support

Clean shutdown

Flow:

Game ends → prompt player for restart or exit

If restart → reset game variables

If exit → close resources and exit

Output Example:

Game over! Do you want to play again? (Y/N): Y
Starting a new game...

Drawbacks of previous approaches:

Forced termination → poor user experience
