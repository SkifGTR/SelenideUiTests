# Cross-browser automated tests

## Overview
This is a test automation framework for cross-browser testing using Selenide, Junit and Allure.
Linking that components together allows to create a powerful and easy to use framework for automated tests
using well know Page Object Model design pattern.
That is not full version of framework, but it is a good start point for your own implementation.

## Features
1. **Selenide** - Java based UI automation framework
2. **Allure** - Framework for generating test reports
3. Test running possible from command line & IDE

## Prerequisites
1. **Java** - should be installed and configured
2. **Maven** - should be installed and configured

## How to run tests
1. Clone the repository
2. Open terminal and navigate to the project directory
3. Run the following command by default it will run tests in Firefox browser:
   ```mvn clean test```
4. Run with desired browser:
   ```mvn clean test -Dbrowser=chrome```
   ```mvn clean test -Dbrowser=safari```
5. To generate Allure report run:
   ```mvn allure:serve```

## Notes
It is possible to run by default for MacOS users(chrome, firefox, safari)
For Windows users(chrome, firefox)