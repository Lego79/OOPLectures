package GetterSetterTest;

class Marine1 {
       String Class;
    int Hp;
}

class Marine2 {
    public String Class;
    private int Hp;

    public Marine2(String Class, int Hp) {
        this.Hp = Hp;
        this.Class = Class;
    }
    public int getHp() {
        return Hp;
        }

        public void setHp(int Hp) {
        if(Hp < 0 || Hp > 40) {
            System.out.println("범위를 벗어났습니다.");
            this.Hp = 0;
            return;
        }
        this.Hp = Hp;

    }
}

public class PrivateUse {
    public static void main(String[] args) {
        Marine1 marine1 = new Marine1();
        marine1.Class = "Gunner";
        marine1.Hp = 48;
        System.out.printf("%s 체력은 %d 입니다.\n", marine1.Class, marine1.Hp);
    }
}
