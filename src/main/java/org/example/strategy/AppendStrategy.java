package org.example.strategy;

public class AppendStrategy implements EncodingStrategy{
    // 문자열을 추가하는 전략

    @Override
    public String encode(String text) {
        return "ABC" + text;
    }
}
