package team1;

public class Circle {
    final double PI = 3.14; // 파이널을 이용해 상수화
    double rad;

    public void setRad(double r) {
        rad = r;
    }
    // 원의 넓이 반환하는 메서드 생성
    public double getArea() {
        return (rad * rad) * PI; // 원의 넓이를 반환하는 클래스
    }

}
