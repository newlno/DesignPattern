package org.example.singleton;

public class exSingleton {

    private static exSingleton uniqueInstance;
        // 싱글톤 클래스의 하나뿐인 인스턴스를 저장하는 정적변수

    private exSingleton(){
        // 싱글톤패턴은 기본생성자를 통해 생성할 수 없도록 프라이빗으로 막아야한다.
    }

    public static exSingleton getInstance() {
        //클래스의 인스턴스를 만들어 리턴하는 메소드 생성
        if(uniqueInstance == null) {
            uniqueInstance = new exSingleton();
            // 메소드 호출시 인스턴스가있는지 확인하고 만약 없다면
            // 유일무이한 싱글톤 인스턴스를 그대로 전달한다.
        }
        return uniqueInstance;
    }

    public void connect() {
        System.out.println("connect");
        // 기타 메소드
    }

}
