# tensorflow-serving-client4j

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
