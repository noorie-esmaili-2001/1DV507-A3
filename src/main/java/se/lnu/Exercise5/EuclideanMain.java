package se.lnu.Exercise5;

public class EuclideanMain {

    public static int gcd(int M, int N) {
        if (M == 0) {
            return N;
        }
        return gcd(N % M, M);
    }

    public static void main(String[] args) {
        int M = 18;
        int N = 12, g;
        g = gcd(M, N);
        System.out.println("GCD(" + M + "," + N + ") = " + g);

        M = 42;
        N = 56;
        g = gcd(M, N);
        System.out.println("GCD(" + M + "," + N + ") = " + g);

        M = 9;
        N = 28;
        g = gcd(M, N);
        System.out.println("GCD(" + M + "," + N + ") = " + g);
    }

}
