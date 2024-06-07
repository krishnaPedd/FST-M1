import pandas as pd

dataframe=pd.read_excel("sample.xlsx")
print(dataframe)
print("---------------")
print("Number of rows and columns :"+ dataframe.shape)

#Print data in email column only
print("Emails data")
print(dataframe["Email"])

# sort data based on fisrt name in ascending order
print("Sorted data in ascending")
print(dataframe.sort_values("FirstName"))
