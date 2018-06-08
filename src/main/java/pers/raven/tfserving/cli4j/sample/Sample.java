package pers.raven.tfserving.cli4j.sample;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import tensorflow.serving.PredictionServiceGrpc;
import tensorflow.serving.Predict.PredictRequest;
import tensorflow.serving.Predict.PredictResponse;

public class Sample {
    /**
     * Sample for tensorflow-serving-client4j
     * @param Raven
     */
    public static void main(String [] args) {
        final String host = "127.0.0.1";
        final int port = 8500;
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        PredictionServiceGrpc.PredictionServiceBlockingStub blockingStub = PredictionServiceGrpc
                .newBlockingStub(channel);
        
        PredictRequest request = genRequest();
        @SuppressWarnings("unused")
        PredictResponse response = blockingStub.predict(request);
    }
    
    private static PredictRequest genRequest() {
        // TODO build your Predict Request
        return null;
    }
}
