# Maven template archetype

### Purpose

- Generates a new Core Java app using template archetype
- JUnit 5, Hamcrest & Mockito are set as test dependencies
- Shade & Spotbugs are pre-configured as part of the build

### Usage

- Requires Maven 3.8.x & JDK 17.x installed on your system

```
❯ ./generate.sh <name>
❯ cd ../<name>
```

_where `<name>` denotes both project and package name_
