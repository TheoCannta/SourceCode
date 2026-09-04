package recursion;

public class TeddyBears {
    public static boolean picnic(int n) {
        if (n == 42) {
            return true;
        } else if (n < 42) {
            return false;
        } else {
            if (n % 2 == 0 && picnic(n / 2)) {
                return true;
            }
            if ((n % 3 == 0 || n % 4 == 0) && picnic(n - ((n % 10) * ((n % 100) / 10)))) {
                return true;
            }
            if (n % 5 == 0 && (picnic(n - 42))) {
                return true;
            }
            return false;
        }
    }

    public static int bears(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else if (n % 3 == 0 || n % 4 == 0) {
            int last = n % 10;
            int second_to_last = (n % 100) / 10;
            return last * second_to_last;
        } else if (n % 5 == 0) {
            return 42;
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        System.out.println(picnic(250));
        System.out.println(picnic(42));
        System.out.println(picnic(84));
        System.out.println(picnic(53));
        System.out.println(picnic(41));
    }
}
