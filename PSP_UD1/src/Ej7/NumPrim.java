package Ej7;

public class NumPrim {
    public static void main(String[] args) {
        for (int j = 1; j <= 100; j++) {
            int n = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    n = n + 1;
                }
            }
            if (n <= 2) {
                System.out.println(j);
            }
        }
    }
}
