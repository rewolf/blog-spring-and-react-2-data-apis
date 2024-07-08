# Spring and React Demo

It is an example of setting up a data store and APIs backend with Spring Boot, and having a React 
frontend interact with it.  Gradle manages the entire build process including invoking Webpack 
using Node and bundling the JS application to be served by Spring Boot.

## Running the application
Firstly, ensure that you have Java 12 installed and set to your `JAVA_HOME`. 
After cloning the repository, run this to launch the application:
```
./gradlew bootRun
```
Navigate to http://localhost:8080/ to see the application running.
