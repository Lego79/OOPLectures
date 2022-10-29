package step2;

interface Shooting {
    void shot();
}

interface hitting {
    void hit();
}

class Mar implements Shooting, hitting {
    @Override
    public void shot() {
        System.out.println("총을 쏘세요");
    }

    @Override
    public void hit() {
        System.out.println("치세요");
    }
}

public class Meet{
    public static void main(String[] args) {
        Mar A = new Mar();
        A.hit();
        A.shot();


    }
}























//
//interface Greet {
//    void greet();
//}
//
//interface Bye extends Greet{
//    void bye();
//}
//
//
//class Morning implements Bye {
//
//    public void bye() {
//        System.out.println("안녕히 계세요");
//    }
//
//    public void greet() {
//        System.out.println("안녕하세요");
//    }
//}
//
//
//
//public class Meet {
//    public static void main(String[] args) {
//        Morning morning = new Morning();
//        morning.greet();
//        morning.bye();
//
//    }
//}
