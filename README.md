# EMI_Calculator_App_Automotion_Project_With_Selenium_Appium
## About this project:
## Automated Apps link: https://play.google.com/store/apps/details?id=com.continuum.emi.calculator
## apk Download link: https://apps.evozi.com/apk-downloader/
## Here I automate the following Dataset:
```
{100000,9.0,2, 2.0, 4568, 9643, 2000, 109643},
{325000,9.5,5,1.5,6826,84536,4875,409536},
{450000,11.0,7,1.8,7705,197228,8100,647228},
{99000000,10.0,4,1.25,2510896,21522996,1237500,120522996},
{50000,12.0,9,2.2,759,31995,1100,81995}
```
## Tools & Technology used:
- Android Studio
- Mobile application testing tool: Appium Inspector
- Language: Java
- Build Tool: Gradle
- IDE: Intellij IDEA
 
 ## Dependencies
- selenium-java
- java-client
- testng
- allure-testng

## How to run this project:
- Turn on Developer Options and Connect your mobile device through USB cable or install and run Virtual device on Android Studio.
- Open Command Prompt and use this command: ```adb devices```
- To start Appium Server use this command: ```appium```
- Now Open Appium Inspector
- Set Desired Capabilities Manually or copy bellow JSON format and paste it JSON Representation:
```
{
  "platformName": "Android",
  "appium:platformVersion": "12",
  "appium:automationName": "UIAutomator2",
  "appium:appPackage": "com.continuum.emi.calculator",
  "appium:appActivity": "com.finance.emicalci.activity.Splash_screnn",
  "appium:app": "E:\\apk\\emicalc.apk"
}
```     
- Here ``` "appium:platformVersion": "12" ``` is android version which device i Connected as adb device and ``` "appium:app": "E:\\apk\\calculator.apk" ``` is location of downloaded apk file in my Computer.
- Click Save and Click Start Session
  
- Clone this project
- follow this instruction:
- ```  build.gradle ```
- ``` open it on Intellij IDE as project ```
- ``` click Run Button ```
  
## Open Terminal Follow that Command:
- ``` gradle clean test ```
- ``` allure generate allure-results --clean -output ```
- ``` allure serve allure-results ```
  
## Allure Reports:
![screencapture-192-168-1-104-11399-index-html-2023-10-16-23_27_43](https://github.com/fahimmahatab/EMI_Calculator_App_Automotion_Project_With_Selenium_Appium/assets/43899673/c252d7d6-f577-459b-87ea-e2ee7936e188)
![screencapture-192-168-1-104-11399-index-html-2023-10-16-23_28_08](https://github.com/fahimmahatab/EMI_Calculator_App_Automotion_Project_With_Selenium_Appium/assets/43899673/425565fb-9304-4d25-850b-876b86470678)

## Here the recorded video from program output is attched below:
https://github.com/fahimmahatab/EMI_Calculator_App_Automotion_Project_With_Selenium_Appium/assets/43899673/e1807245-d10b-4061-ad95-7e7cf45781fc

## Thanks for Visit.
