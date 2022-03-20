1- Download kafka from https://kafka.apache.org/quickstart

2- Go to the downloaded dir and run these commands in differents terminal
- bin/zookeeper-server-start.sh config/zookeeper.properties
- bin/kafka-server-start.sh config/server.properties
- bin/kafka-console-consumer.sh --topic azizCode --from-beginning --bootstrap-server localhost:9092


###
run this with postman

POST http://localhost:8080/api/v1/message
Content-Type: application/json

{
"name": "Ahmed Aziz",
"age": 40
}