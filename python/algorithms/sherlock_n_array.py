# https://www.hackerrank.com/challenges/sherlock-and-array

T = input()  # number of test cases

for _ in range(T):
    N = input()
    A = map(int, raw_input().split())
    has = "YES" if N == 1 else "NO"

    lsum = 0
    rsum = sum(A)

    for i in range(1, N):
        lsum = lsum + A[i-1]
        rsum = rsum - A[i-1]
        if(rsum - A[i] == lsum):
            has = "YES"

    print has
