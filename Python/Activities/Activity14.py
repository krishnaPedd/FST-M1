def fib(number):
     if(number<=1):
        return number
     else:
        return (fib(number-1)+fib(number-2))

fibInput=int(input("Enter number for fibnocci series :"))
if(fibInput<=0):
    print("Enter postive number")
else:
    for i in range(fibInput):
        print(fib(i))

