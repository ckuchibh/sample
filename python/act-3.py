user1 = input("Player1 Name :")
user2 = input("Player2 Name :")

#ROCK PAPER SCISSORS
userans1 = input(user1 + " Input :").upper()
userans2 = input(user2 + " Input :").upper()

if userans1==userans2 :
    print("Game is tie")
elif userans1=="ROCK" and userans2=="SCISSORS" :
    print("ROCK Wins " + user1 +" Wins")
elif userans1=="ROCK" and userans2=="PAPER":
    print("PAPER Wins " + user2 +" Wins")
elif userans1=="SCISSORS" and userans2=="ROCK":
    print("ROCK Wins " + user2 +" Wins")
elif userans1=="SCISSORS" and userans2=="PAPER":
    print("SCISSORS Wins " + user1 +" Wins")
elif userans1=="PAPER" and userans2=="SCISSORS":
    print("SCISSORS Wins " + user2 +" Wins")
elif userans1=="PAPER" and userans2=="ROCK":
    print("PAPER Wins " + user1 +" Wins")
else:
    print("Invalid Input Given")







