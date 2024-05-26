list1=list(input("enter list of elements with comma separated :").split(","))
print(list1)
sum = 0
for number in list1:
    sum += int(number)
print("sum of List is  :"+ str(sum))