package step1;

class Book{
    String title; //  책제목
    int price; // 책 가격
    int num; // 주문 수량

    Book() {
        title = "자바 클래스 기초";
        price = 10000;
        // 이렇게 설정하면 Book 클래스가 생성될 때 title과 price 변수가 초기값을 가지게 됨
    }

        Book(String title , int price) { // 생성자에서 이 객체 사용
            this.title = title; //매개변수로 들어온 title을 대입
            this.price = price; //매개변수로 들어온 price를 대입
        }
            // 여기서 this는 class Book에 지시된 title, price 변수를 가르키기 위한 것
            // 대입된 title, price 는 Book(String title, int price) 를 가르킴
        void print() {
            System.out.println("제     목 :" + title);
            System.out.println("가     격 " + price);
            System.out.println("주문수량 :" + num);
            System.out.println("합계금액 :" + price * num);
        }

    }


public class MyBook {
    public static void main(String[] args) {
        Book book = new Book("자바 디자인 패턴", 20000); // 요부분이 생성자
        book.num = 5;
        book.print();
    }
}


//package step1;
//
//class Book {
//    String title;	// 책 제목
//    int price;		// 책 가격
//    int num;		// 주문 수량
//
//    // 디폴트 생성자 :
//    // 사용자가 만들지 않아도 컴파일러가 자동으로 만든다.
//    // - 파라미터(매개변수)도 없고 동작도 없는 생성자
//    // 1.클래스 이름과 같다.
//    // 2.리턴형 타입이 없다.
//    Book() {
//        title = "자바 클래스 기초";
//        price = 10000;
//    }
//
//    Book(String title, int price) {
//        this.title = title;
//        this.price = price;
//    }
//
//    void print() {
//        System.out.println("제    목 : " + title);
//        System.out.println("가    격 : " + price);
//        System.out.println("주문수량 : " + num);
//        System.out.println("합계금액 : " + price * num);
//    }
//}
//
//public class MyBook {
//
//    public static void main(String[] args) {
//
//        //Book book = new Book();
//        Book book = new Book("자바 디자인 패턴", 20000);
//        book.num = 5;
//        book.print();
//    }
//}

//생성자란 오브젝트 생성과 함께 자동적으로 호출되는 특수한 메서드이다.
//
//생성자는 클래스 이름과 같은 메서드명을 가진다.
//생성자는 메서드이지만 리턴형이 없다.
//
//디폴트 생성자(파라미터 없는 애)는 자동으로 생성된다.
//
//파라미터가 있는 생성자를 만들면 (오버로딩하면)
//디폴트 생성자가 자동으로 생성되지 않는다.

