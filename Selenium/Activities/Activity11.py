from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Chrome() as driver:
    # Navigate to the URL
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    print("Page title is: ", driver.title)

    checkbox = driver.find_element(By.CSS_SELECTOR, "input.willDisappear")
    # Click the checkbox to select it
    checkbox.click()
    # Verify if the checkbox is selected or not
    print("Checkbox is selected: ", checkbox.is_selected())
    # Click the checkbox again to uncheck it
    checkbox.click()
    # Verify if the checkbox is selected or not
    print("Checkbox is selected: ", checkbox.is_selected())