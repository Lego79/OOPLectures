package step2;

class Book {
    String title;
}

public class HeapUse {

    public static void main(String[] args) {
        Book book1 = new Book(); // 새로운 객체가 만들어져 book1 참조변수에 참조가 되어있음
        Book book2 = new Book(); // 새로운 객체 ""     ""              ""

        book1.title = "자바 클래스 기초"; //각각의 참조변수 이용하여 title에 내용입력 하고 출력하는 프로그램램
        book2.title = "자바 디자인 패턴";

        System.out.println(book1.title);
        System.out.println(book2.title);

        book1 = null;
        book2 = null;
    }
}