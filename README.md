# Spring Zuul Proxy

Overview

## Description

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

### Run Eureka Server

- [shinyay/spring-eureka-server](https://github.com/shinyay/spring-eureka-server)

```
./gradlew clean bootRun -x test
```

- [Eureka dashboard - http://localhost:8761](http://localhost:8761)

### Run Eureka Client with Random Port

- [shinyay/spring-eureka-kotlin](https://github.com/shinyay/spring-eureka-kotlin)

```
./gradlew clean bootRun -x test
```

### Feign Client

- [shinyay/spring-eureka-feign](https://github.com/shinyay/spring-eureka-feign)

```
./gradlew clean bootRun -x test
```

### Zuul Proxy

```
./gradlew clean bootRun -x test
```

### Access Application

```
$ curl http://localhost:8081/eureka-client/greeting
$ curl http://localhost:8081/eureka-feign-client/greeting
```

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
