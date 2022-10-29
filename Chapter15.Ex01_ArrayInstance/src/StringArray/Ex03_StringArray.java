package StringArray;

public class Ex03_StringArray {
    public static void main(String[] args) {
        String[] name = new String[7];
        name[0] = "홍두";
        name[1] = "홍";
        name[2] = "두";
        name[3] = "카키";
        name[4] = "돌체";
        name[5] = "파채";
        name[6] = "구체";

        int cnum = 0;

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
            cnum += name[i].length();
        }
        System.out.println("총문자의 합 : "+ cnum + "번");
    }
}
