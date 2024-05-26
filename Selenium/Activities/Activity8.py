from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    print("Home page title is :"+driver.title)
    wait=WebDriverWait(driver,10) 
    toggleCheckbox=driver.find_element(By.ID,"toggleCheckbox")
    toggleCheckbox.click()
    print("Checkbox hidden")
    dynamicCheckBox=driver.find_element(By.ID,"dynamicCheckbox")
    wait.until(expected_conditions.invisibility_of_element(dynamicCheckBox))
    toggleCheckbox.click()
    print("checkbox is displaying")
    wait.until(expected_conditions.visibility_of(dynamicCheckBox))
    dynamicCheckBox.click()
    print("selected the checkbox")

    


