
// 클래스에 같음 이름의 메서드가 여러 개 존재
// 함수의 이름과 파라미터를 합쳐서 시그니쳐
// 함수의 이름은 같지만 파라미터가 다른것을 오버로드
class Calc {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a) {
        return a + 1;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Calculation {
    public static void main(String[] args) {
        Calc calc = new Calc();
        // 메서드 호출
        int nReturn1 = calc.add(3,9);
        int nReturn2 = calc.add(3);
        double nReturn3 = calc.add(3.0, 9.0);

        System.out.println("Return1:" + nReturn1);
        System.out.println("Return2:" + nReturn2);
        System.out.println("Return3:" + nReturn3);
    }
}
