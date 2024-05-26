from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/login-form")
    print("login page title is :"+driver.title)
    username=driver.find_element(By.XPATH,"//input[@id='username']").send_keys("admin")
    password=driver.find_element(By.XPATH,"//input[@id='password']").send_keys("password")
    driver.find_element(By.XPATH,"//button[@class='ui button']").click()
    message=driver.find_element(By.XPATH,"//div[@id='action-confirmation']").text
    print("Login confirmation message is :"+message)



    