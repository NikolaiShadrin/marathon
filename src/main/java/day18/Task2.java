package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237)); // 5

    }

    public static int count7(int s) {
        if (s == 0) {
            return 0;
        }

        if (s % 10 == 7) {
            return 1 + count7(s/10);
        } else {
            return count7(s/10);
        }
    }
}
