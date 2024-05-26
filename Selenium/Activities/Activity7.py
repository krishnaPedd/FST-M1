from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/drag-drop")
    print("Home page title is :"+driver.title)
    ballImage=driver.find_element(By.XPATH,"//img[@id='draggable']")
    target1=driver.find_element(By.XPATH,"//div[@id='droppable']")
    target2=driver.find_element(By.XPATH,"//div[@id='dropzone2']")
    actions=ActionChains(driver)
    actions.drag_and_drop(ballImage,target1).perform()
    if(target1.text.find("Dropped!")):
        print("Foot ball dropped in Zone1")

    actions.drag_and_drop(ballImage,target2).perform()
    if(target2.text.find("Dropped!")):
        print("foot ball dropped in zone 2")
