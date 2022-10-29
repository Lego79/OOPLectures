abstract class Calc {
    int a = 5;
    int b = 6;

    abstract void plus();
} // 슈퍼클래스, 서브클래스 만들어 상속관계 만듬

class MyCalc extends Calc {
    @Override
    void plus() {System.out.println(a + b);}
    void minus() {
        System.out.println(a - b);
    }
} // 추상메서드 오버라이딩 하기


public class Polymorphism1 {
    public static void main(String[] args) {
        MyCalc myCalc1 = new MyCalc();
        myCalc1.plus();
        myCalc1.minus();

        // 하위 클래스 객체를 상위 클래스 객체에 대입
        Calc myCalc2 = new MyCalc();
        myCalc2.plus();
//        myCalc2.minus(); // 에러가 나는 이유, 클래스에 정의되어 있지 않다, 설계도에 없다.
    }
}
