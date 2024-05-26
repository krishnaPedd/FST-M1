from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/target-practice")
    print("Title is :"+driver.title)
    # find Third Header on the page
    thirdheader=driver.find_element(By.XPATH,"//h3[@id='third-header']").text
    print("Third header text is :"+thirdheader)
    fifthheader=driver.find_element(By.XPATH,"//h5[@class='ui green header']").value_of_css_property("color")
    print("Third header text is :"+fifthheader)
    classes=driver.find_element(By.CLASS_NAME,"violet").get_attribute("class")
    print("Violet button classes are :"+classes)
    greyBtnText=driver.find_element(By.CLASS_NAME,"grey").text
    print("Grey btn text is :"+greyBtnText)


