// Problem: https://leetcode.com/problems/count-primes/


class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] prime = new boolean[n+1];

        for (int i=0; i<=n; i++) {
            prime[i] = true;
        }

        for (int p=2; p*p <= n; p++) {
            if (prime[p] == true) {
                for (int j=p*p; j<=n; j+=p) {
                    prime[j] = false;
                }
            }
        }

        for (int i=2; i<n; i++)
            if (prime[i] == true)
                ++count;

        return count;
    }
}