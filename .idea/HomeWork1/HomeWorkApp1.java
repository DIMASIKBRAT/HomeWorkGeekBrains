public class HomeWorkApp2 {

    public static void main(String[] args) {

        System.out.println(methodFive(0));
        methodFour("Привет", 4);
        methodThree(-4);
        methodTwo(-4);
        methodOne(2, 7);
    }

    private static boolean methodOne(int b, int c) {

        int summ = b + c;
        if (summ <= 20 && summ >= 10) {
            return true;
        }
        return false;
    }

    private static void methodTwo(int i) {

        if (i >= 0) {
            System.out.println("Число положительное: " + i);
        } else {
            System.out.println("Число отрицательное: " + i);
        }

    }

    private static boolean methodThree(int l) {

        if (l > 0) {
            return true;
        }

        return false;
    }

    private static void methodFour(String str, int e) {

        for (int i = 0; i < e; i++) {
            System.out.println(str);
        }
    }

    private static boolean methodFive(int year) {

        if (year > 0 && year % 4 == 0
                && year % 100 != 0
                ^ year % 400 == 0) {
            return true;
        }
        return false;
    }
}
