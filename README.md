UC-01: Game Initialization

Actor: Player (Primary), Game Engine (Secondary)

Description: Initialize the guessing game with default settings, generate a random target number, and display game instructions.

Key Concepts:

Primitive data types (int, boolean)

Random number generation (Random)

Constructor initialization

Encapsulation (private fields)

Constants (final keyword)

Requirements:

Generate random number within a predefined range (e.g., 1–100)

Set maximum attempts

Initialize hint counter

Store game configuration

Display welcome message and rules

Benefits:

Controlled game setup

Clear separation of initialization logic

Predictable behavior

Easy modification for different difficulty levels

Flow:

Start application

Initialize game variables (target number, attempts, hints)

Display game rules and instructions

Game is ready to start

Output Example:

Welcome to the Number Guessing Game!
Guess a number between 1 and 100.
You have 10 attempts. Good luck!
