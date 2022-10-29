package Practice;

abstract class Greet {
    String A = "안녕";
    String B = "하세요!";

    abstract void greet();
}

class greeter extends Greet {
    @Override
    void greet() {
        System.out.println(A + B);
    }
    void welcome() {
        System.out.println(B + A);
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        greeter Hi = new greeter();
        Hi.greet();
        Hi.welcome();

    }
}
