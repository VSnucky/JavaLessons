package mypackage.com;

public class Main {

    public static void main(String[] args) {
        double c = doCalculate(21, 1, 51, 13);
        boolean l = doLimit(45, 1);
        doCompare(11);
        doCompare2(-32);
        printMyText("Vova");
        doCount((short) 1300);
    }
    private static void doDatatype(){
        int i = 9999;
        byte b = 127;
        long l = 99999999L;
        float f = 52.24f;
        double d = 321.12D;
        short s = 24532;
        char c = 'c';
        boolean boof = false;
        boolean boot = true;

        System.out.println("int = " + i);
        System.out.println("byte = " + b);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("char = " + c);
        System.out.println("boolean false = " + boof);
        System.out.println("boolean true = " + boot);
    }
    static double doCalculate(int a, int b, int c, int d){
        return (a * (b + (c / d)));
    }
    static boolean doLimit (int x, int z) {
        int amount = (x + z);
        if (amount > 20 && amount <10) {
            return false;
        }
        else {
            return true;
        }
    }
    static void doCompare(int i1) {
        if (i1 <= 0){
            System.out.println("Число меньше нуля");
        }
        else {
            System.out.println("Число больше нуля");
        }
    }
    static boolean doCompare2(int i2) {
        return (i2 < 0);
    }
    static void printMyText(String txtToPrint) {
        System.out.println("Привет, " + txtToPrint + "!");
    }
    static void doCount(short year) {
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        }
        else {
            System.out.println(year + " не является високосным");
        }
    }

}