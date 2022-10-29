// 클래스에 필드만 있는 경우
class Book {
    String title;
    String author;
    int price;
}

public class MyBook {
    public static void main(String[] args) {
        Book book = new Book();
        //필드접근
        book.title = "클래스의 기초";
        book.author = "홍말리";
        book.price = 7000;

        System.out.println(book.title + "," +
                            book.author + "," +
                            book.price);

    }
}
