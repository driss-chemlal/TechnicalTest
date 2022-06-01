# TechnicalTest

This repository is to host a project requested by worldline as a technical test.

---

## Author

Driss Chemlal

Senior QA Specialist

driss.chemlal@gmail.com

---

## Tools & libraries

The test automation framework is comprised of following tools and libraries.

1. JAVA: - Programming language
2. Selenium WebDriver: - Browser automation framework
3. TestNg: - TestNg Java testing framework
4. TestNg plugin for eclipse
5. Maven: - Build tool (Dependencies : org.seleniumhq.selenium - org.testng - com.aventstack - commons-io - org.apache.poi)
6. Custom Page Object Pattern and utility functions
7. Excel:- BDD Framework
8. Git OR SVN: - Version Control
9. Github or Local Git Server: - Git repository hosted server
10. Eclipse: - Integrated Development Environment
11. Browsers: - Google Chrome (Versión 102.0.5005.63), FireFox(101.0)
12. Browser Drivers : chromedriver(compatible version with google chrome), geckodriver(compatible version with firefox)

---

## Machine Configuration

windows 11

1. Java 18.0.1.1
2. git version 2.36.1.windows.1
3. maven Apache Maven 3.8.5

---

## Get Source Code

Open Terminal or command line, cd to the desired folder where the test automation source code needs to be checkout.

Run command: git clone https://github.com/driss-chemlal/TechnicalTest.git

This will download the latest template source code.

---

## IDE Configuration

### Eclipse plugins

Configure and Install Following Plugins

1. TestNG
2. Git

### Import Project into Eclipse

File>Import>Maven>Existing Maven Projects>Next> Browse to automationFramework Ensure pom.xml is found Finish

---

## Page Objects

PageObjects are used to store the WebElements for a Web Page.

---

## Page Events

PageEvents are used to store the actions to perform in a Web Page.

---

## Run Tests

To run the test use the testng plugin.

Locate 'testng.xml' file at root folder > Get into the file > Right Click > Run As > TestNG Suite

---

## Reports

Standard HTML Report

A report will be generated at **amazon-web-automation\reports**
 
