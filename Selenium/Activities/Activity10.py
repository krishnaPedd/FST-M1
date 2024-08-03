from selenium import webdriver
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support  import expected_conditions as EC
from selenium.webdriver.common.by import By
with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    wait=WebDriverWait(driver,10)
    print("page title is :",driver.title)
    checkBox=driver.find_element(By.ID,"dynamicCheckbox")
    checkboxToggle=driver.find_element(By.ID,"toggleCheckbox")
    print("checkbox is visible :", checkBox.is_displayed())
    checkboxToggle.click()
    wait.until(EC.invisibility_of_element(checkBox))
    print("checkbox is visible :", checkBox.is_displayed())

