// https://www.codingninjas.com/codestudio/problems/modular-exponentiation_8230803?challengeSlug=striver-sde-challenge&leftPanelTab=0

public class ModularExponentiation {
    public static int modularExponentiation(int x, int n, int m) {
        return (int) helper((long) x, (long) n, (long) m);
    }

    static long helper(long x, long n, long m) {
        if (n == 0)
            return 1;
        long sq = helper(x, n / 2, m);
        long res = (sq * sq) % m;
        if (n % 2 == 1) return (res * x) % m;
        return res;
    }
}
