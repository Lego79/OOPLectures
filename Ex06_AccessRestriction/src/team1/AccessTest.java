package team1;

import team2.AnotherClass2;

public class AccessTest {
    public int num1;
    private int num2;
    protected int num3;
    int num4;

    public void test1() {System.out.println("test1"); }
    private void test2() {System.out.println("test2");}
    protected void test3() {System.out.println("test3");}
    void test4() {System.out.println("test4");}

    public static void main(String[] args) {
        AccessTest at = new AccessTest();
        at.num1 = 1;
        at.num2 = 2;
        at.num3 = 3;
        at.num4 = 4;

        AnotherClass1 ac1 = new AnotherClass1();
        ac1.num1 = 1;
//        ac1.num2 = 2; // private 이라 다른 클래스에서는 접근이 안됨
        ac1.num3 = 3;
        ac1.num4 = 4;

        AnotherClass2 ac2 = new AnotherClass2(); // ctrl shift O , 자동임포트
//        ac2.num1 = 1;
//        ac2.num2 = 2; //프라이빗
//        ac2.num3 = 3; //프로텍트
//        ac2.num4 = 4; //디폴트

        // 같은 클래스에서는 퍼블릭 프라이빗 프로텍티드 디폴트는 다 접근가능
        // 같은 패키지 안에서는 프라이빗만 접근 불가능
        // 다른 패키지 안에 클래스에는 퍼블릭만 접근가능 .// 디폴트도 안됨



    }
}
