abstract class Animal {
    int age;
    abstract void cry();
}

class Dog extends Animal {

    void cry() {
        System.out.println("강아지 : 멍멍");
    }

}

class Cat extends Animal {
    void cry() {
        System.out.println("고양이 : 야옹");
    }
}

// 어떤 동물이 울지 알 수 없기 때문에 , 도그와 캣이 상속을 받아서 우는 소리를 설정하는 것

public class AbstractClassEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();

        Cat cat = new Cat();
        cat.cry();

    }
}