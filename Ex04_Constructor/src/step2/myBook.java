package step2;

class Book {
    String title; // 책 제목
    int price;    // 책 가격

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

        //복제 생성자
        Book(Book copy) {
            title = copy.title;
            price = copy.price;
    }
    void print() {
        System.out.println("제   목:" + title);
        System.out.println("가   격:" + price);
    }

}

public class myBook {
    public static void main(String[] args) {
//        Book book1 = new Book(); // 앞에서 매개변수를 만드는 생성자를 가지고 디폴트 생성자를 만들지 않아서 에러가 남
        Book book1 = new Book("자바 클래스 기초" , 10000); // 매개변수 입력, 객체 생성
        book1.print();

        Book book2 = new Book(book1);
        book2.title = ("자바 디자인 패턴"); // book1 을 복제했기 때문에 10000을 입력하지 않았어도 자동으로 1000원이 출력됨
        book2.print();
    }
}
