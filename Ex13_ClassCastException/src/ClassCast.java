class PBoard {}
class CBoard extends PBoard {}



public class ClassCast {

    public static void main(String[] args) {
        PBoard sbd1 = new CBoard();
        CBoard sbd2 = new (CBoard)sbd1; // ok!

        System.out.println("----------------");

        PBoard ebd1 = new PBoard();
        CBoard ebd2 = (CBoard)ebd1; // exception!
    }
}
