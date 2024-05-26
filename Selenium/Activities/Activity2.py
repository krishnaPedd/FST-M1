import selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

#from selenium import By
with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/login-form")
    print("page title is "+driver.title)
    username=driver.find_element(By.ID,"username").send_keys("admin")
    password=driver.find_element(By.ID,"password").send_keys("password")
    #driver.find_element(By.XPATH,"//button[text(),'Log in']").click()
    login = driver.find_element(By.CSS_SELECTOR, "button.button:nth-child(4)")
    login.click()
    message=driver.find_element(By.ID,"action-confirmation").text
    print("Confirmation msg is :"+message)


