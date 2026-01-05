import random
print("Welcome to the guessing game")
while True:
    win_number = int(random.randint(1,10))
    attemps = 0

    while True:
        user_number = input("Insert the number you think is correct or done to quit the game: ")

        if user_number == "done":
            print("Thanks for playing")
            break

        try:
            user_number = int(user_number)
            attemps += 1
            if user_number > win_number:
                print("Too High")
                print(f"Your attemp is {attemps}")
            elif user_number < win_number:
                print("Too low")
                print(f"Your attemp is {attemps}")
            elif user_number == win_number:
                print("Correct")
                print(f"Your attemp is {attemps}")
                break
            else:
                print("Invalid")
        except ValueError:
            print("Invalid")
    
    play_again = input("Would you like to play again? (Y/N): ")
    if play_again == "N":
        print("Thanks for playing")
        break