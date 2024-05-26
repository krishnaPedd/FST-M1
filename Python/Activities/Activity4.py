#Rock beats scissors
#Scissors beats paper
#Paper beats rock

# get the User names
user1= input("Enter Player 1 name \n")
user2= input("Enter Player 2 name \n")
while True:
    # get the user choices
    user1_choice=input(user1+", do you want to choose rock paper scicesors?").lower()
    user2_choice=input(user2+", do you want to choose rock paper scicesors?").lower()
    if user1_choice==user2_choice:
        print("Its Tie")
    elif user1_choice=='Rock':
        if user2_choice=='scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_choice=='scissors':
        if user2_choice=='paper':
            print("scissors wins!")
        else:
            print("Rock wins!")
    elif user1_choice=="paper":
        if user2_choice=="Rock":
            print("Paper wins!")
        else:
            print("Scissor Wins!")
    else:
        print("Invalid input ! you have not entered Rock paper and Scissor. Try again")
    # Ask them if they want to play again
    repeat=input ("Do you want to play again Yes/No \n").lower()
    if repeat=='yes':
        pass
    elif repeat=='no':
        raise SystemExit
    else:
        print("Entered invalid input Exiting the game")
        raise SystemExit
        
