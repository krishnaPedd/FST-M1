def calCulate_Sum(numbers):
    sum=0
    for number in numbers:
        sum+=number
    return sum

list1=[10,20,15,5]
sum=calCulate_Sum(list1)
print("sum of List is :" + str(sum))