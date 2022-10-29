package step3;

class Book {
    String title;
}

public class HeapUse {

    public static void main(String[] args) {
        Book book1 = new Book(); // 새로운 객체 생성 book1 참조변수, Heap 에 있는 객체 참조 하고 있음
        book1.title = "자바 클래스 기초"; // title 에 내용 할당당
        Book book2 = book1; // 두개가 똑같은 객체를 참조하고 있기 때문에 같은 내용이 출력

        System.out.println("book1.title : " + book1.title);
        System.out.println("book2.title : " + book2.title);
        System.out.println("------------------------------");

        book2.title = "자바 디자인 패턴"; // 같은 객체를 참조하는 참조 변수의 경우 값을 잘못 바꾸면 참조하고있는 객체의 모든 값이 변하기 때문에 조심해야 한다.

        System.out.println("book1.title : " + book1.title);
        System.out.println("book2.title : " + book2.title);
    }

}
