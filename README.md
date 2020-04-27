swagger ui: http://localhost:8081/swagger-ui.html

in order to use this service via docker-compose (take a look on the main project)

mvn install
docker build -t restapi .
so, now the image can be used by the compose file.
