from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/input-events")
    print("Title is: "+driver.title);
    actions=ActionChains(driver)
    # Perform a LEFT CLICK action
    actions.click().perform()
    active_side=driver.find_element(By.CLASS_NAME,"active")
    print("active side number after left click :"+active_side.text)

    # perform Double click action
    actions.double_click().perform()
    active_side=driver.find_element(By.CLASS_NAME,"active")
    print("active side number after double click :"+active_side.text)

    # Perform a RIGHT CLICK action
    actions.context_click().perform()
    active_side=driver.find_element(By.CLASS_NAME,"active")
    print("active side number after Right click :"+active_side.text)
