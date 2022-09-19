package org.example.strategy;

import java.util.Base64;

public class Base64Strategy implements EncodingStrategy{
    // 베이스64로 인코드하는 전략 생성

    @Override
    public String encode(String text) {
        // 인코드 메소드를 오버라이드하여 베이스64로 인코딩함
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
