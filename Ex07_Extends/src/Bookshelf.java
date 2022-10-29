class Book {
    String title;

    void printBook () {
        System.out.println("제   목 : " + title);
    }
}

class Novel extends Book {
    String writer;

    void printNov() { // printNov 메서드는 printBook 메서드를 호출하여 제목호출, 저자 출력
        printBook();
        System.out.println("저   자 : " + writer);
    }
}

class Magazine extends Book {
    int day;

    void printMag() {
        printBook();
        System.out.println("발매일 : " + day + "일");
    }
}

public class Bookshelf {
    public static void main(String[] args) {
        Novel nov = new Novel(); //객체 생성
        nov.title = "홍길동전"; // 상속을 받아서 title이라는 변수를 사용 가능한것
        nov.writer = "허균";

        Magazine mag = new Magazine();
        mag.title = "월간 자바";
        mag.day = 20;

        nov.printNov();
        System.out.println();
        mag.printMag(); // Nov, magazine 을 상속받아서 코드를 구현했 기 때문에 쉽게 느껴졌을것
    }
}
