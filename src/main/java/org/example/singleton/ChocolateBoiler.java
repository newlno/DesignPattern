package org.example.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    // ChocolateBoiler static 객체 생성
    private static ChocolateBoiler uniqueInstance;
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    // 인스턴스 생성을 위한 static 메소드 정의
    public static ChocolateBoiler getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }
    // 채우기
    public void fill(){
        // 비어있다면
        if(isEmpty()){
            empty = false; //내용물을 채운다.
            boiled = false; // 끓이진 않는다.
        }
    }
    // 비우기
    public void drain(){
        if(!isEmpty() && !isBoiled()){ // 비어있지않고, 끓고있는게 아니라면
            empty = true; // 내용물을 비운다
        }
    }
    // 끓이기
    public void boil(){
        if(!isEmpty() && !isBoiled()){ // 비어있지않고, 끓고있는게 아니라면
            boiled = true; // 내용물을 끓인다
        }
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
}