from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
with webdriver.Chrome() as driver:
    # initialize the wait object
    wait = WebDriverWait(driver, 10)
    # Navigate to the URL
    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the username field
    username = driver.find_element(By.XPATH, "//input[starts-with(@class, 'username-')]")
    # Find the password field
    password = driver.find_element(By.XPATH, "//input[starts-with(@class, 'password-')]")
    username.send_keys("admin")
    password.send_keys("password")
    # Find the login button and click it
    driver.find_element(By.XPATH, "//button[@type='submit']").click()

    # wait for the login message to appear
    wait.until(EC.visibility_of_element_located((By.ID, "action-confirmation")))
    message = driver.find_element(By.ID, "action-confirmation").text
    print("Login message is: ", message)