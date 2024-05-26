fruits= {
    "mango":90,
    "apple":150,
    "orange":40,
    "kiwi":80
    }
print(fruits)
fruitAvlable=input("Enter fruit name which you want to check in dictionary :").lower()
if(fruitAvlable in fruits):
    print("fruit is available in fruit shop")
else:
    print("fruit is not available in fruit shop")


