# Selenium-Java UI Automation

## A Generalised automation framework for UI automation


## Tools Used:: 
1. Java
2. Selenium
3. Maven
4. Testng
5. ReportNG

## Pre-requisites - 
1. Java is installed and available in system path(JAVA_HOME).
2. Maven is installed and available in system path(MAVEN_HOME).

**All other required dependencies are managed by pom.xml file*
## About :: 
This UI Automation test framework has been built to test E-2-E flow of UI application on different browser depending on the input configurations.

## Framework Architecture Diagram ::

<img width="790" alt="Screenshot 2022-06-15 at 10 59 03 PM" src="https://user-images.githubusercontent.com/104636105/173907091-2cc78314-2496-4b1e-b030-27b87651b587.png">

## Project Structure :: 
```
root
  |--src/main/java
      |--helpers
          |--BaseSeleniumClass(Used for Selenium Webdriver Initialization)
          |--BaseUtils( Base util function)
          |--FreeleticsAUT( Application under test configurations)
          |--LoggerClass(Implements logs)
      |--Pages 
          |--CareersPage()
          |--HomePage()
          |--JobDescriptionPage()
          |--JobsPage()
  |
  |--src/test/java
      |--demotests
          |--FreeleticsTest(Contains E-2-E test flow of given scenario)
      |--testdata
          |--FreeleticsTest.properties(test data used by FreeleticsTest )
  | 
  |--src/main/resources
      |--log4j2.xml (log4j configurations)
  |
  |--pom.xml (project dependencies)
  |
  |--testng.xml (test suite run declaration)
  
```

  ## Feature's of automation framework ::
  - Generalised framework can automate any application with minimal changes
  - Support different browsers
  - Modularised structure, reusable functions  
  - POM implementation
  - Generalised Xpaths: reduce test flakiness

  ## How to run tests ::
  Move to project location from terminal.
  Run all tests using maven command ::
  ```mvn test  ```

  ## Reporting :: 
  ReportNG reports will be saved on path::
  ``` /target/surefire-reports/html/index.html> ```    
  
  ## Logs:
  Logs can be found on path::
  ``` /output/logfile.log> ```

  ## Things that can still be improved::
  - More Modularization of framework.
  - Adding exception handeling
