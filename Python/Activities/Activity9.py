list1=[1,5,4,2,6]
list2=[8,9,3,2]
list3=[]
# odd numbers from first List Even numbers from second list will form new list
for i in list1:
    if i%2 !=0:
        list3.append(i)
for i in list2:
    if i%2==0:
        list3.append(i)
print(list3)
