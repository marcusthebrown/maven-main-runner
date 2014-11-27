maven-main-runner
=================

A tool to run simple java programs using maven

First you need to compile the class with the main method
```
mvn compile
```

Then you can run the program with
```
mvn exec:java -Dexec.mainClass="HelloWorld"
```

The exec-maven-plugin will execute the mainClass with the project's
dependencies added to the classpath.
