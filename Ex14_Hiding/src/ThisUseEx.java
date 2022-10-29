class SimpleBox {
    private int num; // 은닉화

    SimpleBox(int num) {
        this.num = num; //생성자
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {

        this.num = num; // 이 this 는 private int num 에 있는 num을 가리키는 것이다
        // this로 이름이 같지만 구분을 해주는 것임
    }
}

public class ThisUseEx {
    public static void main(String[] args) {
        SimpleBox box = new SimpleBox(1); // 생성자의 새로운 매개변수 = box 5로 box 파라미터에 넘겨준것것
       box.setNum(10);
        System.out.println(box.getNum());
    }
}
