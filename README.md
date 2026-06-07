# Amazon Automation Assignment

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven

## Test Case 1

* Navigate to Amazon
* Search for iPhone
* Retrieve and print device price
* Add device to cart

## Test Case 2

* Navigate to Amazon
* Search for Samsung Galaxy device
* Retrieve and print device price
* Add device to cart

## Parallel Execution

Implemented using TestNG:

xml
parallel="methods"
thread-count="2"
```

## How to Run

1. Clone repository
2. Import as Maven project
3. Run `testng.xml`

## Project Structure

* pom.xml
* testng.xml
* AmazonTest.java
