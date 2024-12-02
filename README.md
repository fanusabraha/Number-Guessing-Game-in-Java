# README: Number Guessing Game in Java

## Overview
In this project, you will create a simple number guessing game where the user must guess a randomly selected number between 1 and 100. The game gives the user 5 chances to guess the correct number. Depending on whether the guess is higher or lower than the secret number, the game provides hints. The user loses if they exhaust all 5 attempts without guessing the correct number.

## What You Will Learn
### 1. **Working with Random Numbers**
   - Generate random numbers using `Math.random()` or `Random`.
   - Handle user input for guessing numbers.

### 2. **Control Flow (Conditional Statements)**
   - Use `if`, `else if`, and `else` to compare the user's guess with the target number.
   - Display different messages based on the user's input.

### 3. **Loops**
   - Use a loop to allow the user to guess up to 5 times.
   - Handle invalid inputs (like numbers outside the valid range).

### 4. **Basic Input and Output**
   - Read and handle user input using the `Scanner` class.
   - Display messages based on the game’s progress.

## Key Features
1. **Random Number Generation**
   - The game generates a random number between 1 and 100 for the player to guess.

2. **Input Validation**
   - If the user enters a number outside the valid range (1-100), the game will prompt the user to try again without counting it against the number of guesses.

3. **Hint System**
   - The game will give hints if the player’s guess is too high or too low.

4. **Limited Guesses**
   - The player only has 5 guesses to find the correct number.

5. **End of Game**
   - If the user guesses correctly, they win.
   - If the user runs out of guesses, they lose and the secret number is revealed.

## Example of Game Play

```
Pick a number between 1 and 100: 0
Your guess is not between 1 and 100, please try again.

Pick a number between 1 and 100: 101
Your guess is not between 1 and 100, please try again.

Pick a number between 1 and 100: 50
Please pick a lower number.

Pick a number between 1 and 100: 25
Please pick a lower number.

Pick a number between 1 and 100: 15
Please pick a higher number.

Pick a number between 1 and 100: 20
Please pick a lower number.

Pick a number between 1 and 100: 17
Please pick a higher number.

You lose!
The number to guess was: 19
```

## How to Play
1. Clone or download the repository with the game.
2. Open the project in your preferred Java IDE or text editor.
3. Run the `NumberGuessingGame.java` file.
4. Follow the instructions to guess the number within 5 tries.
5. If you win or lose, the game will display the appropriate message and end.

## Extending the Game
- You can extend the game by adding:
  - A prompt asking the player if they want to play again.
  - Keeping track of the number of wins and losses.
  - Adding difficulty levels (easy, medium, hard) to change the range of the random number.
  - Allowing the user to input their own range for guessing.


