package org.example.strategy;

public class NormalStrategy implements EncodingStrategy{
    // 인코딩 없는 노말 전략 생성

    @Override
    public String encode(String text) {
        return text;
    }
}
