package org.example.strategy;

public class Encoder {

    private EncodingStrategy encodingStrategy;
    // 그때그때 전략을 받기 위해 선언

    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);
    }
    // 각각의 전략에 따라 값이 달라짐
    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

}
