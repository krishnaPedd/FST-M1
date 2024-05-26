from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/ajax")
    wait=WebDriverWait(driver,10)
    print("Home page title is :"+driver.title)
    driver.find_element(By.XPATH,"//button[text()='Change Content']").click()
    wait.until(expected_conditions.text_to_be_present_in_element((By.TAG_NAME,"h1"),"HELLO!"))
    helloText=driver.find_element(By.TAG_NAME,"h1").text
    print(helloText)
    ajaxText=driver.find_element(By.TAG_NAME,"h3")
    print(ajaxText.text)
    wait.until(expected_conditions.text_to_be_present_in_element((By.TAG_NAME,"h3"),"I'm late!"))
    print("after Ajax call loading the text is"+ajaxText.text)



