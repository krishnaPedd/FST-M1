import pandas as pd

readData=pd.read_csv("LoginData.csv")
print("Below are the List of usernames")
print( readData["usernames"])
print("**********************************")

print(" 2nd row Username is :"+readData["usernames"][1] + " Password is : "+ readData["passwords"][1])

#usernames Sorted in Asending order
print("**********************************")
print("usernames sorted in Ascending order")
sortedUsernames=readData.sort_values("usernames")
print(sortedUsernames)

# Passwords sorted in descending order
print("**********************************")
print("Passwords sorted in descending order")
print(readData.sort_values("passwords",ascending=False))
