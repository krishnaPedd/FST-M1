list1=list(input("Enter list of number with comma separated :").split(","))
if list1[0] == list1[-1]:
    print(True)
else:
    print(False)