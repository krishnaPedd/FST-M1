from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
driver=webdriver.Chrome()
driver.get("https://v1.training-support.net/selenium/input-events")
print("Home page title is :"+driver.title)
actions=ActionChains(driver)
actions.send_keys("K").key_down(Keys.CONTROL).send_keys("a").send_keys("c").key_up(Keys.CONTROL).perform()

    