# tensorflow-serving-client4j

## Dependences
* [tensorflow/serving:1.7.0](https://github.com/tensorflow/serving/tree/1.7.0)  
* [tensorflow/tensorflow:v1.7.0](https://github.com/tensorflow/tensorflow/tree/v1.7.0)  
* [grpc/grpc-java:v1.12.0](https://github.com/grpc/grpc-java/tree/v1.12.0)  

## Install
```bash
mvn protobuf:compile
mvn package
```

## Usage
```java
final String host = "127.0.0.1";
final int port = 8500;
ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
PredictionServiceGrpc.PredictionServiceBlockingStub blockingStub = PredictionServiceGrpc.newBlockingStub(channel);
        
PredictRequest request = genRequest();
@SuppressWarnings("unused")
PredictResponse response = blockingStub.predict(request);
```
