import pandas as pd
data={
    "usernames": ["admin","Charles","Deku"],
    "passwords": ["password","Charl13","AllMight"]
}
dataFrame=pd.DataFrame(data)
print(dataFrame)
dataFrame.to_csv("LoginData.csv",index=False)