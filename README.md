## web-automation

This is the web test automation project for testing https://www.quandoo.de/en/berlin website. It was built using Java 11, Selenium 3, JUnit frameworks.

## Tests

Project has a test class which represents the following scenario:
  
 Restaurants Berlin page:
  * open  Restaurants in Berlin page
  * accept cookies
  * save total restaurants number to variable
  * click filter Top rated
  * assert total number of restaurants changed
  * click on first item in Cuisine filter
  * assert correct number of displayed restaurants


## Prerequisites Software/Tools

1. Java Development Kit (Java 11)
2. Java Runtime Environment
3. Maven [ http://maven.apache.org/ ]
4. Git [ http://git-scm.com/downloads ]
5. Chrome browser/ Chromedriver
6. JUnit

## Installation/Running Tests

`git clone https://github.com/IrynaAyguen/QA21quandooTestsMavenJUnit`

`mvn test`

## Contributors

Iryna Ayguen  iryna.ayguen2021@gmail.com
