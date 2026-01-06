import random

while True:
    win_number = random.randint(1,10)
    attempt = 0

    while True:
        user_guess = input("Enter a number to guess from (1 - 10) or (done) to exit: ")
        if user_guess == "done":
            print("Thanks for playing")
            break

        try:
            user_guess = int(user_guess)
            attempt += 1
            if user_guess < win_number:
                print(f"Too Low, try again. #{attempt}")
            elif user_guess > win_number:
                print(f"Too High, try again. #{attempt}")
            elif user_guess == win_number:
                print(f"Correct! It took {attempt} attempt{'s' if attempt != 1 else ''} to guess!")
                break
        except ValueError:
            print("Invalid")

    play_again = input("Would you like to play again? (Y/N)").lower()
    if play_again not in ("yes", "y"):
        print("Thanks for playing")
        break

