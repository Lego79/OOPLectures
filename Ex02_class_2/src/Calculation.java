// 클래스에 메서드만 있는경우
class Calc {
    int add(int a, int b) {
        return a + b;
    }
} // 동작만을 가진 클래스

public class Calculation {
    public static void main(String[] args ){
        //객체 생성
        Calc calc = new Calc();
        //Calc 타입의 변수 calc, new 로 메모리 주고 () 로 생성자 호출
        // 객체 변수를 통해 메서드 호출
        int nReturn = calc.add(3, 9);
        System.out.println("3 + 9 =" + nReturn );
    }
}
