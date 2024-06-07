import pandas as pd
from pandas import ExcelFile
from pandas import ExcelWriter
	
data = {
	"FirstName":["Satvik", "Avinash", "Lahri"],
	"LastName":["Shah", "Kati", "Rath"],
	"Email":["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	"PhoneNumber":["4537829158", "4892184058", "4528727830"]
}
 
dataframe = pd.DataFrame(data)
print(dataframe)
writer=ExcelWriter("sample.xlsx")
dataframe.to_excel(writer,"sheet1",index=False)
writer.close()

 