# Shopping List v1

## Database
```courseignore
$ docker build -t shopping_db .
$ docker run -p 3306:3306 -d shopping_db 
```
## Development

Run development instance
```courseignore
$ mvn spring-boot:run
```
