# Shopping List v1

Simple application to create shopping list.

## Database
Build and run docker with a database instance
```courseignore
$ docker build -t shoppinglist database/
$ docker run -p 3306:3306 -d shoppinglist 
```
## Development

Run development instance
```courseignore
$ mvn spring-boot:run
```

## Preview

![](screenshot.png)