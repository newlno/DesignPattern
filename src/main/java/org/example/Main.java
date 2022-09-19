package org.example;

import org.example.strategy.*;

public class Main {
    public static void main(String[] args) {

        Encoder encoder = new Encoder();
        //base64
        EncodingStrategy base64 = new Base64Strategy();
        //normal
        EncodingStrategy normal = new NormalStrategy();
        //append
        EncodingStrategy append = new AppendStrategy();
        // message
        String message = "Hello World";

        //base64 전략사용
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        // normal 전략사용
        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        // append 전략사용
        encoder.setEncodingStrategy(append);
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }
}