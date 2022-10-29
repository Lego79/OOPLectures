class Marine{
    String name;
    int hp;
    void action() {
        System.out.println("탕탕");
    }
}

public class MyNpc {

    public static void main(String[] args) {
        Marine Marine1 = new Marine();
        Marine1.name = "JIm Raynor";
        Marine1.hp = 40;
        System.out.println(Marine1.name + "hp:" + Marine1.hp);
        Marine1.action();

    }
}





////클래스 정의
//
//class Npc {
//    String.name;
//    int hp;
//    void say() {
//        System.out.println("돌아가세요"");
//    }
//
//}
//
//
//public class MyNpc {
//
//    public static void main(String[] args) {
//        Npc saram1 = new Npc(); // 생성자
//        // 이 객체 변수 안에 있는 멤버에 접근 하려면 dot. 문법을 사용한다
//        saram1.name = "경비";
//        saram1.hp = 100;
//        System.out.println(saram1.name + ":" + saram1.hp);
//        saram1.say();
//    }
//}
//
//
//// Book my book = new Book();


