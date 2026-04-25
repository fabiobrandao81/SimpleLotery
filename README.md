# SimpleLottery
A simple Lottery API to exercise Java and Spring skills

## Environment Setup

### Development Environment

This projetc is developed in Ubuntu 24.04 LTS running in WSL2.
A bare metal Linux or macOS environemt should work fine without adjustments.

### Required tools

- Git
- SSH keys (for git authentication)
- Docker
- Java 25
- MySQL (container for local development)
- MySQL management tool (optional)
- Your preffered IDE and plugins/extensions for Java development

### Code Setup

Chenckout the code using SSH
Rename the file `.env.example` to `.env` and include the information to connect to your MySQL development instance. We suggest the use of a local container for dev.
Run the Docker command to create the DB container.
`docker compose up -d mysqldb`
Run the build Gradle build command
`./gradlew build`
<!-- Include the testing commands as soon as the tests are available
Run the tests to check for any problems
`<testing_commands>`
-->
Run the application
`./gradlew bootRun`

## Project Structure