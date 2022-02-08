# Maven template archetype

### Purpose

- Generates a new Core Java app using template archetype
- JUnit 5, Hamcrest & Mockito are set as test dependencies
- Shade & Spotbugs are pre-configured as part of the build

### Usage

- Requires Maven 3.8.x & JDK 18.x installed on your system

```
❯ cd ./template-archetype
❯ ./generate.sh <name>
❯ cd ../<name>
```
*where ```<name>``` denotes both project and package name*
